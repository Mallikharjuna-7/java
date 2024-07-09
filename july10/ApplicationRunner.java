public class ApplicationRunner {

        public static void main(String args[]){
        System.out.println(Application.features());
        System.out.println(Application.features("Instagram"));
        System.out.println(Application.features("Mallikharjuna",123456));
        System.out.println(Application.features(48,"PlayStore & AppStore",true));
        System.out.println(Application.features("My photo",1,4,50));
        System.out.println(Application.features("Creator",500,150,45,"Active"));
        System.out.println(Application.features("No caption",200,35,96,"Excellent",400));
        System.out.println(Application.features(2,3,"Ganesh",5,"Friends",6,4));
        System.out.println(Application.features(true,"Ganesh","Suresh","abcd@gamil.com","www.abcd.com","01.01.2020",15,2018));
        System.out.println(Application.features(false,true,true,true,true,true,"Password is Changed",223344,12345678));
        }
}