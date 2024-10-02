package uni.aed.simplelinkedlist;
public class SimpleLinkedList {
    private static final int OUT_OF_LIMIT = -1;
    private static final int NOT_FOUND = -1;
    private static final int EXITO = 1;
    private Nodo head;
    private int lenght=0;
    //adiciona elemento en primer elemento en la lista
    public void addFirst(int data){
        Nodo newNodo=new Nodo(data);
        newNodo.setNext(head);
        head=newNodo;
        lenght++;
    }
    //adiciona elemento en la posicion indicada de la lista(posicion inicia en 0)
    public int addToPosition(int position, int data){
        Nodo newNodo=new Nodo(data);
        Nodo current;
        int index=0;
        if(position<0 || position>lenght)
            return OUT_OF_LIMIT;
        if(position==0)
            addFirst(newNodo.getData());
        else{
            current=head;
            index=0;
            while(index<position -1){
                current=current.getNext();
                index++;
            }
            newNodo.setNext(current.getNext());
            current.setNext(newNodo);
            lenght++;
        }
        return EXITO;            
    }
    //ingresa valor al final de lista
    public void addLast(int data){
        Nodo newNodo=new Nodo(data);
        if(head==null){
            head=newNodo;
            lenght++;
            return;}
        Nodo current=head;
        while(current.getNext()!=null)
            current=current.getNext();
        current.setNext(newNodo);
        lenght++;
    }
    //busqueda de valor en la lista
    public int search(int key){
        Nodo temp=head;
        boolean isFound=false;
        int index=0;
        while(temp!=null && isFound==false){
            if(temp.getData()==key)
                isFound=true;
            else{
                temp=temp.getNext();
                index++;
            }
        }
        if(isFound==true)
            return index;
        else
            return NOT_FOUND;
    }
    //remueve valor de la lista
    public void remove(int data){
        if(head==null)
            return;
        //si el elemento a eliminar es el primer nodo
        if(head.getData()==data){
            head=head.getNext();
            lenght--;
            System.out.println("Dato eliminado correctamente\n");
            return;
        }
        //si el elemento a eliminar no es el primer nodo
        Nodo current=head;
        while(current.getNext()!=null && 
                current.getNext().getData()!=data)
            current=current.getNext();
        
        if(current.getNext()!=null){
            current.setNext(current.getNext().getNext());
            lenght--;
            System.out.println("Dato eleminado correctamente\n");
            return;
        }
        System.out.println("El dato a eliminar no esta en lista\n");
    }    
    //elimina lista por completo
    public void clear(){
        head=null;
        lenght=0;
    }
    //pregunta si la lista esta vacia
    public boolean isEmpty(){
        return(lenght==0);
    }
    //indica el tamaño de la lista
    public int size(){
        return lenght;
    }
    //plotea valores de lista
    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        Nodo current=head;
        while(current!=null){
            if(!str.isEmpty())
                str.append("->");
            str.append(current.getData());
            current=current.getNext();
        }
        return str.toString();
    }
    
    public String displayReverse(){
        StringBuilder str=new StringBuilder();
        Nodo temp=head;
        if(isEmpty()==false)
            reverse(temp,str);
        return str.toString();
    }
    private void reverse(Nodo temp, StringBuilder str){
        if(temp.getNext()!=null)
            reverse(temp.getNext(),str);
        str.append(temp.getData());
        str.append("->");        
    }
    
    
}
