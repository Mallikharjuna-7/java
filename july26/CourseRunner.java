public class CourseRunner{

        public static void main(String args[]){

        Course xworkz = new Course();

        xworkz.saveCourse("Java");
        xworkz.saveCourse("Python");
        xworkz.saveCourse("SQL");
        xworkz.saveCourse("Spring");
        xworkz.saveCourse("SpringBoot");
        xworkz.saveCourse("Html");

        xworkz.printCourse();

        String updateResult = xworkz.updateCourse("Python","CSS");
        System.out.println("Update Result: "+updateResult);
        xworkz.printCourse();

        String deleteResult = xworkz.deleteCourse("SpringBoot");
        System.out.println("Delete Result: "+deleteResult);
        xworkz.printCourse();

        String searchResult = xworkz.searchCourse("Java");
        System.out.println("Search Result: "+searchResult);
        }
}