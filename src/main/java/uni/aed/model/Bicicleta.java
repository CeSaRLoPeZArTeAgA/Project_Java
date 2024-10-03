package uni.aed.model;

public class Bicicleta implements Comparable{
    //atributo String nomPropietario
    private String nomPropietario;
    
    //constructor de la clase con el nomPropietario
    public Bicicleta(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }
    
    //instaciamos el atributo nomPropietario
    public void setNomPropietario(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }
    //entrega valor de nomPropietario de la clase
    public String getNomPropietario() {
        return nomPropietario;
    }
    //escritura de la clase
    @Override
    public String toString() {
        return "Bicicleta{" + "nomPropietario=" + nomPropietario + '}';
    }
    //compara
    @Override
    public int compareTo(Object o) {//1(o1>o2),0(o1=o2),-1(o1<o2)
        return compareTo((Bicicleta)o);
    }
    
    private int compareTo(Bicicleta o){
        String o2=o.getNomPropietario();
        return this.nomPropietario.compareTo(o2);
    }
    
}
