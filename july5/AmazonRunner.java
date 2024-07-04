public class AmazonRunner {

        public static void main(String args[]){
                Amazon.install();
                Amazon.user("Mallikharjuna");
                System.out.println(Amazon.cart());
                String product_details[] = {"Mobile:SAMSUNG","RAM:6GB","Internal Storage:128GB","Price:25,999/-"};
                System.out.println(Amazon.getProductDetails(product_details));
        }
}