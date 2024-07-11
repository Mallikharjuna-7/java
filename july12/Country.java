public class Country {

        static String name;
        static int population;
        static String capital;
        static int establishmentYear;
        static double gdp;
        static String continent;
        static String president;
        static int area;
        static boolean isDeveloped;
        static double literacyRate;

        public static void setName() {
        name = "Freedonia";
        System.out.println("Name: " + name);
        }
        public static void setPopulation() {
        population = 50000000;
        System.out.println("Population: " + population);
        }
        public static void setCapital() {
        capital = "Libertapolis";
        System.out.println("Capital: " + capital);
        }
        public static void setEstablishmentYear() {
        establishmentYear = 1776;
        System.out.println("Establishment Year: " + establishmentYear);
        }
        public static void setGdp() {
        gdp = 3.5;
        System.out.println("GDP: " + gdp + " trillion USD");
        }
        public static void setContinent() {
        continent = "North America";
        System.out.println("Continent: " + continent);
        }
        public static void setPresident() {
        president = "Jane Smith";
        System.out.println("President: " + president);
        }
        public static void setArea() {
        area = 950000; // in square kilometers
        System.out.println("Area: " + area + " square kilometers");
        }
        public static void setIsDeveloped() {
        isDeveloped = true;
        System.out.println("Is Developed: " + isDeveloped);
        }
        public static void setLiteracyRate() {
        literacyRate = 99.5;
        System.out.println("Literacy Rate: " + literacyRate + "%");
        }
}