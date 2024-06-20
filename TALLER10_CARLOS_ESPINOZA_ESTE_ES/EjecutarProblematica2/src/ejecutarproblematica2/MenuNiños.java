package ejecutarproblematica2;
public class MenuNiños extends Menu {
    
    public double valorPhelado;
    public double valorPpastes;

    public MenuNiños(String nombreP, double valorInicialM, double valorPhelado, double valorPpastes) {
        super(nombreP, valorInicialM);
        this.valorPhelado = valorPhelado;
        this.valorPpastes = valorPpastes;
    }
    public double getValorPhelado() {
        return valorPhelado;
    }

    public void setValorPhelado(double valorPhelado) {
        this.valorPhelado = valorPhelado;
    }

    public double getValorPpastes() {
        return valorPpastes;
    }

    public void setValorPpastes(double valorPpastes) {
        this.valorPpastes = valorPpastes;
    }
    
    @Override
    public void valorMenu() {
        double v;
        
        v= valorPpastes + valorPhelado + valorInicialM;
        System.out.println("El valor del menu es: "+v);
    }    
        
      
}
