public class Course{

        public String course_names[] = new String[5];
        public int index = 0;

        public int courseArrayLength(){
        return course_names.length;
        }
        public void saveCourse(String course){
        System.out.println("Cousre: "+course);
                if(this.index < courseArrayLength()){
                course_names[index] = course;
                index++;
                System.out.println("Course Array is NOT FULL");
                }else{
                System.out.println("Course Array is FULL");
                }
        }
        public void printCourse(){
                for(int index = 0; index < courseArrayLength(); index++){
                System.out.println("+ "+course_names[index]);
                }
        }
        public String updateCourse(String oldCourse, String newCourse){
                for(int index = 0; index < courseArrayLength(); index++){
                        if(course_names[index] == oldCourse){
                        course_names[index] = newCourse;
                        return "Course Name Updated Successfully";
                        }
                }
                return "Course Name Not Updated";
        }
        public String deleteCourse(String delete){
                for(int index = 0; index < courseArrayLength(); index++){
                        if(course_names[index] == delete){
                        course_names[index] = null;
                        return "Course Name Deleted Successfully";
                        }
                }
                return "Course Not Deleted";
        }
        public String searchCourse(String search){
                for(String name : course_names){
                        if(name == search){
                        return "Cousre Found: "+search;
                        }
                }
                return "Course Not Found";
        }
}