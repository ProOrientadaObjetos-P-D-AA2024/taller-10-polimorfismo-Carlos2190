package ejercutarproblematica1;
public class Guerreros extends Personaje {
    
    public int fuerza;
    public String habilidadesAtaque;

    public Guerreros( String nombre, int salud, int nivel, int fuerza, String habilidadesAtaque) {
        super(nombre, salud, nivel);
        this.fuerza = fuerza;
        this.habilidadesAtaque = habilidadesAtaque;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getHabilidadesAtaque() {
        return habilidadesAtaque;
    }

    public void setHabilidadesAtaque(String habilidadesAtaque) {
        this.habilidadesAtaque = habilidadesAtaque;
    }


    @Override
    public void atacar() {
        
        if(fuerza > 1000){
            System.out.println("El ataque bajara 100 puntos de vida");
            System.out.println("FUERZA MAYOR A 1000");
            System.out.println("Habilidad usada: ");
            System.out.println(habilidadesAtaque);
            System.out.println("1200 punto de vida");
        }else if( fuerza < 100 ){
            
            System.out.println("El ataque bajara 10 puntos de vida ");
        }
        
    }

    @Override
    public void defender() {
        
        if (fuerza < 100){
            
            System.out.println("No podra defenderse");
            
        }else if(fuerza > 1000){
            
            System.out.println("Solo resivira 50% de todo el daño resivido (Bonificacion de la fuerza)");
        }
        
    }
    
    
    
    
    
    
    
    
}
