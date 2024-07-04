public class MoviesRunner {

        public static void main(String args[]){
                Movies.review();
                Movies.name("Kalki 2898AD");
                System.out.println(Movies.ticket());
                String kalki[] = {"Lead:Prabhas","Director:Nag Aswin","Music:Santhosh Narayanan","Producer:Aswani Dutt"};
                System.out.println(Movies.movieDetails(kalki));
        }
}