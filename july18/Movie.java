public class Movie{

        public String movie_name;
        public String movie_director;
        public short movie_songs;
        public int movie_ticketPrice;
        public float movie_rating;
        public String popular_movies[];

        public Movie(){
        System.out.println("Movie Details:");
        }
        public Movie(String movie_name,String movie_director,short movie_songs,int movie_ticketPrice,float movie_rating,String popular_movies[]){
        this.movie_name = movie_name;
        this.movie_director = movie_director;
        this.movie_songs = movie_songs;
        this.movie_ticketPrice = movie_ticketPrice;
        this.movie_rating = movie_rating;
        this.popular_movies = popular_movies;

        System.out.println("Movie name:"+movie_name);
        System.out.println("Movie director:"+movie_director);
        System.out.println("Movie songs:"+movie_songs);
        System.out.println("Movie ticketPrice:"+movie_ticketPrice);
        System.out.println("Movie Rating:"+movie_rating);
                for(int index = 0; index < popular_movies.length; index++){
                System.out.println("Popular Movies:"+popular_movies[index]);
                }

        }

}