public class FacebookRunner{

        public static void main(String args[]){

        Facebook fb = new Facebook();
        Facebook getFB = new Facebook("Mark Zuckerberg","Mark Zuckerberg",
        "04-02-2004",71,"Blue","Mallikharjun",123456,4.6,50000000,"Meta Platforms");

        getFB.fb1();
        getFB.fb2(getFB.founder);
        System.out.println(getFB.fb3());
        System.out.println(getFB.fb4(getFB.user_name));
        }
}