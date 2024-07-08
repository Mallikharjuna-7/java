public class NetflixRunner{

        public static void main(String args[]){
        Netflix.available();
        Netflix.movies("BAHUBALI");
        System.out.println(Netflix.languages());
        String app_details[] = {"User name:Mallikharjuna","Password:12345","Language:Telugu","Subscrption:Yes"};
        System.out.println(Netflix.getAppDetails(app_details));
        }
}