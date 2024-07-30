public class EntranceTestRunner{

        public static void main(String args[]){

        EntranceTest test = new EntranceTest();

        test.setTestName("GATE");
        test.setCandidateName("Mallikharjuna");
        test.setRegistrationNo(123456789);
        test.setDOB("16-04-2000");
        test.setExamDate("03-02-2024");
        test.setExamTime("10:00 AM");
        test.setMarks(38);
        test.setExamType(true);

        System.out.println("Test Name: "+test.getTestName());
        System.out.println("Candidate Name: "+test.getCandidateName());
        System.out.println("Registration No: "+test.getRegistrationNo());
        System.out.println("Date of Birth: "+test.getDOB());
        System.out.println("Exam Date: "+test.getExamDate());
        System.out.println("Exam Time: "+test.getExamTime());
        System.out.println("Marks Obtained: "+test.getMarks());
        System.out.println("is Computer Based Test: "+test.getExamType());

                if(test.getDOB() == "16-04-2000" && test.getRegistrationNo() == 123456789 ){
                System.out.println("User Found: "+test.getCandidateName()+" Reg_No:"+test.getRegistrationNo());
                }else{
                System.out.println("User Not Found");
                }

                if(test.getMarks() >= 28 ){
                System.out.println("Marks:"+test.getMarks()+" -Qualified");
                }else{
                System.out.println("Marks:"+test.getMarks()+" -Not Qualified");
                }

                if(test.getExamDate() != "03-02-2024"){
                System.out.println("Exam postponed");
                }else{
                System.out.println("Exam Date: "+test.getExamDate());
                }

                if(test.getCandidateName() == "Malli" || test.getRegistrationNo() == 123456789 ){
                System.out.println("Details:");
                System.out.println("Candidate Name: "+test.getCandidateName());
                System.out.println("Registration No: "+test.getRegistrationNo());
                System.out.println("Date of Birth: "+test.getDOB());
                }else{
                System.out.println("No details found");
                }
        }
}