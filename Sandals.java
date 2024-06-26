public class Sandals {

        public static void main(String args[]){

                String[] sandal_brands = {"Adidas","Nike","Rebook","Sparx"};
                int[] sandal_sizes = {7,8,9,10,11,12};
                String[] sandal_colors = {"White","Blue","Black","Brown"};

                        System.out.println("Sandal Brands:");
                for (int index = 0; index < sandal_brands.length; index++){
                        System.out.println(sandal_brands[index]);
                }
                        System.out.println("Sandal Sizes:");
                for (int index = 0; index < sandal_sizes.length; index++){
                        System.out.println("Size:"+sandal_sizes[index]);
                }
                        System.out.println("Sandal Colors:");
                for (int index = 0; index < sandal_colors.length; index++){
                        System.out.println(sandal_colors[index]);
                }
        }
}