public class Pg {

        public static String pg_name = "Uma Maheswari Gents PG";
        public static int total_floors = 5;
        public static int total_rooms = 50;
        public static int total_people_in_pg = 120;

        public static void getPG(){
        int rent = 7000;
        int sharing = 2;
        double rating = 4.6;
        boolean lift = true;
        System.out.println("Rent:"+rent);
        System.out.println("Sharing:"+sharing);
        System.out.println("Rating:"+rating);
        System.out.println("Lift available:"+lift);
        }
        public static void aboutPG(String location, boolean parking){
        String pg_location = location;
        boolean pg_parking = parking;
        System.out.println("PG Location:"+pg_location);
        System.out.println("is Parking available:"+pg_parking);
        }
}