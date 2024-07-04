public class PubsRunner {

        public static void main(String args[]){
                Pubs.status();
                Pubs.name("THE PUB");
                System.out.println(Pubs.price());
                String pub_details[] = {"Pub Name:THE TRIO","Owner:ABCDEF","Alcohol availabe:Yes"};
                System.out.println(Pubs.getPubDetails(pub_details));
        }
}