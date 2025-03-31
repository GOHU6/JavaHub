package JMD_L3_Control_Flow;

public class Loops {
	
	 public static void main(String[] args) {
	       
        for (int i = 1; i <= 5; i++) {					// Boucle for
            System.out.println("i = " + i);
            if(i == 2) continue; 						// Passer directement à l'itération suivante
            if(i == 3) {
            	break; 									// Arret du programme lorsque l'objectif est atteint
            }
        }
        
        int[] array = {1, 2, 3, 4, 5};
        for (int number : array) { 						// Boucle for (foreach)
            System.out.println("number = " + number);
        }

        int i = 0;
        while (i < 5) {									// Boucle while
            System.out.println("i = " + i);
            i++;
        }

        int j = 0;
        do {											// Boucle do-while		
            System.out.println("j = " + j);
            j++;
        } while (j < 5);
    }
}
