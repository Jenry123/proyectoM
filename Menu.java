import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
  static ArrayList<Usuario> usuarios = new ArrayList<>(); 
static Scanner  sc = new Scanner(System.in);
static Almacen objAlmacen;

public static void main(String[] args) {
   verificarUsuario(usuarios);
}


    public static void verificarUsuario(ArrayList<Usuario> usuarios){
      Corona corona=new Corona();
        usuarios.add(new Usuario("admin","admin"));
        String user;
        String pass;
        boolean r=true;
        boolean  valido=false; 
       
      do{
        System.out.println("----------------------------iniciar sesion----------------------------------");
        System.out.print("ingrese su usuario: ");
        user=sc.next();
        System.out.print ("ingrese su contraseña: ");
        pass=sc.next();
        for(Usuario  u : usuarios){
          if(u.getNombreUsuario().equals(user)&&u.getPassword().equals(pass)){
            valido=true;
          }
        }
            if(valido){
             corona.verificarExistenciaProducto();
              objAlmacen.menu();
              
            }else{
                System.out.println("error");
            }
          
         }while(r);
    } 
    }    




