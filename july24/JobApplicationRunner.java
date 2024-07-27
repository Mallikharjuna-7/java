public class JobApplicationRunner{

        public static void main(String args[]){

        String skills[] = {"Java","Spring","SpringBoot","MicroServices"};

        JobApplication job = new JobApplication();
        JobApplication getJob = new JobApplication("Mallikharjun",23,"B.Tech",2022,830,0.7,2,skills);

        getJob.ageCheck1();
        getJob.ageCheck2(21,"B.Tech");
        System.out.println(getJob.eligibleCheck("B.Tech",getJob.skills));
        System.out.println(getJob.degreeCheck());
        }
}