package day10_nestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
/*

        int s = 95;
        if (s > 0 && s <= 100) { //if tfe score is valid
            // 5 possibilities: A,B,C,D,F
            if (s > 90) {
                System.out.println("Excellent");
            } else if (s >= 80) {
                System.out.println("Great");
            } else if (s >= 70) {
                System.out.println("Good");
            } else if (s >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("Invalid Score");
        }
    }
}
*/
/*
        int s = 135;
        String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);

    }
}
*/
        int s = 75;
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);
    }
}
