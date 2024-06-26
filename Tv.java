public class Tv {

        public static void main(String args[]){

                String[] tv_brands = {"LG","SAMSUNG","SONY","MI"};
                long[] prices = {45000L,48000L,65000L,35000L};
                int[] display_sizes = {32,43,55,65};

                        System.out.println("Tv Brand Names:");
                for (int index=0; index < tv_brands.length; index++){
                        System.out.println("Tv Brand:"+tv_brands[index]);
                }
                        System.out.println("TV Prices:");
                for (int index=0; index < prices.length; index++){
                        System.out.println("Price:"+prices[index]);
                }
                        System.out.println("TV Sizes:");
                for (int index=0; index < display_sizes.length; index++){
                        System.out.println("Size:"+display_sizes[index]);
                }
        }
}