public class Course {

        public static void main(String args[]){

                double course_cost = 12000.00;
                double gst_18_percentage = 0.18*course_cost;

                double total_cost = course_cost+gst_18_percentage;

                System.out.println("Course Cost:"+course_cost);
                System.out.println("18% GST:"+gst_18_percentage);
                System.out.println("Total Course Cost:"+total_cost);
        }
}