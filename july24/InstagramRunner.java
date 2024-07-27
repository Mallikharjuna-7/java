public class InstagramRunner{

        public static void main(String args[]){

        Instagram insta = new Instagram();
        Instagram getInsta = new Instagram("Kevin Systrom","Adam Mosseri",
        "06-10-2010",110,"Red","Mallikharjun",786532,4.3,60000000,"Instagram Platforms");

        getInsta.insta1();
        getInsta.insta2(getInsta.founder);
        System.out.println(getInsta.insta3());
        System.out.println(getInsta.insta4(getInsta.user_name));
        }
}