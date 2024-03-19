package isacc;


public class Producto{
    private String nombre;
    private int precioP;
    private int totalP;
    private long  codigoP;
    public Producto(){

    }
    
    public Producto(String nombre,int precio,int total,long codigo){
        this.nombre = nombre;
        this.precioP= precio;
        this.totalP = total;
        this.codigoP = codigo;
    }

    public void  setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
         return nombre;
    }
    public void setPrecio(int precio){
            this.precioP = precio;
    }
    public int getPrecio() {
        return precioP;
    }
    public void setTotal(int total){
        this.totalP=total;
    }
    public  int getTotal() {
        return totalP;
    }
    public void setCodigo(long c) {
       this.codigoP = c;
    }
    public long getCodigo() {
        return codigoP;
    }
}