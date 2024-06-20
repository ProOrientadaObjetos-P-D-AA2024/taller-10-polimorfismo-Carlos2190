package ejecutarproblematica2;
public abstract class Menu {
    
    protected String nombreP;
    protected double valorInicialM;

    public Menu(String nombreP ,double valorInicialM) {
        this.nombreP = nombreP;
        this.valorInicialM = valorInicialM;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }


    public double getValorInicialM() {
        return valorInicialM;
    }

    public void setValorInicialM(double valorInicialM) {
        this.valorInicialM = valorInicialM;
    }
    
    public abstract void valorMenu();
    
}
