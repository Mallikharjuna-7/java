public class Pubs {

        public static void status(){
                boolean open = true;
                if (open){
                System.out.println("Pub is Open");
                }else{
                System.out.println("Pub is Closed");
                }
        }
        public static void name(String pub_name){
                if (pub_name == "THE PUB"){
                System.out.println("Pub is very nice");
                }else{
                System.out.println("Pub name"+pub_name);
                }
        }
        public static String price(){
                int ticket_price = 1500;
                if (ticket_price > 1000){
                System.out.println("Pub cost is high");      
                }else{
                System.out.println("Ticket price"+ticket_price);
                }
                return "Alcohol is injurious to Health";
        }
        public static String getPubDetails(String pub_details[]){
                System.out.println("Pub Details:"); 
                for (int index = 0; index < pub_details.length; index++){
                System.out.println(pub_details[index]);
                }
                return "Pub is open After 8PM";
        }
}