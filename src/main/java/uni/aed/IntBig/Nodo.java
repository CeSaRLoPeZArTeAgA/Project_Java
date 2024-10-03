package uni.aed.IntBig;
public class Nodo {
    private static final short  DIGITOS_MAX=3;//numero digitos a almacenar por bloque = 3
    private static final short  VALOR_MAX=1000;//intervalo de valores almacenados en un bloque
    private short valor;//varia de 0 a RANGO_VALOR - 1
    private Nodo siguiente;//puntero al nodo siguiente

    //constructor con inicializacion de un entero largo
    public Nodo(short valor) {
        this.valor = valor;
        this.siguiente=null;
    }
    //cosntructor con inicializacion de una cadena
    public Nodo(String str) {
        this.valor = Short.parseShort(str);
        this.siguiente=null;
    }
    //constructor sin parametros, inicializa internamente con el numero 0
     public Nodo() {
        this.valor = Short.parseShort("0");
        this.siguiente=null;
    }
     //funcion que devuelve valor de DIGITOS_MAX
    public static short getDIGITOS_MAX() {
        return DIGITOS_MAX;
    }
     //funcion que devuelve valor de DIGITOS_MAX
    public static short getVALOR_MAX() {
        return VALOR_MAX;
    }
    //funcion que devuelve valor
    public short getValor() {
        return valor;
    }
    //funcion que devuelve puntero siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }
    //instancia valor
    public void setValor(short valor) {
        this.valor = valor;
    }
    //instancia nodo siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
