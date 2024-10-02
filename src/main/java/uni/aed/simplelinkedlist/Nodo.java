package uni.aed.simplelinkedlist;
//ESTRUCTURA DE NODO PARA LISTA SIMPLE
public class Nodo {
    
    private int data;//atributo de dato del nodo
    private Nodo next;//atributo de puntero q apunta a siguiente nodo

    public Nodo(int data) {//constructor
        this.data = data;//inicializa el nodo
        this.next = null;//inicializa puntero a null
    }

    public void setData(int data) {//cambia valor del valor nodo
        this.data = data;
    }

    public void setNext(Nodo next) {//cambia el valor del puntero al puntero ingresado
        this.next = next;
    }

    public int getData() {//retorna valor del nodo
        return data;
    }

    public Nodo getNext() {//retorna valor del puntero
        return next;
    }
}
