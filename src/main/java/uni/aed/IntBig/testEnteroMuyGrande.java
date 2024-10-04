
package uni.aed.IntBig;

import java.math.BigInteger;

public class testEnteroMuyGrande {
    public static void main(String[] args){
        //PASO 1: IMPLEMENTACION DE CONSTRUCTORES Y EL METODO aString
        System.out.println("PRUEBA DE PASO 1\n");
        EnteroMuyGrande[] eg=new EnteroMuyGrande[7];
        eg[0]=new EnteroMuyGrande(123456789);
        eg[1]=new EnteroMuyGrande(-45);
        eg[2]=new EnteroMuyGrande("123456789012344");
        eg[3]=new EnteroMuyGrande("-0004000000");
        eg[4]=new EnteroMuyGrande(-3458);
        eg[5]=new EnteroMuyGrande(-0000);
        eg[6]=new EnteroMuyGrande();
        
        for(int i=0;i<eg.length;i++){
            System.out.println(i+": "+eg[i].toString());
        }
           
       
        //PASO 2: IMPLEMENTACION DE SUMA
//        EnteroMuyGrande e1,e2,esum;
//        BigInteger b1,b2, bsum;
//        e1=new EnteroMuyGrande("123450006789");
//        e2=new EnteroMuyGrande("987654321");
//        esum=e1.suma(e2);
//        
//        b1=new BigInteger("123450006789");
//        b2= new BigInteger("987654321");
//        bsum=b1.add(b2);
//        
//        if(bsum.compareTo(new BigInteger(esum.toString()))==0){
//            System.out.println("Bien");
//        }else{
//            System.out.println("Mal");
//        }
//        

/////////////////////////

//        String arregloCad[]={"1000005000",
//                          "9182734738218170000000072817",
//                          "8000",
//                          "3283748300000",
//                          "7",
//                          "100005000",
//                          "2147483645",
//                          "2147480000",
//                          "1000000000000000000000000000000000"};
//        
//        EnteroMuyGrande e1;
//        EnteroMuyGrande e2;
//        EnteroMuyGrande e3;
//        
//        BigInteger bi1;
//        BigInteger bi2;
//        BigInteger bi3;
//        
//        int errorCnt = 0;
//        
//        for(int i=0; i<arregloCad.length;i++){
//            for(int j=0;j<arregloCad.length;j++){
//                e1=new EnteroMuyGrande(arregloCad[i]);
//                e2=new EnteroMuyGrande(arregloCad[j]);
//                
//                bi1=new BigInteger(arregloCad[i]);
//                bi2=new BigInteger(arregloCad[j]);
//                
//                System.out.println("\n");
//                System.out.println("Para numeros pares: i= "+i+" j= "+j);
//                System.out.println("e1: "+e1.toString()+" ");
//                System.out.println("e2: "+e2.toString()+" ");
//                //-------------SUMA POSITIVA-------------------------//
//                e3=e1.suma(e2);
//                bi3=bi1.add(bi2);
//                
//                System.out.println("Resultado: "+e3.toString()+"  ");
//                if(bi3.compareTo(new BigInteger(e3.toString()))!=0){
//                    errorCnt++;
//                    System.out.println("Fallo la suma");
//                }
//            }
//        }
//        
//        System.out.println("\n\n Test Resultado: "+(errorCnt==0?"Exito":errorCnt+" errores"));
        
        
        //PASO 3: IMPLEMENTACION DE RESTA
        
        String arregloCad[]={"1000005000",
                          "9182734738218170000000072817",
                          "8000",
                          "3283748300000",
                          "7",
                          "100005000",
                          "2147483645",
                          "2147480000",
                          "1000000000000000000000000000000000"};
        
        EnteroMuyGrande e1;
        EnteroMuyGrande e2;
        EnteroMuyGrande e3;
        
        BigInteger bi1;
        BigInteger bi2;
        BigInteger bi3;
        
        int errorCnt = 0;
        
        for(int i=0; i<arregloCad.length;i++){
            for(int j=0;j<arregloCad.length;j++){
                e1=new EnteroMuyGrande(arregloCad[i]);
                e2=new EnteroMuyGrande(arregloCad[j]);
                
                bi1=new BigInteger(arregloCad[i]);
                bi2=new BigInteger(arregloCad[j]);
                
                System.out.println("\n");
                System.out.println("Para numeros pares: i= "+i+" j= "+j);
                System.out.println("e1: "+e1.toString()+" ");
                System.out.println("e2: "+e2.toString()+" ");
                //-------------RESTA POSITIVA-------------------------//
                e3=e1.resta(e2);
                bi3=bi1.subtract(bi2);
                
                System.out.println("Resultado: "+e3.toString()+"  ");
                if(bi3.compareTo(new BigInteger(e3.toString()))!=0){
                    errorCnt++;
                    System.out.println("Fallo la suma");
                }
            }
        }
        
        System.out.println("\n\n Test Resultado: "+(errorCnt==0?"Exito":errorCnt+" errores"));
        
        
        
        
    }
}
