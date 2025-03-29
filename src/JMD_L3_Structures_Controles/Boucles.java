package JMD_L3_Structures_Controles;

public class Boucles {
	
	 public static void main(String[] args) {
	       
        // Boucle for
        System.out.println("Boucle for classique :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            if(i == 2) continue; // Passer directement à l'itération suivante
            if(i == 3) {
            	break; // Arret du programme lorsque l'objectif est atteint
            }
        }

        // Boucle for (foreach)
        System.out.println("\nBoucle for améliorée (foreach) :");
        int[] tableau = {1, 2, 3, 4, 5};
        for (int nombre : tableau) {
            System.out.println("nombre = " + nombre);
        }

        // Boucle while
        System.out.println("\nBoucle while :");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Boucle do-while
        System.out.println("\nBoucle do-while :");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 5);
    }
}
