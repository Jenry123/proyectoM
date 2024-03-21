import java.util.ArrayList;
import java.util.Scanner;
public class Corona{
    static Scanner guardar=new Scanner(System.in);
    static ArrayList<ProductosCorona>listaProductos=new ArrayList<>();
    static int j;
 
    
     public static void agregarProductosCorona(){
        String nombre;
        int precio;
        int cantidad;
        long id;
        listaProductos.add(new ProductosCorona("familiar",12,100,129382382));
        listaProductos.add(new ProductosCorona("mega",42,300,17666682));
        listaProductos.add(new ProductosCorona("modelo",12,100,13444482));
        listaProductos.add(new ProductosCorona("barrilito",12,100,1211113382));
        
      System.out.println("ingrese el nombre del producto: ");
      nombre =guardar.next();
      
      System.out.println("Ingrese el precio  del producto "+nombre+":");
      precio = guardar.nextInt();
      
      System.out.println("ingrese la cantidad del producto ");
      cantidad = guardar.nextInt();

      System.out.println("ingrese el codigo del producto: ");
      id = guardar.nextLong();
      
      ProductosCorona pro= new ProductosCorona(nombre,precio,cantidad,id);
      listaProductos.add(pro);

      System.out.println("producto agregado exitosamente ");
    }

    public static void eliminarProducto(ArrayList<ProductosCorona> listaProductos) {
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
            ProductosCorona productoActualizado = new ProductosCorona(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
            listaProductos.set(j, productoActualizado);
           }
        }else{
            System.out.println("ingrese un codigo  valido");
        }
    }
    public static void editarProducto(ArrayList<ProductosCorona> listaProductos) {
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
            valorActual +=total;
            ProductosCorona productoActualizado = new ProductosCorona(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
            listaProductos.set(j, productoActualizado);
           }else{
            System.out.println("esta tratando de agregar los mismos  valores");
           }
        }else{
            System.out.println("ingrese un codigo  valido");
        }
    }
    
    public static void mostrarProductos(){
      
        for(ProductosCorona  x:listaProductos){
            System.out.println("nombre: \t"+x.getNombre()+"\n"+"precio: \t"+x.getPrecio()+"\n"+"cantidad: \t"+x.getCantidad()+"\n"+"id:    \t"+x.getCodigo()+"\n");
        }
    }
}
