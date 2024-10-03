
package uni.aed.IntBig;
import java.util.HashSet;
import java.util.Set;

public class EnteroMuyGrande {
    //                                   PASO 1: IMPLEM  CONSTRUCTORES Y METODO aString
    private static final char MENOS='-';
    private Nodo cabeza;
    private byte signo;
    
    public EnteroMuyGrande(){
        Nodo bloque=new Nodo();
        cabeza=bloque;
    }
    
    public EnteroMuyGrande(long valor){
        Nodo bloque=new Nodo(valor);
        cabeza=bloque;
    }
    
    public EnteroMuyGrande(String valor) {
        valor.trim();//elimina espacios en blanco al inicio y final de la cadena
        signo=+1;
        if(valor.charAt(0)==MENOS){//pregunta si el primer caracter es MENOS, aca le quitamos el signo y lo guardamos
            signo=-1;//guarda el signo del numero
            valor=valor.substring(1);//remueve el primer caracter
        }
        valor=extraeCerosPrecedentes(valor);
        if(valor.equals("0")){
            signo=+1;//el patron de entrada  \-0 +0\+0+ se convierte
                     // +0 internamente
        }
        
        cabeza = new Nodo();//usa un nodo cabeza ficticio
        Nodo cola= cabeza;
        String digitos;
        while(!valor.equals("")){//pregunta si valor es diferente de vacio " "
            int loc =Math.max(valor.length()-Nodo.getDIGITOS_MAX(),0);
            digitos= valor.substring(loc);//corta los ultimos 3 digitos
                                                   //corta todo si < 3 digitos
            valor=valor.substring(0,loc);//si loc==0, el numero se convierte en " "
            Nodo bloque=new Nodo(digitos);
            cola.setSiguiente(bloque);
            cola=bloque;                                                          
        }
        cabeza=cabeza.getSiguiente();//remueve el nodo ficticio
    }
    //extrae ceros precedentes
    private String extraeCerosPrecedentes(String str) {
        StringBuffer strBuf=new StringBuffer(str);
        int length=strBuf.length();
        for(int i=0;i<length;i++){
            if(strBuf.charAt(0)=='0'){
                strBuf.deleteCharAt(0);
            }
        }
        if(strBuf.length()==0){
            strBuf.append('0');
        }
        return strBuf.toString();
    }
    
    //aString que regresa la representacion en cadena de un objeto
    public String aString(){
        StringBuffer strBuf=new StringBuffer("");
        String formato="%0"+Nodo.getDIGITOS_MAX()+"d";
        Nodo p= cabeza;
        while(p.getSiguiente()!=null){
            //rellena los 0 precedentes si los digitos estan en medio del numero
            strBuf.insert(0,String.format(formato, p.getValor()));
            p=p.getSiguiente();
        }
        strBuf.insert(0,p.getValor());//procesa el nodo mas significativo
                                              //no rellena los 0 precedentes para este nodo
        if(signo<0){
            strBuf.insert(0,"-");
        }
        return strBuf.toString();
    }
    
    @Override
    public String toString() {
        // Sobrescribe toString() para devolver el valor del número como cadena
        return aString();
    }
    
    //                                   PASO 2: IMPLEMENTACION DE SUMA BASICA
    public EnteroMuyGrande(Nodo cabeza){
        this.cabeza=cabeza;
        this.signo=+1;
    }
    public EnteroMuyGrande suma(EnteroMuyGrande num){
        return this.sumaPos(num);//TEMP -- suma solo dos valore positivos
    }
    //suma las posiciones 
    private EnteroMuyGrande sumaPos(EnteroMuyGrande num){
        Nodo p,q,r,t;
        p=this.cabeza;
        q=num.cabeza;
        t=new Nodo(); //nodo cabezera ficticio
        r=t;
        short acarreo=0;
        while(p!=null && q!=null){
            short sum=(short)(acarreo+p.getValor()+q.getValor());
            r.setSiguiente(new Nodo());
            r=r.getSiguiente();
            r.setValor((short)(sum % Nodo.getVALOR_MAX()));
            acarreo=(short) (sum / Nodo.getVALOR_MAX());
            p=p.getSiguiente();
            q=q.getSiguiente( );
        }
        p = (p==null) ? q : p; //restablece p para q apunnte a los bloques restantes
        
        while(p!=null){
            r.setSiguiente(new Nodo());
            r=r.getSiguiente();
            r.setValor((short)((p.getValor()+acarreo)%Nodo.getVALOR_MAX()));
            acarreo=(short)((p.getValor()+acarreo)/Nodo.getVALOR_MAX());
            p=p.getSiguiente();
        }
        if(acarreo>0){
            r.setSiguiente(new Nodo((short) acarreo));
        }
        return new EnteroMuyGrande(t.getSiguiente());
    }
    
    //                                 PASO 3: IMPLEMENTACION DE RESTA BASICA
    
    
    private int comparaA(EnteroMuyGrande num){
        EnteroMuyGrande L= this;
        EnteroMuyGrande R=num;
        if(L.esPositivo() && R.esNegativo() ){
            return +1;
        }
        if(L.esNegativo() && R.esPositivo()){
            return -1;
        }
        
        String Lstr=L.toString();
        String Rstr=R.toString();
        
        int result;
        int lengthL=Lstr.length();
        int lengthR=Rstr.length(); 
        
        //primero se verifica la magnitud
        if(lengthL==lengthR){
            result=Lstr.comparaA(Rstr);
        }else{
            result=(lengthL<lengthR)?-1:+1;
        }
        
        
        
        
        
        return 1;
    }
    //verifica si el numero es positivo
    private boolean esPositivo(){
        return signo>0;
    }
    
    //verifica si el numero es negativo
    private boolean esNegativo(){
        return signo<0;
    }
    private EnteroMuyGrande negativo(){
        signo=(byte) -signo; //el signo - es int asi q se nesecita conversion
        return this;
    }
    
}
