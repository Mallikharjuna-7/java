public class Movie{

        public String movie_names[] = new String[4];
        public int index = 0;

        public int getMoivesArrayLength(){
        return movie_names.length;
        }
        public void saveMoviesNames(String m_name){
        System.out.println(m_name);
                if(this.index < getMoivesArrayLength()){
                movie_names[index] = m_name;
                index++;
                System.out.println("Array in NOT FULL");
                }else{
                System.out.println("Array is FULL");
                }
        }
        public void printMovieNames(){
                for(int index = 0; index < getMoivesArrayLength(); index++){
                System.out.println("- "+movie_names[index]);
                }
        }
        public String updateMovieName(String oldMovieName, String newMovieName){
                for(int index = 0; index < getMoivesArrayLength(); index++){
                        if(movie_names[index] == oldMovieName){
                        movie_names[index] = newMovieName;
                        return "Movie Name Updated Successfully";
                        }
                }
                return "Movie Name Not Updated";
        }
        public String deleteMovieName(String delete){
                for(int index = 0; index < getMoivesArrayLength(); index++){
                        if(movie_names[index] == delete){
                        movie_names[index] = null;
                        return "Movie Name deleted Successfully";
                        }
                }
                return "Movie Name Not Deleted";
        }
        public String searchMovieName(String movie){
                for(String name : movie_names){
                        if(name == movie){
                        return "Movie found: "+movie;
                        }
                }
        return "Movie Not Found";
        }

}