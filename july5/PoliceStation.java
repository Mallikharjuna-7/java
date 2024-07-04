public class PoliceStation {

        public static void inspector(){
                boolean availability = true;
                if (availability){
                System.out.println("Inspector is available in Police Station");
                }else{
                System.out.println("Inspector is Not available");
                }
        }
        public static void station(String station_name){
                if (station_name == "Pitapuram Police Station"){
                System.out.println(station_name);
                }else{
                System.out.println("Police Station");
                }
        }
        public static String cases(){
                int no_of_cases = 40;
                if (no_of_cases > 5){
                System.out.println("Crime Rate is High");
                }else{
                System.out.println("Crime Rate is Low");     
                }
                return "Need Peace";
        }
        public static String stationDetails(String location[]){
                System.out.println("Station Details:"); 
                for (int index = 0; index < location.length; index++){
                System.out.println(location[index]);
                }
                return "Call 100 If you need any help";
        }
}