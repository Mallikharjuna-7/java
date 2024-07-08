public class MyntraRunner {

        public static void main(String args[]){
        Myntra.getMyntra();
        Myntra.getMyntra(40);
        String[] cartdetails = {"2 shirts","2 pants","2 Shorts"};
        System.out.println(Myntra.getMyntra(cartdetails));
        System.out.println(Myntra.getMyntra(5500,1000));
        }
}