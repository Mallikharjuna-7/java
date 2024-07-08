public class Netflix {

        public static void available(){
        boolean availabilaty = true;
                if (availabilaty){
                System.out.println("Netflix available in App store");
                }else{
                System.out.println("Netflix not avaialble in App store");
                }
        }
        public static void movies(String movie){
                if (movie == "KALKI 2989AD"){
                System.out.println("KALKI 2989AD available in Netflix");
                }else{
                System.out.println("Movie Not yet released in OTT");
                }
        }
        public static String[] languages(){
        int supported_languages = 45;
        String[] language = {"Enlish","Hindi","Telugu","Kannada","Tamil"};
                if (supported_languages > 0){
                System.out.println("Supported languages:"+supported_languages);
                }else{
                System.out.println("Not support other languages");
                }
                for(int index = 0; index < language.length; index++){
                }
                return language;
        }
        public static String[] getAppDetails(String app_details[]){
                String[] otts = {"Aha","Prime","Hotstar"};
                System.out.println("APP details:"); 
                for (int index = 0; index < app_details.length; index++){
                System.out.println(app_details[index]);
                }
               return otts;
        }
}