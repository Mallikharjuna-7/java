public class Music {

        public static void sarigama(){
        String music_app = "Jio Saavan";
        System.out.println("Music App:"+music_app);
        }
        public static void sarigama(int playlist){
        System.out.println("No of Playlists:"+playlist);
        }
        public static String sarigama(String[] artists){
        System.out.println("Artists Names:");
        for (int index = 0; index < artists.length; index++){
        System.out.println(artists[index]);
        }
        return "Anirudh songs are in now trending";
        }
        public static String sarigama(String song, String movie){
        System.out.println("Song Name:"+song);
        System.out.println("Movie Name:"+movie);
        return "Set your fav song as your callertune";
        }
}