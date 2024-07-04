public class MallsRunner {

        public static void main(String args[]){
                Malls.status();
                Malls.mallName("LULU Mall");
                System.out.println(Malls.visits());
                String some_malls[] = {"DLF Mall","LULU Mall","Ambience Mall"};
                System.out.println(Malls.malls(some_malls));
        }
}