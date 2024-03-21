import java.util.Scanner; 

public class Almacen {
static Scanner  sc = new Scanner(System.in);
//eliminar el objeto tiposproductos no se ocupa
static  DosX objDosX;
static  Corona objcorona;
static Inventario objInventario;
    public static void seleccionarMarcaProductos(){
        int  opcion;
      
       
        String continuar;
        do{
        System.out.println("bienvenido al sistema gestor del almacen seleccione una opcion para poder realizar las operaciones deseadas: ");
        System.out.println("Selccione la marca del producto: ");
        System.out.println("1-Dos X");
        System.out.println("2-corona ");
        System.out.println("3-ver reporte total del dia");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
           objDosX.seleccionarOperacion();
                 break;

            case 2:
             objcorona.seleccionarOperacion();
                break;
            
            case 3:
            objInventario.imprimirTotalVentas();
                break;
        
            default:
            System.out.println("ingrese una opcion valida");
                break;
        }
        System.out.println("desea buscar otro producto s/n");
         continuar=sc.next();
        }while(continuar.equals("s"));
    }
}
