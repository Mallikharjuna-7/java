public class Payrole{

        public static String payroleDetails(){
        return "About Payrole";
        }
        public static String payroleDetails(String name){
        return "Payrole :"+name;
        }
        public static String payroleDetails(String name, String role){
        return "Payrole :"+name+" Role:"+role;
        }
        public static String payroleDetails(String name, String role, int amount){
        return "Payrole:"+name+" Role :"+role+" Salary :"+amount+"Rs";
        }
        public static String payroleDetails(String name, String role, int amount, double tax){
        return "Payrole :"+name+" Role :"+role+" Salary :"+amount+"Rs"+ " Tax :"+tax+"%";
        }
        public static String payroleDetails(String name, String role, int amount, double tax, int experience){
        return "Payrole:"+name+" Role :"+role+" Salary :"+amount+"Rs"+ " Tax :"+tax+"%"+" Experience :"+experience;
        }
        public static String payroleDetails(String name, String role, int amount, double tax, int experience, String manager){
        return "Payrole:"+name+" Role :"+role+" Salary :"+amount+"Rs"+ " Tax :"+tax+"%"+" Experience :"+experience+" Manager Name : "+manager;
        }
        public static String payroleDetails(String name, String role, int amount, double tax, int experience, String manager, boolean working){
        return "Payrole :"+name+" Role :"+role+" Salary :"+amount+"Rs"+ " Tax :"+tax+"%"+" Experience :"+experience+" Manager Name : "+manager+"Working day"+working;
        }
}