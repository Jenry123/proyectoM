import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
static ArrayList<Usuario> usuarios = new ArrayList<>(); 
static Scanner  sc = new Scanner(System.in);
static Almacen objAlmacen;
public static void main(String[] args) {
    //verificarUsuario(usuarios);
    objAlmacen.seleccionarMarcaProductos();
}
    public static void verificarUsuario(ArrayList<Usuario> usuarios){
        usuarios.add(new Usuario("jenry","lopez123"));
        String user;
        String pass;
        boolean r=true;
        boolean  valido=false; 
       do{
        System.out.println("ingrese su usuario:");
        user=sc.next();
        System.out.println("ingrese su contraseña");
        pass=sc.next();

        for(Usuario  u : usuarios){
          if(u.getNombreUsuario().equals(user)&&u.getPassword().equals(pass)){
            valido=true;
          }
        }
            if(valido){
            objAlmacen.seleccionarMarcaProductos();
            }else{
                System.out.println("error");
            }
       }while(r);
    }    
}

