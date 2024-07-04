public class Songs {

        public static void song(){
                boolean song = true;
                if (song){
                System.out.println("Song is Playing");
                }else{
                System.out.println("Song is Paused");
                }
        }
        public static void songName(String song_name){
                if (song_name == "Theme of Kalki"){
                System.out.println("Song was Good");
                }else{
                System.out.println("Song Name:"+song_name);
                }
        }
        public static String list(){
                int total_songs = 1600;
                if (total_songs > 1000){
                System.out.println("Playlist is Big");      
                }else{
                System.out.println("No of Songs:"+total_songs);
                }
                return "Song is Trending Now";
        }
        public static String getSongDetails(String song_details[]){
                System.out.println("Song details:"); 
                for (int index = 0; index < song_details.length; index++){
                System.out.println(song_details[index]);
                }
                return "Music Lover";
        }
}