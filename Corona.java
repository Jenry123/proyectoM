import java.util.Scanner;
public class Corona extends Inventario{
static  boolean repetir=true;

    public void seleccionarOperacion(){
        int opcion;
        Scanner sc = new Scanner(System.in);
      
        do{
            System.out.println("que desea realizar 1)guardar 2)editar producto 3)ver productos 4)salir");
            opcion=sc.nextInt();
       
               switch (opcion) {
                    case 1:
                   agregarProductos();
                       break;
                    case 2:
                      editarProducto();
                       break;

                    case 3:
                        mostrarProductos();
                    break;
                    case 4:
                    repetir=false;
                    System.out.println("gracias  por usar el sistema");
                        break;
                   default:
                   System.out.println("error no existe esa operacion");
                       break;
               }
        }while(repetir);

    }

    public void verificarExistenciaProducto(){
        super.verificarExistenciaProducto();
    }
@Override
    public void mostrarProductos(){
        System.out.println("productos de corona: ");
        for(Productos  x:listaProductos){
            if(x.getCodigo()>=1000000){
            System.out.print("nombre: \t"+x.getNombre()+"\n"+"precio: \t"+x.getPrecio()+"\n"+"cantidad: \t"+x.getCantidad()+"\n"+"id:    \t"+x.getCodigo()+"\n");
        }
    }
    }


 
       
    }
 
    
  

