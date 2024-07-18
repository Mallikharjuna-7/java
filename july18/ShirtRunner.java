public class ShirtRunner{

        public static void main(String args[]){

        Shirt Shirt = new Shirt();

        String available_colors[] = {"Blue","Black","White","Green","Brown"};
        Shirt getShirt = new Shirt("Allen Solly","Full Sleeve",(short)42,1500,4.3f,available_colors);
        Shirt getShirt1 = new Shirt("US Polo Assn","Full Sleeve",(short)43,1200,4.3f,available_colors);
        Shirt getShirt2 = new Shirt("H&M","Full Sleeve",(short)41,1800,4.3f,available_colors);
        Shirt getShirt3 = new Shirt("Wrogn","Full Sleeve",(short)42,1400,4.3f,available_colors);

        }
}