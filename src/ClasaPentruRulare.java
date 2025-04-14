public class ClasaPentruRulare {
    public static void main(String[] args) {

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();

        int varsta = 106; // aceasta este o variabila
        masina1.culoare = "Verde"; // aceste este un camp
        masina1.model = "E class";
        masina1.anFabricatie = 2002;

        masina2.culoare = "Rosu";
        masina2.model = "B class";
        masina2.anFabricatie = 2007;

        System.out.println("PRIMA MASINA:");
        System.out.println(masina1.culoare);
        System.out.println(masina1.model);
        System.out.println(masina1.anFabricatie);

        System.out.println();

        System.out.println("A DOUA MASINA:");
        System.out.println(masina2.culoare);
        System.out.println(masina2.model);
        System.out.println(masina2.anFabricatie);

    }
}
