package Vliegtuig;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Heeft het vliegtuig toestemming van de verkeerstoren? (ja/nee): ");
//        String toestemming = scanner.nextLine();
//
//        System.out.print("Voer het gewicht van de lading in kg in: ");
//        int gewicht = scanner.nextInt();
//
//        double prijs = 0;
//
//        if (toestemming.equalsIgnoreCase("ja")) {
//            if (gewicht <= 1000 || isErTegenwind()) {
//                if (gewicht < 1000) {
//                    prijs = 100;
//                } else if (gewicht < 5000) {
//                    prijs = 500;
//                } else {
//                    prijs = 2500;
//                }
//
//                System.out.print("Voer het aantal passagiers aan boord in: ");
//                int passagiers = scanner.nextInt();
//
//                if (passagiers > 2) {
//                    prijs *= 1.5;
//                }
//
//                System.out.print("Moet de bagage afgehandeld worden door de luchthaven? (ja/nee): ");
//                String bagageAfhandelen = scanner.next();
//
//                if (bagageAfhandelen.equalsIgnoreCase("ja")) {
//                    prijs += 800;
//                }
//
//                if (isNederlandsVliegtuig()) {
//                    double btw = prijs * 0.21;
//                    prijs += btw;
//                }
//
//                System.out.println("De prijs voor landen op Schiphol bedraagt: " + prijs + " euro.");
//                System.out.println("De windkracht/snelheid is: " + getWindsnelheid());
//                System.out.println(isErTegenwind());
//                if(isErTegenwind()){
//                    System.out.println("Er is sprake van tegenwind");
//                } else {
//                    System.out.println("Er is geen sprake van tegenwind");
//                }
////                System.out.println(isNederlandsVliegtuig());
//                if(isNederlandsVliegtuig()){
//                    System.out.println(getRegistratie() + " Het vliegtuig is Nederlands, en de btw is al toegevoegd");
//                } else {
//                    System.out.println(getRegistratie() + " Het vliegtuig is niet Nederlands, en de btw is nog niet toegevoegd");
//                }
//                System.out.println("Het vliegtuig mag opstijgen van luchthaven Schiphol.");
//            } else {
//                System.out.println("Het vliegtuig mag niet opstijgen van luchthaven Schiphol vanwege het gewicht van de lading.");
//            }
//        } else {
//            System.out.println("Het vliegtuig mag niet opstijgen van luchthaven Schiphol zonder toestemming van de verkeerstoren.");
//        }
//    }
//
//    private static boolean isErTegenwind() {
//        // Hieronder wordt een voorbeeld gegeven van de tegenwindsterkte op basis van werkelijke windsnelheden
//        // Pas dit aan met de juiste gegevens voor de tegenwindsterkte op de specifieke locatie
//
//        double windsnelheid = getWindsnelheid(); // Functie om de huidige windsnelheid op te halen (in km/uur)
//
//        // Controleer of de windsnelheid hoger is dan 50 km/uur
//
//        if (windsnelheid > 50) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private static double getWindsnelheid() {
//        // Implementeer de logica om de huidige windsnelheid op te halen
//        // Retourneer de werkelijke windsnelheid (in km/uur) op basis van meetgegevens of een externe service
//        // Hieronder staat een voorbeeld met een willekeurige gegenereerde windsnelheid tussen 0 en 100 km/uur
//
//        return Math.random() * 100;
//    }
//
//    private static boolean isNederlandsVliegtuig() {
//        // Implementeer de logica om te bepalen of het vliegtuig Nederlands is
//        // Return true als het vliegtuig Nederlands is, anders false
//
//        // Voorbeeldlogica: het vliegtuig is Nederlands als de registratie met "NL" begint
//        String registratie = getRegistratie(); // Functie om de registratie van het vliegtuig op te halen
//
//        return registratie.startsWith("NL");
//    }
//
//    private static String getRegistratie() {
//        // Implementeer de logica om de registratie van het vliegtuig op te halen
//        // Retourneer de werkelijke registratie van het vliegtuig
//
//        // Voorbeeld: retourneer een willekeurige registratie die begint met "NL"
//        return "NL" + getRandomString(3);
//    }
//
//    private static String getRandomString(int length) {
//        // Hulpmethode om een willekeurige string van opgegeven lengte te genereren
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        StringBuilder sb = new StringBuilder(length);
//
//        for (int i = 0; i < length; i++) {
//            int randomIndex = (int) (Math.random() * characters.length());
//            sb.append(characters.charAt(randomIndex));
//        }
//
//        return sb.toString();
//    }

}