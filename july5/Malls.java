public class Malls {

        public static void status(){
                boolean open = true;
                if (open){
                System.out.println("Mall is Opened");
                }else{
                System.out.println("Mall is Closed");
                }
        }
        public static void mallName(String mall_name){
                if (mall_name == "LULU Mall"){
                System.out.println("LULU Mall is the 2nd Biggest Mall in India");
                }else{
                System.out.println("Mall Name:"+mall_name);
                }
        }
        public static String visits(){
                int peoples = 10000;
                if (peoples > 5000){
                System.out.println("Mall is very busy");      
                }else{
                System.out.println("Today visitors:"+peoples);
                }
                return "In weekends Mall is very Busy";
        }
        public static String malls(String some_malls[]){
                System.out.println("Top Malls in India"); 
                for (int index = 0; index < some_malls.length; index++){
                System.out.println(some_malls[index]);
                }
                return "Mall is Looking Good";
        }
}