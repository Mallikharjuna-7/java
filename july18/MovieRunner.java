public class MovieRunner{

        public static void main(String args[]){

        Movie Movie = new Movie();

        String popular_movies[] = {"Bahubali","Puspha","RRR","Kalki"};
        Movie getMovie = new Movie("KGF","Prashanth Neel",(short)6,300,4.5f,popular_movies);
        Movie getMovie1 = new Movie("Eega","Rajamouli",(short)4,250,4.5f,popular_movies);
        Movie getMovie2 = new Movie("Rangasthalam","Sukumar",(short)6,200,4.4f,popular_movies);
        Movie getMovie3 = new Movie("Hanuman","Prashanth Varma",(short)7,250,4.5f,popular_movies);

        }
}