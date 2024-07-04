public class Movies {

        public static void review(){
               boolean review = true;
                if (review){
                System.out.println("Movie is Good");
                }else{
                System.out.println("Movie was Not good");
                }
        }
        public static void name(String movie_name){
                if(movie_name == "Kalki 2898AD"){
                System.out.println("Prbhas as Karna in Kalki Movie");
                }else{
                System.out.println("Movie Name:"+movie_name);
                }
        }
        public static String ticket(){
                boolean tickets = true;
                if(tickets){
                System.out.println("Tickets is Available");
                }else{
                System.out.println("House Full");
                }
                return "Ticket Cost:250";
        }
        public static String movieDetails(String kalki[]){
                System.out.println("Kalki Movie Details:");
                for (int index = 0; index < kalki.length; index++){
                System.out.println(kalki[index]);
                }
                return "Waiting for OG movie";
        }
}