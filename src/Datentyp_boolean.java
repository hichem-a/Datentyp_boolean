import java.util.Scanner;
public class Datentyp_boolean { //g
    public static void main(String[] args) {
        boolean schalterAn, lampeAn;
        Scanner input = new Scanner(System.in);
        System.out.print("Ist der Schalter an? (true/false): ");
        schalterAn = input.nextBoolean();
        lampeAn = schalterAn;
        System.out.println("Schalter 1 ist an? " + schalterAn);
        System.out.println("Das Licht ist an? " + lampeAn);
input.close();
    }
}
