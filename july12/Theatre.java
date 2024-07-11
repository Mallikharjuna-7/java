public class Theatre {

        public static String theatre_name = "Tirumala 4k Dolby Atmos";
        public static int total_floors = 2;
        public static int total_seats = 300;
        public static int tick_price = 250;

        public static void getTheatre(){
        int booked_seats = 250;
        int seat_no = 47;
        double rating = 4.6;
        boolean is3d = true;
        System.out.println("Already Booked Seats:"+booked_seats);
        System.out.println("Your Seat No:"+seat_no);
        System.out.println("Rating:"+rating);
        System.out.println("is 3D available:"+is3d);
        }
        public static void aboutTheatre(String location, boolean parking){
        String theatre_location = location;
        boolean theatre_parking = parking;
        System.out.println("Theatre Location:"+theatre_location);
        System.out.println("is Parking available:"+theatre_parking);
        }
}