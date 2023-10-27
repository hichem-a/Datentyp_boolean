import java.util.Scanner;
public class Datentyp_boolean {
    public static void main(String[] args) {
        boolean sAn1,sAn2;

        Scanner input = new Scanner(System.in);

        System.out.print("Ist der Schalter  1 an? (true/false): ");
        sAn1 = input.nextBoolean();
        System.out.print("Ist der Schalter  2an? (true/false): ");
        sAn2 = input.nextBoolean();
        System.out.println("Schalter 1 ist an? " + sAn1);
        System.out.println("Schalter 2 ist an? " + sAn2);
        if ( !sAn1 || !sAn2 ){
            System.out.println("Das Licht ist aus ");
        }
    else{
            System.out.println("Das Licht ist an? " );

        }
input.close();
    }
}
