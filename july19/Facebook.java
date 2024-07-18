public class Facebook {

        public String name;
        public String userId;
        public String password;
        public short no_of_posts;
        public String mail;
        public String joined;
        public int friends;
        public int requests;
        public boolean profile_locked;
        public int app_size;

        public Facebook(){
        System.out.println("Facebook Details:");
        }
        public Facebook(String name){
        this.name = name;
        System.out.println("Name:"+name);
        }
        public Facebook(String name,String userId){
        this.name = name;
        this.userId = userId;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        }
        public Facebook(String name,String userId,String password){
        this.name = name;
        this.userId = userId;
        this.password = password;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        }
        public Facebook(String name,String userId,String password,short no_of_posts){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail,String joined){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        this.joined = joined;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        System.out.println("joined:"+joined);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail,String joined,int friends){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        this.joined = joined;
        this.friends = friends;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        System.out.println("joined:"+joined);
        System.out.println("friends:"+friends);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail,String joined,int friends,int requests){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        this.joined = joined;
        this.friends = friends;
        this.requests = requests;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        System.out.println("joined:"+joined);
        System.out.println("friends:"+friends);
        System.out.println("requests:"+requests);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail,String joined,int friends,int requests,boolean profile_locked){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        this.joined = joined;
        this.friends = friends;
        this.requests = requests;
        this.profile_locked = profile_locked;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        System.out.println("joined:"+joined);
        System.out.println("friends:"+friends);
        System.out.println("requests:"+requests);
        System.out.println("profile_locked Available:"+profile_locked);
        }
        public Facebook(String name,String userId,String password,short no_of_posts,String mail,String joined,int friends,int requests,boolean profile_locked,int app_size){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.no_of_posts = no_of_posts;
        this.mail = mail;
        this.joined = joined;
        this.friends = friends;
        this.requests = requests;
        this.profile_locked = profile_locked;
        this.app_size = app_size;
        System.out.println("Name:"+name);
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("no_of_posts:"+no_of_posts);
        System.out.println("mail:"+mail);
        System.out.println("joined:"+joined);
        System.out.println("friends:"+friends);
        System.out.println("requests:"+requests);
        System.out.println("profile_locked Available:"+profile_locked);
        System.out.println("app_size:"+app_size);
        }
}