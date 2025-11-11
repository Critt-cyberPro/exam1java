
public class Exam {
public static void main(String[] args) {
        String[] tab_ville = {"Le Caire", "New York", "Paris", "Calcutta", "Barcelone", "Manille", "Montréal", "Hong Kong"};
        double[] tab_superficie = {210, 1214, 105.4, 185, 100.4, 38.55, 363.52, 1104};
        int[] tab_population = {8452409, 8391881, 2211297, 4580544, 1621537, 1660714, 1667700, 7018636};
        double[] tab_densite = new double[tab_ville.length];

        calculerDensite(tab_superficie, tab_population, tab_densite, tab_ville);
        afficherResultats(tab_ville, tab_superficie, tab_population, tab_densite);
    }

public static void calculerDensite(double[] tab_superficie, int[] tab_population, double[] tab_densite,String[] tab_ville) {
        for (int i = 0; i < tab_superficie.length; i++) {
            tab_densite[i] = tab_population[i] / tab_superficie[i];
        }
        System.out.println("Densité de population (habitants/km²) :");
        for (int i = 0; i < tab_ville.length; i++) {
            System.out.println(tab_ville[i] + " : " + tab_densite[i] + " habitants/km²");
        }
}
public static void afficherResultats(String[] tab_ville, double[] tab_superficie, int[] tab_population, double[] tab_densite) {
        System.out.println("Ville\t\tSuperficie\tPopulation\tDensité");
        System.out.println("==============================================");
        for (int i = 0; i < tab_ville.length; i++) {
            System.out.println(tab_ville[i] + "\t" + tab_superficie[i] + "\t" + tab_population[i] + "\t" + tab_densite[i]);
        }
}
}
