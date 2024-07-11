public class TheatreRunner{

        public static void main(String args[]){
        System.out.println("Theatre Name:"+Theatre.theatre_name);
        System.out.println("No of Floors:"+Theatre.total_floors);
        System.out.println("No of Seats:"+Theatre.total_seats);
        System.out.println("Ticket Price:"+Theatre.tick_price);
        Theatre.getTheatre();
        Theatre.aboutTheatre("HSR Layout",true);
        }
}