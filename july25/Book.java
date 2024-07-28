public class Book{

        public static void getBook(){
        System.out.println("Book Details:");
        Book.getBook("Wings Of Fire");
        }
        public static void getBook(String name){
        System.out.println("Book Name:"+name);
        Book.getBook("Wings Of Fire",230);
        }
        public static void getBook(String name,int pages){
        System.out.println("Book Name:"+name);
        System.out.println("Book Pages:"+pages);
        Book.getBook("Wings Of Fire",230,"A.P.J.Abdul Kalam");
        }
        public static void getBook(String name,int pages,String author){
        System.out.println("Book Name:"+name);
        System.out.println("Book Pages:"+pages);
        System.out.println("Book Author:"+author);
        Book.getBook("Wings Of Fire",230,"A.P.J.Abdul Kalam",599);
        }
        public static void getBook(String name,int pages,String author,int price){
        System.out.println("Book Name:"+name);
        System.out.println("Book Pages:"+pages);
        System.out.println("Book Author:"+author);
        System.out.println("Book Price:"+price);
        }
}