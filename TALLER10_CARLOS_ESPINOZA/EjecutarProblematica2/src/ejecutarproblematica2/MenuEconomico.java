package ejecutarproblematica2;
public class MenuEconomico extends Menu {

    public double porcetajeDescuento;

    public MenuEconomico(String nombreP, double valorInicialM,double porcetajeDescuento) {
        super(nombreP, valorInicialM);
        this.porcetajeDescuento = porcetajeDescuento;
    }

    public double getPorcetajeDescuento() {
        return porcetajeDescuento;
    }

    public void setPorcetajeDescuento(double porcetajeDescuento) {
        this.porcetajeDescuento = porcetajeDescuento;
    }
    
    @Override
    public void valorMenu() {
        double v;
        
        v= porcetajeDescuento + valorInicialM;
        System.out.println("El valor del menu es: "+v);
    }
    
    
    
    
}
