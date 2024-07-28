public class Subjects{

        public String subject_names[] = new String[6];
        public int index = 0;

        public int getSubjectLength(){
        return subject_names.length;
        }
        public void saveSubjects(String subject){
                System.out.println("Subject Name: "+subject);
                if(this.index < getSubjectLength()){
                subject_names[index] = subject;
                index++;
                System.out.println("Array is NOT FULL");
                }else{
                System.out.println("Array is FULL");
                }
        }
        public void printSubjects(){
                for(int index = 0; index < getSubjectLength(); index++){
                System.out.println(subject_names[index]);
                }
        }
        public String updateSubject(String oldSubject, String newSubject){
                for(int index = 0; index < getSubjectLength(); index++){
                        if(subject_names[index] == oldSubject){
                        subject_names[index] = newSubject;
                        return "Subject Name Successfully Updated";
                        }
                }
                return "Subject Name Not Updated";
        }
        public String deleteSubject(String delete){
                for(int index = 0; index < getSubjectLength(); index++){
                        if(subject_names[index] == delete){
                        subject_names[index] = null;
                        return "Subject Successfully Deleted";
                        }
                }
                return "Subject Not Deleted";
        }
        public String searchSubject(String subject){
                for(String name : subject_names){
                        if(name == subject){
                        return "Subject Name Found: "+subject;
                        }
                }
                return "Subject Not Found";
        }
}