public class productosDosX {

    private String nombreProducto;
    private int precio;
    private int cantidadProducto;
    private long idProducto; 
public productosDosX(){

}

public productosDosX(String nombre,int precio,int cantidad,long id){
    this.nombreProducto = nombre;
    this.precio = precio;
    this.cantidadProducto= cantidad;
    this.idProducto = id;
}
//Metodos Getter y Setter

public void setNombre(String nombre) {
    this.nombreProducto =nombre;
}
public String getNombre() {
    return nombreProducto;
}

public void setPrecio(int precio) {
    this.precio = precio;
}
public int getPrecio() {
    return precio;
}

public void setCantidad(int Cantidad) {
    this.cantidadProducto = Cantidad;
}
public int getCantidad() {
    return cantidadProducto;
}
public void setCodigo(long codigo){
    this.idProducto = codigo;	
}
public long getCodigo() {
    return idProducto;
}
}