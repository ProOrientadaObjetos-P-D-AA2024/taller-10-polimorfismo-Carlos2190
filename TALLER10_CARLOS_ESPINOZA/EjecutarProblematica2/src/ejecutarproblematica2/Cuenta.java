package ejecutarproblematica2;
public class Cuenta {
    
    
    public String nombre,cedula;
    public int numeroMenu;

    public Cuenta(String nombre, String cedula, int numeroMenu) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroMenu = numeroMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroMenu() {
        return numeroMenu;
    }

    public void setNumeroMenu(int numeroMenu) {
        this.numeroMenu = numeroMenu;
    }
    
    
}
