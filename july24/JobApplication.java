public class JobApplication{

        public String name;
        public int age;
        public String qualification;
        public int year_of_pass;
        public int ssc_marks;
        public double degree_percentage;
        public int experince;
        public String skills[];

        public JobApplication(){
        System.out.println("Job Application Details:");
        }
        public JobApplication(String name,int age,String qualification,int year_of_pass,int ssc_marks,
        double degree_percentage,int experince,String skills[]){
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.year_of_pass = year_of_pass;
        this.ssc_marks = ssc_marks;
        this.degree_percentage = degree_percentage;
        this.experince = experince;
        this.skills = skills;
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Qualification:"+qualification);
        System.out.println("Year Of Pass:"+year_of_pass);
        System.out.println("SSC Marks:"+ssc_marks);
        System.out.println("Degree Percentage:"+degree_percentage);
        System.out.println("Experience:"+experince);
                for(int index = 0; index < skills.length; index++){
                System.out.println("Skills:"+skills[index]);
                }

        }
        public void ageCheck1(){
                if(this.age < 18){
                System.out.println("Not Eligible for Job");
                }else{
                System.out.println("Eligible for Job");
                }
        }
        public void ageCheck2(int age, String qualification){
                if(this.age > age && this.qualification == qualification){
                System.out.println("Eligible for Applying Software Jobs");
                }else{
                System.out.println("Not Eligible for Applying Software Jobs");
                }
        }
        public String eligibleCheck(String qualification, String skills[]){
                if(this.qualification == qualification && this.skills == skills){
                System.out.println("Eligible for Applying Java Developer Jobs");
                return this.qualification;
                }else{
                System.out.println("Not Eligible for Applying Java Developer Jobs");
                return this.qualification;
                }
        }
        public double degreeCheck(){
                if(this.degree_percentage > 0.5){
                System.out.println("Eligible for Applying Software Developer Jobs");
                return this.degree_percentage;
                }else{
                System.out.println("Not Eligible for Applying Software Developer Jobs");
                return this.degree_percentage;
                }
        }
        

}