import java.util.ArrayList;
import java.util.Scanner;

public class DosX {
    static int j;
      static Scanner guardar=new Scanner(System.in);
    static ArrayList<productosDosX>lista= new ArrayList<>();

    public static void seleccionarOperacion(){
        int opcion;
        System.out.println("sistema de Dos X");
        System.out.println("1-agregar Dos X");
        System.out.println("2-actualizar producto dos x");
        System.out.println("3-eliminar  producto dos x");
        System.out.println("4-ver productos 2X");
        opcion=guardar.nextInt();

        switch (opcion) {
            case 1:
                agregarProductosDosX();
                break;
            case 2:
            editarProducto(lista);
                break;
            case 3:
                eliminarProducto(lista);
                break;
            case 4:
                mostrarProductos();
                break;
            default:
                break;
        }
    }

 
     public static void agregarProductosDosX(){
        String nombre;
        int precio;
        int cantidad;
        long id;
        lista.add(new productosDosX("lata",12,100,129382382));
        lista.add(new productosDosX("mega",42,300,17666682));
        lista.add(new productosDosX("ultra",12,100,13444482));
        lista.add(new productosDosX("superior",12,100,1211113382));

        System.out.println("ingrese el nombre del producto: ");
        nombre =guardar.next();
        
        System.out.println("Ingrese el precio  del producto "+nombre+":");
        precio = guardar.nextInt();
        
        System.out.println("ingrese la cantidad del producto ");
        cantidad = guardar.nextInt();
  
        System.out.println("ingrese el codigo del producto: ");
        id = guardar.nextLong();
        
        productosDosX pro= new productosDosX(nombre,precio,cantidad,id);
        lista.add(pro);
  
        System.out.println("producto agregado exitosamente ");
}
    
public static void eliminarProducto(ArrayList<productosDosX> lista) {
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < lista.size(); i++) {
        if (codigo == lista.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el total vendido del producto");
        int total = guardar.nextInt();
        int valorActual = lista.get(j).getCantidad();
       if(total!=valorActual){
        valorActual -=total;
        productosDosX productoActualizado = new productosDosX(lista.get(j).getNombre(), lista.get(j).getPrecio(), valorActual, lista.get(j).getCodigo());    
        lista.set(j, productoActualizado);
       }
    }else{
        System.out.println("ingrese un codigo  valido");
    }
}
public static void editarProducto(ArrayList<productosDosX> lista) {
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < lista.size(); i++) {
        if (codigo == lista.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el total vendido del producto");
        int total = guardar.nextInt();
        int valorActual = lista.get(j).getCantidad();
       if(total!=valorActual){
        valorActual +=total;
        productosDosX productoActualizado = new productosDosX(lista.get(j).getNombre(), lista.get(j).getPrecio(), valorActual, lista.get(j).getCodigo());    
        lista.set(j, productoActualizado);
       }else{
        System.out.println("esta tratando de agregar los mismos  valores");
       }
    }else{
        System.out.println("ingrese un codigo  valido");
    }
}

public static void mostrarProductos(){
    for(productosDosX  x:lista){
        System.out.println("nombre: "+x.getNombre()+"\n"+"precio: "+x.getPrecio()+"\n"+"cantidad: "+x.getCantidad()+"\n"+"id "+x.getCodigo());
    }
}

}