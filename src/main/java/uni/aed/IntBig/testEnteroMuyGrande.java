
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
        EnteroMuyGrande e1,e2,esum;
        BigInteger b1,b2, bsum;
        e1=new EnteroMuyGrande("123450006789");
        e2=new EnteroMuyGrande("987654321");
        esum=e1.suma(e2);
        
        b1=new BigInteger("123450006789");
        b2= new BigInteger("987654321");
        bsum=b1.add(b2);
        
        if(bsum.compareTo(new BigInteger(esum.toString()))==0){
            System.out.println("Bien");
        }else{
            System.out.println("Mal");
        }
            
        
        
    }

    
}
