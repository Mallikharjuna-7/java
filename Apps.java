public class Apps {

        public static void main(String args[]){

                String[] app_names = {"WhatsApp","Facebook","Instagram","Youtube"};
                int[] app_size = {48,110,80,40};
                String[] permissions = {"Camera","Contacts","Location","Microphone","Media"};

                        System.out.println("App Names:");
                for (int index=0; index < app_names.length; index++){
                        System.out.println(app_names[index]);
                }
                        System.out.println("App Size:");
                for (int index=0; index < app_size.length; index++){
                        System.out.println(app_size[index]);
                }
                        System.out.println("Permissions:");
                for (int index=0; index < permissions.length; index++){
                        System.out.println(permissions[index]);
                }
        }
}