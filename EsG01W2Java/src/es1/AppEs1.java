package es1;

import java.util.Arrays;
import java.util.Scanner;

public class AppEs1 {

	public static void main(String[] args) {
		  int[] array = new int[5];
		  Scanner scanner = new Scanner (System.in);

	        for (int i = 0; i < 10; i++) {
	            int nRandom = (int)(Math.random() * 10) + 1; 
	            int index = i % 5; 
	 

	            array[index] = nRandom; 
	        }

	        System.out.println(Arrays.toString(array));
	        
	      
	        int position = 0;
	        int number;

	        do {
	        	
	        	try {
	            System.out.print("Inserisci la posizione (0-4) o 0 per terminare: ");
	            position = scanner.nextInt();

	            if (position != 0) {
                   
                    if (position >= 0 && position < array.length) {
                        System.out.print("Inserisci il numero da aggiungere: ");
                        number = scanner.nextInt();

                        
                        array[position] = number;

                       
                        System.out.println("Nuovo stato dell'array:");
                        printArray(array);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Posizione non valida");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: " + e.getMessage() + ". Riprova.");
            }
        } while (position != 0);

        scanner.close();
    }

   
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
	    
	
	
     
	

