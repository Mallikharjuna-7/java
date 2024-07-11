public class Office {

        public static void officeDetails(){
        System.out.println("OFFICE DETAILS:");
        Office.managerDetails();
        }
        public static void managerDetails(){
        System.out.println("ABOUT MANAGER:");
        System.out.println("Manager Name:Akash");
        System.out.println("Experience: 10 years");
        System.out.println("Salary:25LPA");
        Office.teamLeadDetails();
        }
        public static void teamLeadDetails(){
        System.out.println("ABOUT TEAMLEAD:");
        System.out.println("TL Name:Rakesh");
        System.out.println("Experience: 8 years");
        System.out.println("Salary:21LPA");
        Office.seniorDetails();
        }
        public static void seniorDetails(){
        System.out.println("ABOUT SENIOR CONSULTANT:");
        System.out.println("Senior Consultant Name:Suresh");
        System.out.println("Experience: 7 years");
        System.out.println("Salary:18LPA");
        Office.developerDetails();
        }
        public static void developerDetails(){
        System.out.println("ABOUT DEVELOPER:");
        System.out.println("Developer Name:Akash");
        System.out.println("Experience: 5 years");
        System.out.println("Salary:14LPA");    
        }
}