package ejercutarproblematica1;
public class Arqueros extends Personaje {
    
    public double precision ;
    public String habilidadesDistancia;

    public Arqueros( String nombre, int salud, int nivel, double precision, String habilidadesDistancia) {
        super(nombre, salud, nivel);
        this.precision = precision;
        this.habilidadesDistancia = habilidadesDistancia;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public String getHabilidadesDistancia() {
        return habilidadesDistancia;
    }

    public void setHabilidadesDistancia(String habilidadesDistancia) {
        this.habilidadesDistancia = habilidadesDistancia;
    }

    @Override
    public void atacar() {
        if(precision > 20){
            System.out.println("Se usara la habilidad: ");
            System.out.println(habilidadesDistancia);
            System.out.println("DAÑO CRITICO DE 1700 (Punto vital)");
        }else if(precision < 5){
            
            System.out.println(" Lanzara disparos simples bajara 20 puntos de vida ");   
        }  
    }

    @Override
    public void defender() {
        
        System.out.println("Velocidad aumentada 20% mas rapido ");
        
        if(nivel > 20){
            System.out.println(" USARA TRAMPAS DE HIELO PARA CONGELAR A LOS ENEMIGOS POR 5S");
        }
       
    }
    
    
    
    
}
