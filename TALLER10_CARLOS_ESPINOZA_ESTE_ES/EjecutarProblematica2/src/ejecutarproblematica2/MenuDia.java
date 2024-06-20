package ejecutarproblematica2;
public class MenuDia extends Menu {

    public double valorPostre;
    public double valorBebida;

    public MenuDia( String nombreP, double valorInicialM, double valorPostre, double valorBebida) {
        super(nombreP, valorInicialM);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    
    @Override
    public void valorMenu() {
          double v;
        
        v= valorBebida + valorPostre + valorInicialM;
        System.out.println("El valor del menu es: "+v);
    }
    
    
    
}
