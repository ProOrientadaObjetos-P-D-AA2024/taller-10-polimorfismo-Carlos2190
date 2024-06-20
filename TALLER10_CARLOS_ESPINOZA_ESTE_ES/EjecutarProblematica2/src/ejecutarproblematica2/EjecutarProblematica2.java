package ejecutarproblematica2;
import java.util.Scanner;
public class EjecutarProblematica2 {
    public static void main(String[] args) {
        
    String nombre,cedula;
    int numeroMenu;
    double subtotal;
    Scanner entrada = new Scanner (System.in);
    MenuCarta MC = new MenuCarta ("Pizza",20,3,2,10);
    MenuDia MD= new MenuDia ("Pure de papa",10,12,2);
    MenuNiños MN = new MenuNiños ("Fresas crema",5,3,5);
    MenuEconomico ME = new MenuEconomico ("sopa de fideos",2,7);
    
    System.out.println("----------------------------");   
    System.out.println("RESTAURANTE ¨IMPERIO FOOOD¨ ");
    System.out.println("----------------------------");
    System.out.print("\nIngrese su nombre y Apellido : ");
    nombre = entrada.nextLine();
    System.out.print("Ingrese su cedula: ");
    cedula = entrada.nextLine();
    System.out.println("\n-----");
    System.out.println("MENUS");
    System.out.println("-----");
    System.out.println("Menu Carta [1]");
    System.out.println("Plato: "+MC.getNombreP()+" valor "+MC.getValorInicialM());
    System.out.println("Valor Guarnicion: "+MC.getValorPorcionGuarnicion());
    System.out.println("Valor Bebida: "+MC.getValorBebida());
    System.out.println("\nMenu Dia [2]");
    System.out.println("Plato: "+MD.getNombreP()+" valor "+MD.getValorInicialM());
    System.out.println("Valor Postre: "+MD.getValorPostre());
    System.out.println("Valor Bebida: "+MD.getValorBebida());
    System.out.println("\nMenu Niños [3]");
    System.out.println("Plato: "+MN.getNombreP()+" valor "+MN.getValorInicialM());
    System.out.println("Valor Helado: "+MN.getValorPhelado());
    System.out.println("Valor Pasteles: "+MN.getValorPpastes());
    System.out.println("\nMenu Economico [4]");
    System.out.println("Plato: "+ME.getNombreP()+" valor "+ME.getValorInicialM());
    System.out.print("\nIngrese el Numero del menu: ");    
    numeroMenu = entrada.nextInt();
    System.out.println("\n-------");
    System.out.println("FACTURA");
    System.out.println("-------");
    
    Cuenta c = new Cuenta(nombre,cedula,numeroMenu);
    
    if(c.getNumeroMenu() == 1){
        
        System.out.println("Cliente: "+c.getNombre());
        System.out.println("Cedula: "+c.getCedula());
        
        subtotal = MC.getValorInicialM();
        System.out.println("\nValor bebida: "+MC.getValorBebida());
        System.out.println("Valor Porcion Guarnicion: "+MC.getValorPorcionGuarnicion());
        System.out.println("Porcentaje: "+MC.getPorcentajeA());
        System.out.println("\nMenu Carta "+ subtotal);
        System.out.println("IVA: 15%");
        System.out.println("Total: ");
        MC.valorMenu(); 
    }
    
    if(c.getNumeroMenu() == 2){
        
        System.out.println("Cliente: "+c.getNombre());
        System.out.println("Cedula: "+c.getCedula());
        
        subtotal = MD.getValorInicialM();
        System.out.println("\nValor bebida: "+MD.getValorBebida());
        System.out.println("Valor Postre: "+MD.getValorPostre());
        System.out.println("\nMenu Dia "+ subtotal);
        System.out.println("IVA: 15%");
        System.out.println("Total: ");
        MD.valorMenu(); 
    }
    
    if(c.getNumeroMenu() == 3){
        
        System.out.println("Cliente: "+c.getNombre());
        System.out.println("Cedula: "+c.getCedula());
        
        subtotal = MN.getValorInicialM();
        System.out.println("\nValor Helado: "+MN.getValorPhelado());
        System.out.println("Valor Pastel: "+MN.getValorPpastes());
        System.out.println("\nMenu Niños "+ subtotal);
        System.out.println("IVA: 15%");
        System.out.println("Total: ");
        MN.valorMenu(); 
    }
    
    if(c.getNumeroMenu() == 4){
        
        System.out.println("Cliente: "+c.getNombre());
        System.out.println("Cedula: "+c.getCedula());
        
        subtotal = ME.getValorInicialM();
        System.out.println("\nDescuento: "+ME.getPorcetajeDescuento());
        System.out.println("\nMenu Economico "+ subtotal);
        System.out.println("IVA: 15%");
        System.out.println("Total: ");
        ME.valorMenu(); 
    }
        
    }
}
