public class FacebookRunner{

        public static void main(String args[]){

        Facebook Facebook = new Facebook();
        Facebook getFb1 = new Facebook("Mallikharjun");
        Facebook getFb2 = new Facebook("Mallikharjun","@mallikharjuna_7");
        Facebook getFb3 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123");
        Facebook getFb4 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240);
        Facebook getFb5 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com");
        Facebook getFb6 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com","Dec 2016");
        Facebook getFb7 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com","Dec 2016",462);
        Facebook getFb8 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com","Dec 2016",462,156);
        Facebook getFb9 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com","Dec 2016",462,156,true);
        Facebook getFb10 = new Facebook("Mallikharjun","@mallikharjuna_7","ABC123",(short)240,"abc@gmail.com","Dec 2016",462,156,true,78);
        }
}