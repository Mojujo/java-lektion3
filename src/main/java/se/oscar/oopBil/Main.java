package se.oscar.oopBil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Bil minBil = new Bil("Toyota", 350000, "Blue", 2004, 0);

        System.out.println("Välkommen till racing simulatorn! Vilken model vill du prova?");
        minBil.setModel(scan.next());
        System.out.println("Vilket prisklass tittar du efter?");
        minBil.setPrice(scan.nextInt());
        System.out.println("Vilket färg ska bilen ha?");
        minBil.setColor(scan.next());
        System.out.println("Vilket år ska bilen ha byggts minst?");
        minBil.setBuildYear(scan.nextInt());

        System.out.println("Du har valt: " +
                minBil.getModel() + ", " +
                minBil.getPrice() + "kr, " +
                minBil.getColor() + ", " +
                minBil.getBuildYear());

        System.out.println("Vill du simulera bilen? Välj 1 om du vill fortsätta eller 2 om du vill avbryta");
        boolean isWrongAnswer;
        do {
            isWrongAnswer = false;
            switch(scan.nextInt()) {
                case 1:
                    minBil.start();
                    break;
                case 2:
                    System.out.println("Tack för användningen.");
                    break;
                default:
                    System.out.println("Välj 1 om du vill fortsätte, 2 om du vill avbryta.");
                    isWrongAnswer = true;
            }
        } while(isWrongAnswer);
    }
}
