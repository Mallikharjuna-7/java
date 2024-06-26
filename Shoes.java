public class Shoes {

        public static void main(String args[]){

                String[] shoe_brands = {"Adidas","Nike","Puma","Sparx"};
                int[] shoe_sizes = {7,8,9,10,11,12};
                String[] shoe_colors = {"White","Blue","Black","Brown"};

                        System.out.println("Shoe Brands:");
                for (int index = 0; index < shoe_brands.length; index++){
                        System.out.println(shoe_brands[index]);
                }
                        System.out.println("Shoe Sizes:");
                for (int index = 0; index < shoe_sizes.length; index++){
                        System.out.println("Size:"+shoe_sizes[index]);
                }
                        System.out.println("Shoe Colors:");
                for (int index = 0; index < shoe_colors.length; index++){
                        System.out.println(shoe_colors[index]);
                }
        }
}