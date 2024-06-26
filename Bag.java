public class Bag {

        public static void main(String args[]){

                String[] bag_brands = {"American Tourister","Sky bags","Safari","Dell"};
                int[] bag_sizes = {18,21,26,32,36};
                String[] bag_types = {"Laptop Bags","Luggage Bags","School Bags","Travel Bags"};

                        System.out.println("Bag Brands:");
                for (int index = 0; index < bag_brands.length; index++){
                        System.out.println(bag_brands[index]);
                }
                        System.out.println("Bag Sizes:");
                for (int index = 0; index < bag_sizes.length; index++){
                        System.out.println("Size:"+bag_sizes[index]);
                }
                        System.out.println("Bag Types:");
                for (int index = 0; index < bag_types.length; index++){
                        System.out.println(bag_types[index]);
                }
        }
}