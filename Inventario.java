import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class Inventario {
    static Scanner guardar=new Scanner(System.in);
    static ArrayList<Productos>listaProductos=new ArrayList<>();
    static int j;
    static String nombre;
    static int precio;
    static int cantidad;
    static long idProducto;

protected static void agregarProductos(){

try {
    System.out.println("ingrese el nombre del producto: ");
    nombre =guardar.next();
    System.out.println("Ingrese el precio  del producto "+nombre+":");
    precio = guardar.nextInt();
    
    System.out.println("ingrese la cantidad del producto ");
    cantidad = guardar.nextInt();
  
    System.out.println("ingrese el codigo del producto: ");
    idProducto = guardar.nextLong();
    
} catch (InputMismatchException e) {
    System.out.println("Error: Se esperaba un número entero, pero se ingresó un valor inválido.");
    System.out.println("Mensaje de excepción: " + e);
    guardar.nextLine();
}
  
 
  Productos pro= new Productos(nombre,precio,cantidad,idProducto);
  listaProductos.add(pro);


}

protected static void eliminarProducto() {
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < listaProductos.size(); i++) {
        if (codigo == listaProductos.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el total vendido del producto");
        int total = guardar.nextInt();
        int valorActual = listaProductos.get(j).getCantidad();
       if(total!=valorActual){
        valorActual -=total;
        Productos productoActualizado = new Productos(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
        listaProductos.set(j, productoActualizado);
       }
    }else{
        System.out.println("ingrese un codigo  valido");
    }
}
protected static void editarProducto() {
    int opcion;
  System.out.println("que desea actualizar del producto : ");
  System.out.println("1)nombre 2)codigo 3)total de productos 4)precio");
  opcion=guardar.nextInt();

  switch (opcion) {
    case 1:
        editarNombreProducto();
        break;

    case 2:
        editarCodigoProducto();
        break;

    case 3:
        editarCantidadProducto();
        break;

    case 4:
        editarPrecioProducto();
        break;
  
    default:
    System.out.println("Opcion no valida");
        break;
  }
}

protected static void editarCodigoProducto(){
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < listaProductos.size(); i++) {
        if (codigo == listaProductos.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el nuevo codigo del producto");
        long total = guardar.nextInt();
        long valorActual = listaProductos.get(j).getCodigo();
       if(total!=valorActual){
        valorActual =total;
        Productos productoActualizado = new Productos(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(),listaProductos.get(j).getCantidad(), valorActual);    
        listaProductos.set(j, productoActualizado);
       }else{
        System.out.println("esta tratando de agregar el mismo codigo");
       }
    }else{
        System.out.println("ingrese un codigo  valido");
    }
}
protected static void editarCantidadProducto(){
    boolean e = false;
    long codigo;
    int cantidad;
    int total;
    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < listaProductos.size(); i++) {
        if (codigo == listaProductos.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
      
        int valorActual = listaProductos.get(j).getCantidad();
        System.out.println("que desea hacer a la cantidad 1)agregar  o 2)restar a la cantidad actual");
        cantidad=guardar.nextInt();


        if(cantidad==1){
            System.out.println("Ingrese el total a agregar del producto");
            total = guardar.nextInt();
                valorActual +=total;
                Productos productoActualizado = new Productos(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
                listaProductos.set(j, productoActualizado);
               
        }else{
            System.out.println("Ingrese el total vendido del producto");
            total = guardar.nextInt();
                valorActual -=total;
                Productos productoActualizado = new Productos(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
                listaProductos.set(j, productoActualizado);
               
            }
            
        }else{
            System.out.println("ingrese un codigo  valido");
        }
       
}

protected static void editarPrecioProducto(){
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < listaProductos.size(); i++) {
        if (codigo == listaProductos.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el nuevo precio del producto");
        int total = guardar.nextInt();
        int valorActual = listaProductos.get(j).getPrecio();
       if(total!=valorActual){
        valorActual =total;
        Productos productoActualizado = new Productos(listaProductos.get(j).getNombre(),valorActual, listaProductos.get(j).getCantidad(), listaProductos.get(j).getCodigo());    
        listaProductos.set(j, productoActualizado);
       }else{
        System.out.println("esta tratando de agregar los mismos  valores");
       }
    }else{
        System.out.println("ingrese un codigo  valido");
    }
}

protected static void editarNombreProducto(){
    boolean e = false;
    long codigo;

    System.out.println("Ingrese el código del producto que se haya vendido 🛒");
    codigo = guardar.nextLong();
    
    for (int i = 0; i < listaProductos.size(); i++) {
        if (codigo == listaProductos.get(i).getCodigo()) {
            e = true;
            j = i;
        }
    }
    
    if (e) {
        System.out.println("Ingrese el nombre del producto");
        String nombre = guardar.next();
        String valorActual = listaProductos.get(j).getNombre();
       if(nombre!=valorActual){
        valorActual =nombre;
        Productos productoActualizado = new Productos(valorActual, listaProductos.get(j).getPrecio(), listaProductos.get(j).getCantidad(), listaProductos.get(j).getCodigo());    
        listaProductos.set(j, productoActualizado);
       }else{
        System.out.println("esta tratando de agregar el mismo nombre");
       }
    }else{
        System.out.println("ingrese un nombre valido");
    }
}

protected abstract void mostrarProductos();



 
}


