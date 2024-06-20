package ejecutarproblematica2;
public class MenuCarta extends Menu {

    public double valorPorcionGuarnicion;
    public double valorBebida;
    public double porcentajeA;

    public MenuCarta( String nombreP,  double valorInicialM, double valorPorcionGuarnicion, double valorBebida, double porcentajeA) {
        super(nombreP, valorInicialM);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeA = porcentajeA;
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public void setValorPorcionGuarnicion(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeA() {
        return porcentajeA;
    }

    public void setPorcentajeA(double porcentajeA) {
        this.porcentajeA = porcentajeA;
    }

    @Override
    public void valorMenu() {
        
        double v;
        
        v= porcentajeA + valorBebida + valorPorcionGuarnicion + valorInicialM;
        
        System.out.println("El valor del menu es: "+v);
    }
     
}
