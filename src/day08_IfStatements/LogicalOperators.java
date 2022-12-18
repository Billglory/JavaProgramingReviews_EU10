package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Bill";
        int age = 48;
        String citizen = "Turkey";

        boolean isEligible =  age >= 18 &&  citizen == "Turkey";
        //                      18 >= 18 &&  "USA" == "Turkey"
        //                      true    &&  true ==> true

        System.out.println(name + " is eligible to vote: " +isEligible);

        System.out.println("----------------------------------------------------------");

        String name2 = "Bill";

        int creditScore = 800;
        int age2 = 48;
        int income = 70000;

        boolean isEligible2 =  creditScore >= 700 && age2 >= 21 && income >= 60000 ;

        System.out.println(name2+" is eligible for loan: "+isEligible2);

        System.out.println("----------------------------------------------------");

        String name3 = "Bill";

        int age3 = 48;
        char gender = 'M';

        boolean isEligible3 =  age3 >= 18 &&  (gender == 'M' || gender =='F' );
        //                      21 >= 18  &&  ( 'F' == 'M'  ||   'F' == 'F' )
        //                      true     &&   ( false       ||   true)
        //                      true   &&    true
        //                      true


        System.out.println(name3+" is eligible to register: "+isEligible3);

        System.out.println("-------------------------------------------------------");

        String name4 = "Bill";

        String countryOfBirth = "Turkey";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 =  countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                       true

        System.out.println(name4 +" is eligible to apply for US citizenShip: "+isEligible4);

        System.out.println("----------------------------------------------------------------");

        String student = "Bill";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;
        //                      false || true

        System.out.println(student +" is eligible for scholarship: "+isEligible5);

        System.out.println("-------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);





    }

}
