package se.oscar.oop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person minPerson = new Person("Oscar", 23, "Tyresö");

        System.out.print("Vad är ditt namn? ");
        minPerson.setName(in.next());
        System.out.print("Vad är din ålder? ");
        minPerson.setAge(in.nextInt());
        System.out.print("I vilken stad bor du? ");
        minPerson.setCity(in.next());
        minPerson.introduce();


    }
}
