public class Application{

        public static int features(){
        System.out.println("Features of Applications");
        return 10;
        }
        public static String features(String app_name){
        System.out.println("Application Name:"+app_name);
        return "download application";
        }
        public static boolean features(String user_name, int password){
        System.out.println("User Name:"+user_name);
        System.out.println("Password:"+password);
        return true;
        }
        public static int features(int app_size, String availability, boolean install){
        System.out.println("App Size:"+app_size+"MB");
        System.out.println("App Availability:"+availability);
        System.out.println("App is Installed:"+install);
        return 2896;
        }
        public static String features(String story, int no_of_photos, int uploads, int story_views){
        System.out.println("Story Upload:"+story);
        System.out.println("No of Photos:"+no_of_photos);
        System.out.println("No of Uploads:"+uploads);
        System.out.println("Story Views:"+story_views);
        return "Story deleted";
        }
        public static String features(String bio, int no_of_followers, int no_of_following, int no_of_posts, String status){
        System.out.println("Account Bio:"+bio);
        System.out.println("No of Follwers:"+no_of_followers);
        System.out.println("No of Following:"+no_of_following);
        System.out.println("No of Posts:"+no_of_posts);
        System.out.println("Account Status:"+status);
        return "Account is Private";
        }
        public static String features(String post_desc, int likes, int comments, int shares, String top_comment, int views){
        System.out.println("Post Description:"+post_desc);
        System.out.println("Post Likes:"+likes);
        System.out.println("Post Comments:"+comments);
        System.out.println("Total Shares:"+shares);
        System.out.println("Top Comment:"+top_comment);
        System.out.println("Total Views:"+views);
        return "Post has high Reach";
        }
        public static boolean features(int messages, int groups, String sender_name, int total_msgs, String group_name, int no_of_chats, int no_of_groups){
        System.out.println("Messages:"+messages);
        System.out.println("Groups:"+groups);
        System.out.println("Sender Name:"+sender_name);
        System.out.println("Total Msgs:"+total_msgs);
        System.out.println("Group Name:"+group_name);
        System.out.println("No of Chats:"+no_of_chats);
        System.out.println("No of Groups:"+no_of_groups);
        return false;
        }
        public static float features(boolean see, String likedBy, String CommentedBy, String mail, String website, String dob, int createdDate, int year){
        System.out.println("Messages Opened:"+see);
        System.out.println("Liked by:"+likedBy);
        System.out.println("Commented By:"+CommentedBy);
        System.out.println("Mail id:"+mail);
        System.out.println("Website:"+website);
        System.out.println("DOB:"+dob);
        System.out.println("Created on:"+createdDate);
        System.out.println("Year:"+year);
        return 39.5f;
        }
        public static String features(boolean open, boolean camera_permission, boolean storage, boolean mic, boolean location, boolean media, String change_password, int new_password, int old_password){
        System.out.println("App is opened:"+open);
        System.out.println("Camera permission:"+camera_permission);
        System.out.println("Storage Permission:"+storage);
        System.out.println("Microphone Permisiion:"+mic);
        System.out.println("Location Permission:"+location);
        System.out.println("Media Permisiion:"+media);
        System.out.println("Change Password:"+change_password);
        System.out.println("New password:"+new_password);
        System.out.println("Old password:"+old_password);
        return "The End";
        }
}