public class SpotifyRunner {

        public static void main(String args[]){

                Spotify.install();
                Spotify.user("Mallikharjuna");
                System.out.println(Spotify.playlist());
                String singer_details[] = {"Sid Sriram","Harris Jayaraj","DeviSri Prasad","Manisharma","Anirudh"};
                System.out.println(Spotify.singers(singer_details));
        }
}