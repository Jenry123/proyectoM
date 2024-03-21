public class Usuario {
    private String nombreUsuario;
    private String password;
    public Usuario(){

    }
    public Usuario(String nombre,String  pass){
        this.nombreUsuario=nombre;
        this.password=pass;
    }

    public void setNombreUsuario (String nombre) {
        this.nombreUsuario=nombre;
    }
    public String getNombreUsuario () {
        return this.nombreUsuario;
    }
    
    public void setPassword(String pass){
        this.password=pass;
    }
    public  String getPassword() {
        return this.password;
    }

}
