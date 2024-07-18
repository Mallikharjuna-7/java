public class ShoppingRunner{

        public static void main(String args[]){

        Shopping Shopping = new Shopping();
        Shopping getShopping1 = new Shopping("Levis");
        Shopping getShopping2 = new Shopping("Levis","Casual");
        Shopping getShopping3 = new Shopping("Levis","Casual","Jeans");
        Shopping getShopping4 = new Shopping("Levis","Casual","Jeans",(short)42);
        Shopping getShopping5 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue");
        Shopping getShopping6 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue","Denim");
        Shopping getShopping7 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue","Denim",2999);
        Shopping getShopping8 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue","Denim",2999,500);
        Shopping getShopping9 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue","Denim",2999,500,true);
        Shopping getShopping10 = new Shopping("Levis","Casual","Jeans",(short)42,"Blue","Denim",2999,500,true,4.6f);
        }
}