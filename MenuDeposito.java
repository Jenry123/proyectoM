package isacc;
import java.util.Scanner;
import java.util.ArrayList;
public class MenuDeposito {
   static Scanner guardar = new Scanner (System.in); 
   static ArrayList<Usuario> listaUsuario = new ArrayList();  
   static  int j;
    public static void main(String[] args) {
        verificarUsuario();  
           
    }

    public static void verificarUsuario(){
        listaUsuario.add(new Usuario("jenry","deposito12"));  
        String usuario;
        String  password; 
        boolean repetir=false;

         do{
    System.out.println("\n");
    System.out.println("      |||   |||   |||||  ||  |||    ||");
    System.out.println("      ||| ||   || ||     ||  ||| |  ||");
    System.out.println("      ||| ||   || || ||  ||  |||  | ||");
    System.out.println("      |||   |||   |||||  ||  |||   |||");
    System.out.println("\n ");
            System.out.println("ingrese su usuario");
            usuario=guardar.next();
            System.out.println("Ingrese contraseña: ");
            password=guardar.next();
    
            boolean usuarioEncontrado = false;
           
            for (Usuario usuario2 : listaUsuario) {
                if (usuario2.getUsuario().equals(usuario) && usuario2.getContrasena().equals(password)) {
                    usuarioEncontrado = true;
                }
            }
    
            if(usuarioEncontrado){
                menuInicial();
            }else{
                System.out.println("error");
                System.out.println("ingrese nuevamente su usuario y contraseña");
                repetir=true;
            }

         }while(repetir);
    }

 
    public static void  menuInicial(){ 
        ArrayList<Producto> listaProductos=new ArrayList<>();
        int opcion;
        boolean repetir=true;
        do{
            System.out.println("bienvenido que desea realizar 1)agregar nuevo producto 2)imprimir total de  productos  3)eliminar  de stock de productos");
            System.out.println("4)agregar a stock");
            opcion=guardar.nextInt();
    
            switch(opcion){
                case 1:
                agregarProducto(listaProductos);
                break;
                case 2:
                imprimirListaDeProductos(listaProductos);
                break;
                case 3:
                restarProducto(listaProductos);
                break;
                case 4:
                agregarStockProducto(listaProductos);
                break;
                default:
                System.out.println("Opcion invalida ");
                break;
            }
            System.out.println("Desea continuar? s/n");
            String continuar=guardar.next();

            if(continuar.equals("n")){
                System.out.println("adiosss amiko");
                repetir=false;
            }

        }while(repetir);
       

    }

    public static void agregarProducto(ArrayList<Producto> listaProductos){
        String nombreP;
        int precio;
        int totalP;
        long codigoP;
            System.out.println("ingrese el nombre del producto");
            nombreP=guardar.next();
            System.out.println("ingrese  el precio del producto");
            precio=guardar.nextInt();
            System.out.println("cantidad de unidades que tiene en stock");
            totalP=guardar.nextInt();
            System.out.println("ingrese el codigo del producto");
            codigoP= guardar.nextLong();
            Producto p = new Producto(nombreP,precio,totalP,codigoP);
            listaProductos.add(p);
            System.out.println("producto agregado con exito");
           
    }

    public static void  imprimirListaDeProductos (ArrayList<Producto> listaProductos) {

        for(Producto m: listaProductos){
        System.out.println("Nombre: \t" +m.getNombre()+"\n"+ " Precio: \t "+m.getPrecio()+"\n"+" Cantidad: \t "+m.getTotal()+"\n"+"codigo: \t"+m.getCodigo()+"\n");
        }

    }

    public static void restarProducto(ArrayList<Producto> listaProductos) {
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
            int valorActual = listaProductos.get(j).getTotal();
           if(total!=valorActual){
            valorActual -=total;
            Producto productoActualizado = new Producto(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), valorActual, listaProductos.get(j).getCodigo());    
            listaProductos.set(j, productoActualizado);
           }
        }else{
            System.out.println("ingrese un codigo  valido");
        }
    }

    public static void agregarStockProducto(ArrayList<Producto> listaProductos) {
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
            System.out.println("Ingrese la cantidad comprada del producto");
            int nuevoTotal = guardar.nextInt();
            int totalActual = listaProductos.get(j).getTotal();
            totalActual +=nuevoTotal;
            Producto productoActualizado = new Producto(listaProductos.get(j).getNombre(), listaProductos.get(j).getPrecio(), totalActual, listaProductos.get(j).getCodigo());    
            listaProductos.set(j, productoActualizado);
           
        }else{
            System.out.println("ingrese un codigo  valido");
        }
    }
    
}   