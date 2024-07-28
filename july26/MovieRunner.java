public class MovieRunner{

        public static void main(String args[]){

        Movie getMovie = new Movie();

        getMovie.saveMoviesNames("Bahubali");
        getMovie.saveMoviesNames("Pushpa");
        getMovie.saveMoviesNames("RRR");
        getMovie.saveMoviesNames("Kalki");
        getMovie.saveMoviesNames("Saaho");

        getMovie.printMovieNames();

        String updateResult = getMovie.updateMovieName("RRR","Devara");
        System.out.println("Update Result: "+updateResult);
        getMovie.printMovieNames();

        String deleteResult = getMovie.deleteMovieName("Pushpa");
        System.out.println("Delete Result: "+deleteResult);
        getMovie.printMovieNames();

        String searchResult = getMovie.searchMovieName("Kalki");
        System.out.println("Search Result: "+searchResult);
        }
}