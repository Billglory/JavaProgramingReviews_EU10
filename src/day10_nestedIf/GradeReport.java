package day10_nestedIf;

public class GradeReport {
    public static void main(String[] args) {
/*
 if(validGrade){

         90-100:Excellent
         80-90:grade
         70-79:Good"
         60-69:Passed
         0-59: Failed
     */

        int score = 95;
        if (score > 0 && score <= 100) { //if tfe score is valid
            // 5 possibilities: A,B,C,D,F
            if (score > 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
                System.out.println("Invalid Score");
            }

            }
        }






        /*
        int score = 135;
        if(score>0 && score<=100) { //if tfe score is valid
            // 5 possibilities: A,B,C,D,F
            if (score > 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else if (score >= 59) {

            } else {
                System.out.println("Failed");
            }
        }else {
                System.out.println("Invalid Score");

            }


        }
    }
*/
        /*
        int score = 95;
        if (score > 0 && score <= 100) { //if tfe score is valid
            // 5 possibilities: A,B,C,D,F
            if (score > 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else if (score >= 59) {

            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }
    }
}

*/
        /*
        System.out.println("..........................");

        int score = 79;
                String result = "";

                if (score > 0 && score <= 100) { //if tfe score is valid
                    // 5 possibilities: A,B,C,D,F
                    if (score > 90) {
                        result = "Excellent";
                    } else if (score >= 80) {
                        result = "Great Job";
                    } else if (score >= 70) {
                        result = "Good";
                    } else if (score >= 60) {
                        result = "Passed";
                    } else if (score >= 59) {
                    } else result = "Failed";
                }else{
                        System.out.println("Invalid Score");
                        result = ("Invalid Score");

                    }
                System.out.println(result);
                }
            }

*/


