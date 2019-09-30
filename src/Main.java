import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sten saks papir 1.0");

        Haand henrik = Haand.PAPIR;
        Haand andrás = Haand.SAKS;
        Haand kelvin = Haand.STEN;

        // Her starter spillet
        SSP runde1 = new SSP();
        System.out.println(runde1.slaa(kelvin, andrás));

        // Computere genererer en hånd
        Haand computersHaand = null;
        int haandInt = (int) Math.random()*3+1;
        // Korte nørklet kode computersHaand = Haand.values()[haandInt];
        if (haandInt ==1) {computersHaand = Haand.STEN;}
        if (haandInt ==2) {computersHaand = Haand.SAKS;}
        if (haandInt ==3) {computersHaand = Haand.PAPIR;}
        System.out.println("Computeren slår " + computersHaand);

        // Indlæse spillerens hånd
        Scanner scanner = new Scanner(System.in);
        Haand spillerensHaand = null;
        String spillerensString = scanner.next();
        if (spillerensString.equals("sten")) {spillerensHaand = Haand.STEN;}
        if (spillerensString.equals("saks")) {spillerensHaand = Haand.SAKS;}
        if (spillerensString.equals("papir")) {spillerensHaand = Haand.PAPIR;}
        System.out.println("Spiller slår " + spillerensHaand);

        // Sammneligne dem med slaa() metoden
        int resultat = runde1.slaa(spillerensHaand, computersHaand);

        // Udråbe en vinder
        System.out.println("Resultatet er " + resultat);
        





    }


}
