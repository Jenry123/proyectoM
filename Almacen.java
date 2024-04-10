import java.util.Scanner; 
import java.util.InputMismatchException;

public class Almacen {
static Scanner  sc = new Scanner(System.in);
static int opcion;
public static void menu(){
    Corona corona=new Corona();
    DosX dosx=new DosX();
    
    boolean repetirP=true;

   do{
   try {
    System.out.println();
    System.out.println("-------------------------------bienvenído admin------------------------------------");
    System.out.println();
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      que desea realizar administrador                           |");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      1)administrar productos corona                             |");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      2)administrar productos dosX                               |");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      3)ver total de productos corona                            |");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      4)ver total de productos dos x                             |");
    System.out.println("|---------------------------------------------------------------------------------|");
    System.out.println("|                      5)salír                                                    |");
    System.out.println("|---------------------------------------------------------------------------------|");
    opcion=sc.nextInt();
   } catch (InputMismatchException e) {
    System.err.println("error en "+e);
   }

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
