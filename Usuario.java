package isacc;

public class Usuario {

    private String usuario;
    private String contrasena;

    public  Usuario(){

    }

    public  Usuario(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena=contrasena;
    }

    public void setUsuario(String usuario,String contrasena){
        this.usuario = usuario;
        this.contrasena=contrasena;
    }

    public String  getUsuario(){
         return usuario;
    }

    public String getContrasena(){
        return  contrasena;
    }
    
}