public class ApplicationRunner {

        public static void main(String args[]){

                long downloads = 5000000000L;
                String permissions = "Reqires access to Contacts, Camera, Microphone, Storage, Location";
                String security = "End-to-end encryption for messages,Two-step verification";
                String intigration = "Instagram, Facebook";
                String support = "Help center, FAQs";
                String updates = "Regular Updates for bug fixes";
                boolean privacy_policy = true;
                boolean support_multidevice = true;


                System.out.println("***APPLICATION:***");
                System.out.println("Application Name:"+Application.application_name);
                System.out.println("Developed By:"+Application.developers);
                System.out.println("Platforms:"+Application.platforms);
                System.out.println("Version:"+Application.version);
                System.out.println("Application Size:"+Application.size);
                System.out.println("Initial Release:"+Application.initial_release);
                System.out.println("Features:"+Application.features);
                System.out.println("Languages Support:"+Application.languages);
                System.out.println("Application Rating:"+Application.rating);
                System.out.println("Downloads:"+downloads);
                System.out.println("Permissions:"+permissions);
                System.out.println("Security Features:"+security);
                System.out.println("Intigrated with:"+intigration);
                System.out.println("Customer Support:"+support);
                System.out.println("Updates:"+updates);
                System.out.println("Privacy Policy:"+privacy_policy);
                System.out.println("Multidevice Support:"+support_multidevice);


        }
}