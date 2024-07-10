public class PayroleRunner{
        
        public static void main(String[] args){
        System.out.println(Payrole.payroleDetails());
        System.out.println(Payrole.payroleDetails("Mallikharjuna"));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer"));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer",1200000));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer",1200000,30.0));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer",1200000,30.0,3));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer",1200000,30.0,3,"Rakesh"));
        System.out.println(Payrole.payroleDetails("Mallikharjuna","Developer",1200000,30.0,3,"Rakesh",false));
        }
}