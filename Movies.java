public class Movies {

        public static void main(String args[]){

                String[] movie_names = {"BAHUBALI","RRR","PUSHPA","OG","BHEEMLA NAYAK"};
                String[] actor_names = {"Ram Charan","Prabhas","Allu Arjun","NTR","Pawan Kalyan"};
                float[] collections = {600.00f,1387.26f,373.00f,193.00f};

                        System.out.println("Movies Names:");
                for (int index = 0; index < movie_names.length; index++){
                        System.out.println(movie_names[index]);
                }
                        System.out.println("Actor Names:");
                for (int index = 0; index < actor_names.length; index++){
                        System.out.println(actor_names[index]);
                }
                        System.out.println("Movie Collections:");
                for (int index = 0; index < collections.length; index++){
                        System.out.println(collections[index]);
                }
        }
}