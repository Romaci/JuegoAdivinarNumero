package adivinarNumero;
import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        AdivinoYo n;  
        AdivinaCompu n2; 
        System.out.println ("   -------Bienvenido al Juego ¡Adivine que número elegí!-------");
        System.out.println("");
        String opcion;
        String jugar = "si";
	    while (jugar.equals("si")) {
	    	 System.out.println ("Ingresa 'yo' si quieres adivinar un numero. De otra manera pulsa cualquier tecla y adivinaré yo. ");
	    	 opcion = sc.next();
	    	 if (opcion.equals("yo") ){
	    		n= new AdivinoYo();
	    		n.setNum((int) (Math.random()*101)); 
	    		while (n.continuar()) {
	    			System.out.println ("Elije un número del 1 al 100: ");
	    			n.compararNumero(sc.nextInt());
	    		}	    		
	    	}	
	    	 else { 
		    		n2= new AdivinaCompu();
		    		n2.setInf(0);
		    		n2.setSup(100);
		    		n2.setMed();
		    		while (n2.continuar()) {
		    			System.out.println ("¿Tu número es el " + n2.getMed() + "?");
		    			n2.setRespuesta(sc.next());	
		    			n2.compararNumero(n2.getMed());
		    			}	
		    		}	
	    	    System.out.println();
	    	 	System.out.println("Ingresa 'si' para volver a jugar. Para salir pulsa cualquier tecla.");
		    	jugar = sc.next();
	    }
	    sc.close();	
	}

}
