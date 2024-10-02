package uni.aed.doublelinkedlist;
public class DoubleLinkedList {
    private DNodo head;//puntero cabezera
    private DNodo ultimo;//puntero ultimo
    private int lenght=0;//long de la lista, inicializada en 0

    //entrega puntero que se le indica en pos
    public DNodo getNodo(int pos) {
        DNodo current=head;
        for(int i=0;i<pos;i++)
            current=current.getNext();
        return current;
    }
    //añadir elemento en la parte frontal de la lista
    public void addFirst(int data){
        DNodo newNodo=new DNodo(data);
        if(head==null){
            head=newNodo;
            ultimo=newNodo;
        }else{
            newNodo.setNext(head);
            head.setPrev(newNodo);
            head=newNodo;            
        }
        lenght++;
    }
    //añadir elemento en la parte final de la lista
    public void addLast(int data){
        DNodo newNodo=new DNodo(data);
        if(ultimo==null){
            head=newNodo;
            ultimo=newNodo;
        }else{
            newNodo.setPrev(ultimo);
            ultimo.setNext(newNodo);
            ultimo=newNodo;
        }
        lenght++;
    }
    //elimina dato de la lista si exite
    public void remove(int data){
        DNodo current=head;
        //buscando el elemento a eliminar
        while(current!=null && current.getData()!=data)
            current=current.getNext();
        //encontro la data a eliminar
        if(current!=null){
            if(current==head){//si el nodo a eliminar es el primero de la lista
                head=head.getNext();
                if(head!=null)
                    head.setPrev(null);
                else
                    ultimo=null;
            }else if(current==ultimo){//si el nodo a eliminar es el ultimo de la lista
                ultimo=current.getPrev();
                ultimo.setNext(null);
            }else{//si el nodo a eliminar se encuentra en el cuerpo de la lista
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());                
            }
            lenght--;            
        }
    }
    //borra la lista por completo
    public void clear(){
        head=null;
        ultimo=null;
        lenght=0;
    }
    //pregunta si la lista esta vacia
    public boolean isEmpty(){
        return(lenght==0);
    }
    public int size(){
        return lenght;
    }
    //ploeto de la lista completa
    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        DNodo current=head;
        while(current!=null){
            if(!str.isEmpty())
                str.append("<->");
            str.append(current.getData());
            current=current.getNext();
        }
        return str.toString();
    }
    
}
