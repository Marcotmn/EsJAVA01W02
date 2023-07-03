package es2;

import java.util.Scanner;

public class AppEs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Inserisci il numero di km percorsi: ");
            double kmPercorsi = (int) scanner.nextDouble();

            
            System.out.print("Inserisci il numero di litri consumati: ");
            double litriConsumati = (int) scanner.nextDouble();

            
            double kmLitro = (int) kmPercorsi / (int) litriConsumati;

            
            System.out.println("Il consumo dell'auto è di " + kmLitro + " km/l.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero. Inserisci un numero di litri diverso da zero.");
        }

        scanner.close();
    }
}