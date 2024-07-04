public class Spotify {

        public static void install(){
                boolean installation = true;
                if (installation){
                        System.out.println("Spotify is Installed");
                }else{
                        System.out.println("Installation Failed");
                }
        }
        public static void user(String user_name){
                if (user_name == "Mallikharjuna"){
                        System.out.println("Welcome to Spotify Mallikharjuna");
                }else{
                        System.out.println("Welcome to Spotify");
                }
        }
        public static String playlist(){
                int songs = 80;
                if (songs > 0){
                        System.out.println("Songs in your Playlist:"+songs);
                        
                }else{
                        System.out.println("No Playlists");
                        
                }
                return "Add your fav Songs to your playlist";
        }
        public static String singers(String singer_details[]){

                        System.out.println("Spotify Top Singers:"); 
                for (int index=0;index < singer_details.length;index++){
                        System.out.println(singer_details[index]);
                }
                return "Listen music on Spotify";
        }
}