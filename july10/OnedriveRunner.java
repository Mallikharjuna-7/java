public class OnedriveRunner{

        public static void main(String[] args){
        System.out.println(Onedrive.storage());
        System.out.println(Onedrive.storage("Amazon cloud"));
        System.out.println(Onedrive.storage(128,"Amazon cloud"));
        System.out.println(Onedrive.storage("mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage(93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage(20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage(24,20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage(35.0f,24,20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage("Tuesday",35.0f,24,20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage(10.0f,"Tuesday",35.0f,24,20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        System.out.println(Onedrive.storage("PDF",10.0f,"Tuesday",35.0f,24,20,93568688363L,"mallikharjuna.xworkz@gmail.com",128,"Amazon cloud"));
        }
}