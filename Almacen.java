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
        System.out.println("1-agregar Dos X");
        System.out.println("2-actualizar producto dos x");
        System.out.println("3-eliminar  producto dos x");
        System.out.println("4-ver productos 2X");
        System.out.println("5-agregar corona ");
        System.out.println("6-actualizar producto dos x");
        System.out.println("7-eliminar  producto dos x");
        System.out.println("8-ver productos 2X");
        System.out.println("9-ver reporte total del dia");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
           objDosX.agregarProductosDosX();
                 break;

            case 2:
             objcorona.agregarProductosCorona();
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
