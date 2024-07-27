public class Instagram{

        public String founder;
        public String ceo;
        public String launch_date;
        public int app_size;
        public String app_color;
        public String user_name;
        public int password;
        public double app_rating;
        public int downloads;
        public String developed_by;

        public Instagram(){
        System.out.println("About Instagram:");
        }
        public Instagram(String founder,String ceo,String launch_date, int app_size,String app_color,
        String user_name,int password,double app_rating,int downloads,String developed_by){
        this.founder = founder;
        this.ceo = ceo;
        this.launch_date = launch_date;
        this.app_size = app_size;
        this.app_color = app_color;
        this.user_name = user_name;
        this.password = password;
        this.app_rating = app_rating;
        this.downloads = downloads;
        this.developed_by = developed_by;

        System.out.println("founder:"+founder);
        System.out.println("ceo:"+ceo);
        System.out.println("launch_date:"+launch_date);
        System.out.println("app_size:"+app_size);
        System.out.println("app_color:"+app_color);
        System.out.println("user_name:"+user_name);
        System.out.println("password:"+password);
        System.out.println("app_rating:"+app_rating);
        System.out.println("downloads:"+downloads);
        System.out.println("developed_by:"+developed_by);
        }

        public void insta1(){
        System.out.println("With out return type and parameters");
        }
        public void insta2(String founder){
                if(this.founder == founder){
                System.out.println("founder:"+founder);
                }else{
                System.out.println("No name found");
                }
        }
        public int insta3(){
                if(this.app_size == 110){
                return this.app_size;
                }else{
                return 0;
                }
        }
        public String insta4(String user_name){
                if(this.user_name == user_name){
                System.out.println("user_name:"+user_name);
                return this.developed_by;
                }else{
                System.out.println("User Not Found");
                return this.developed_by;
                }
        }
        
}