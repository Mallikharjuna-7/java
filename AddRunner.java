public class AddRunner {

        public static void main(String args[]){
                
                System.out.println("Rahul Pocket Money:"+Add.rahul_pocket_money);
                System.out.println("Suresh Pocket Money:"+Add.suresh_pocket_money);
                System.out.println("Total Pocket Money:"+Add.total_pocket_money);


                if(Add.total_pocket_money == Add.rahul_pocket_money) {
                        System.out.println("Rahul pocket money is equal to the Total pocket money");
                }else{
                        System.out.println("Rahul pocket money is not equal to the Total pocket money.");
                }
        }
}