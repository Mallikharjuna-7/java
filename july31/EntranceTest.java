//Encapsulation..

public class EntranceTest{

        private String test_name;
        private String candidate_name;
        private int registration_no;
        private String date_of_birth;
        private String exam_date;
        private String exam_time;
        private int marks_obtained;
        private boolean isComputerBasedTest;

        public EntranceTest(){
        System.out.println("TEST DETAILS:");
        }
        public EntranceTest(String test_name, String candidate_name,int registration_no,String date_of_birth,
        String exam_date,String exam_time,int marks_obtained,boolean isComputerBasedTest){
        this.test_name = test_name;
        this.candidate_name = candidate_name;
        this.registration_no = registration_no;
        this.date_of_birth = date_of_birth;
        this.exam_date = exam_date;
        this.exam_time = exam_time;
        this.marks_obtained = marks_obtained;
        this.isComputerBasedTest = isComputerBasedTest;      
        }

        public void setTestName(String test_name){
        this.test_name = test_name;
        }
        public String getTestName(){
        return this.test_name;
        }
        public void setCandidateName(String candidate_name){
        this.candidate_name = candidate_name;
        }
        public String getCandidateName(){
        return this.candidate_name;
        }
        public void setRegistrationNo(int registration_no){
        this.registration_no = registration_no;
        }
        public int getRegistrationNo(){
        return this.registration_no;
        }
        public void setDOB(String date_of_birth){
        this.date_of_birth = date_of_birth;
        }
        public String getDOB(){
        return this.date_of_birth;
        }
        public void setExamDate(String exam_date){
        this.exam_date = exam_date;
        }
        public String getExamDate(){
        return this.exam_date;
        }
        public void setExamTime(String exam_time){
        this.exam_time = exam_time;
        }
        public String getExamTime(){
        return this.exam_time;
        }
        public void setMarks(int marks_obtained){
        this.marks_obtained = marks_obtained;
        }
        public int getMarks(){
        return this.marks_obtained;
        }
        public void setExamType(boolean isComputerBasedTest){
        this.isComputerBasedTest = isComputerBasedTest;
        }
        public boolean getExamType(){
        return this.isComputerBasedTest;
        }
}