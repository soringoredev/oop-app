import java.util.Scanner;

public class Exercitiu {
    public static void main(String[] args) {

        // creare obiect Scanner
        Scanner obiectScanner = new Scanner(System.in);

        // afisare mesaj de introducere varsta
        System.out.print("Introduceti varsta Dvs.: ");

        // creare variabila unde va fi stocata/salvata varsta
        int varstaUtilizator = obiectScanner.nextInt();

        // logica programului
        int secol = 100;
        int anCurent = 2025;
        int varstaNastereUtilizator = anCurent - varstaUtilizator;
        int anFinal = varstaNastereUtilizator + secol;

        // afisarea rezultatului
        System.out.println("Utilizatorul va implini 100 de ani in anul " + anFinal + ".");


        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
        System.out.println(varstaUtilizator);
    }
}
