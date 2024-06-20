package ejercutarproblematica1;
public  class EjercutarProblematica1 {
    public static void main(String[] args) {

    
    Guerreros gu = new Guerreros (" ARTHUR ",5000,20,1500," Desenfreno");
       
        System.out.println("Personajes");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("El personaje de clase GUERRERO "+gu.getNombre()+" tiene "+gu.getSalud()+" puntos de vida");
        System.out.println("\nHabilidad de ataque : ");
        gu.atacar();
        System.out.println("\nHabilidad de defenza: ");
        gu.defender();
        
    Magos mg = new Magos (" JULIOS ",6000,20,11000,"Piroexpocion","Bolas de fuego");
    
        System.out.println("\nEl personaje de clase MAGO "+mg.getNombre()+" tiene "+mg.getSalud()+" puntos de vida");
        System.out.println("\nHabilidad de ataque : ");
        mg.atacar();
        System.out.println("\nHabilidad de defenza: ");
        gu.defender();
        
    Arqueros ar = new Arqueros (" ARISTEO ",3000,25,25,"DISPARO DE PUNTERIA");
    
        System.out.println("\nEl personaje de clase ARQUERO "+ar.getNombre()+" tiene "+ar.getSalud()+" puntos de vida");
        System.out.println("\nHabilidad de ataque : ");
        ar.atacar();
        System.out.println("\nHabilidad de defenza: ");
        ar.defender();
        
    System.out.println("-------------------------------------------------------------------------------------");    
        System.out.println("\nENFRENTAMIENTO GUERRO VS ARQUERO"); 
        
        if(ar.getNivel() > gu.getNivel()){
          
            System.out.println("GANADOR: "+ar.getNombre()+" sube dos nibeles");
            
         }else{
            
             System.out.println("GANADOR: "+gu.getNombre()+" sube dos nibeles");
        }
       
        
        
    } 
}
