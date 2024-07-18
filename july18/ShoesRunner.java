public class ShoesRunner{

        public static void main(String args[]){

        Shoes Shoes = new Shoes();

        String available_colors[] = {"Blue","Black","White","Red","Gray"};
        Shoes getShoes = new Shoes("Adidas","Runnig Shoes",(short)14,2999,9.5f,available_colors);
        Shoes getShoes1 = new Shoes("Nike","Sneakers",(short)12,3500,10.1f,available_colors);
        Shoes getShoes2 = new Shoes("Puma","Walking Shoes",(short)11,1800,9.2f,available_colors);
        Shoes getShoes3 = new Shoes("Campus","Casual Shoes",(short)12,1400,9.1f,available_colors);

        }
}