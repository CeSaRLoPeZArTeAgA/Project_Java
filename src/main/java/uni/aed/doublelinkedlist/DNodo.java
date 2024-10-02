package uni.aed.doublelinkedlist;
public class DNodo {
    private int data;//atributo de dato del nodo
    private DNodo next;//apuntador al nodo siguiente
    private DNodo prev;//apuntador al nodo anterior
    //constructor con ingreso del dato y apuntadores a null ambos
    public DNodo(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    //instancia manualmente el dato del nodo
    public void setData(int data) {
        this.data = data;
    }
    //instancia manualmente puntero next
    public void setNext(DNodo next) {
        this.next = next;
    }
    //instancia manualmente puntero prev
    public void setPrev(DNodo prev) {
        this.prev = prev;
    }
    //recubera valor del nodo
    public int getData() {
        return data;
    }
    //recupera puntero next
    public DNodo getNext() {
        return next;
    }
    //recupera puntero prev
    public DNodo getPrev() {
        return prev;
    }
    //para plotear los nodos
    @Override
    public String toString() {
        return "DNodo{" + "data=" + data + ", next=" + next + ", prev=" + prev + '}';
    }
}
