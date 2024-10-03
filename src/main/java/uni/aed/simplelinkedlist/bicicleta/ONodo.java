package uni.aed.simplelinkedlist.bicicleta;
//geneta el nodo de la lista simplemnente enlazada de objetos
public class ONodo {
    private Object data;//atributo Object data
    private ONodo next;//puntero next 
    //constructor del nodo tipo Object
    public ONodo(Object data) {
        this.data = data;//inicializa el atributo tipo object
        this.next=null;//puntero next a null
    }
    //instanacia el atributo 
    public void setData(Object data) {
        this.data = data;
    }
    //instanaci el puntero next 
    public void setNext(ONodo next) {
        this.next = next;
    }
    //consulta la data del nodo
    public Object getData() {
        return data;
    }
    //consulta el puntero del nodo
    public ONodo getNext() {
        return next;
    }
}
