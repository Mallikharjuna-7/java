public class FacebookRunner{

        public static void main(String args[]){

        Facebook fb = new Facebook();

        fb.setUsername("Mallikharjuna");
        System.out.println("User Name: "+fb.getUsername());

        fb.setNoOfFriends(260);
        System.out.println("No of Friends: "+fb.getNoOfFriends());

        fb.setNoOfPosts(70);
        System.out.println("No of Posts: "+fb.getNoOfPosts());

        fb.setAccountCreatedYear(2016);
        System.out.println("Created in: "+fb.getAccountCreatedYear());

        fb.setActiveStatus(true);
        System.out.println("is Accout Active: "+fb.getActiveStatus());

        if(fb.getNoOfPosts() > 50 ){
        System.out.println("User Name: "+fb.getUsername());
        System.out.println("No of Posts: "+fb.getNoOfPosts());
        }else{
        System.out.println("No posts");       
        }
        if(fb.getUsername() == "Mallikharjuna" && fb.getAccountCreatedYear() == 2016){
        System.out.println("Details found:");
        System.out.println("User Name: "+fb.getUsername());
        System.out.println("No of Friends: "+fb.getNoOfFriends());
        System.out.println("No of Posts: "+fb.getNoOfPosts());
        System.out.println("Created in: "+fb.getAccountCreatedYear());
        System.out.println("is Accout Active: "+fb.getActiveStatus());
        }else{
        System.out.println("Details not found");
        }

        }
}