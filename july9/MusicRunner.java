public class MusicRunner{

        public static void main(String args[]){
        Music.sarigama();
        Music.sarigama(5);
        String[] artists = {"Anirudh","Arjith sing","Shnkar Mahadevan","Karthik"};
        System.out.println(Music.sarigama(artists));
        System.out.println(Music.sarigama("Hungry Cheetah","OG"));
        }
}