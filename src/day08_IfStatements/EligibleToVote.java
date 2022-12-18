package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {


        String name = "Bill";
        int age = 48;
        String citizen = "Turkey";
/*

        if (age>18) {
            System.out.println(name + " Is Eligible");
        }else {
            System.out.println(name+ " İs Not Eligible");
            */


        boolean isEligible = age >= 18 && citizen == "Turkey"; //True

        // Eligible
        if (isEligible) { // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if (!isEligible) { // !True ==> not true==> false
            System.out.println("Not Eligible");


        }
    }
}






