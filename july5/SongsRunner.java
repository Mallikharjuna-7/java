public class SongsRunner {

        public static void main(String args[]){
                Songs.song();
                Songs.songName("Theme of Kalki");
                System.out.println(Songs.list());
                String song_details[] = {"Song Name:Butta Bomma","Singer:Armaan Malik","Movie Name:Ala VaikuntaPuramulo"};
                System.out.println(Songs.getSongDetails(song_details));
        }
}