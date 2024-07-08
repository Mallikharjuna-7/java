public class Abhibus {
        
        public static void travells(){
        int seat_no = 36 ;
        System.out.println("Seat NO:"+seat_no);
        }
        public static void travells(String start){
        System.out.println("Starting point:"+start);
        }
        public static String travells(int start_time, String destination){
        System.out.println("Starting Time:"+start_time+"PM");
        System.out.println("Destination:"+destination);
        return "total 8 stops will be there";
        }
        public static String travells(int ticket_price){
        System.out.println("Ticket Price:"+ticket_price);
        return "Happy journey";
        }
}