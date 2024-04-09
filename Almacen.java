import java.util.Scanner; 

public class Almacen {
static Scanner  sc = new Scanner(System.in);

public static void menu(){
    Corona corona=new Corona();
    DosX dosx=new DosX();
    int opcion;
    boolean repetirP=true;

   do{
    System.out.println("bienvenido que desea realizar 1)administrar productos corona 2)administrar productos dosX 3)ver total de productos corona 4)ver total de productos dos x 5)salir");
    opcion=sc.nextInt();

    switch (opcion) {
      case 1:
        corona.seleccionarOperacion();
        break;
        case 2:
        dosx.seleccionarOperacion();
        break;

        case 3:
       corona.mostrarProductos();
        break;
        case 4:
        dosx.mostrarProductos();
        break;
        case 5:
        repetirP=false;
        break;
    
      default:
      System.out.println("error");
        break;
    }

   }while(repetirP);
  }
}
