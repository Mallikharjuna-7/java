public class Book{

        public static void theBook(){
        String book_name = "Classmate";
        System.out.println("Book:"+book_name);
        }
        public static void theBook(int pages){
        System.out.println("Pages:"+pages+"pages");
        }
        public static void theBook(String manufactured_by){
        System.out.println("Manufactured By:"+manufactured_by);
        }
        public static String theBook(int book_price, String type){
        System.out.println("Book Price:"+book_price);
        System.out.println("Book Size:"+type);
        return "Classmate books are high quality";
        }
}