package ejercutarproblematica1;
public class Magos extends Personaje {

    
    public double mana;
    public String hechizosAtaque;
    public String poderesMagicos;

    public Magos(String nombre, int salud, int nivel, double mana, String hechizosAtaque, String poderesMagicos) {
        super(nombre, salud, nivel);
        this.mana = mana;
        this.hechizosAtaque = hechizosAtaque;
        this.poderesMagicos = poderesMagicos;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public String getHechizosAtaque() {
        return hechizosAtaque;
    }

    public void setHechizosAtaque(String hechizosAtaque) {
        this.hechizosAtaque = hechizosAtaque;
    }

    public String getPoderesMagicos() {
        return poderesMagicos;
    }

    public void setPoderesMagicos(String poderesMagicos) {
        this.poderesMagicos = poderesMagicos;
    }

    public void hechizosDefensa(){
        System.out.println("Los magos tienen la habilidad pasiva de portar un escudo que evita el 55% del daño recibido");
    }

    @Override
    public void atacar() {
        
        if(mana > 10000){
            System.out.println("Se usara la habilidad: ");
            System.out.println(poderesMagicos);
            System.out.println("DAÑO CRITICO DE 1500");
        }else if(mana < 50000){
            
            System.out.println(hechizosAtaque);
            System.out.println(" BOLAS DE FUEGO bajara 59 puntos de vida");
            
        }
    }

    @Override
    public void defender() {
        
        if(mana > 10000){
            
            System.out.println("PODRA TELETRASPORTARSE 10M METROS DEL ENEMIGO");
            
        }else if(mana < 50000){
            
            System.out.println(" PODRA ENRAIZARLO POR 2S ");
            
        } 
  
    }  
}
