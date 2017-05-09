
package taller.pkg4;


public class Persona {

    private static char p;

   private String nombre;
    private String direccion;
    private char email;
    private long telefono;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.direccion+"  "+this.telefono+" "+this.email;
    }
      
     
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.setNombre("Elena");
        p1.setDireccion("Recreo");
        p1.setTelefono(1478569855);
        p1.setEmail(p);
        System.out.println(p1);
        
    }
    
}
