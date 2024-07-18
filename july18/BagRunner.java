public class BagRunner{

        public static void main(String args[]){

        Bag Bag = new Bag();

        String available_colors[] = {"Maroon","Black","Skyblue","Red","Gray"};
        Bag getBag = new Bag("American Tourister","Travel Bag",(short)35,2999,2.6f,available_colors);
        Bag getBag1 = new Bag("Sky Bags","Scool Bag",(short)30,1800,1.5f,available_colors);
        Bag getBag2 = new Bag("Dell","Laptop Bag",(short)26,1200,0.6f,available_colors);
        Bag getBag3 = new Bag("WildCraft","Laguage Bag",(short)75,2300,2.0f,available_colors);

        }
}