package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A',  'B', 'C', 'C', 'D', 'D', 'D', 'E','E','E'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j]; //'A'
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] ==ch){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(ch);
            }

        }





    }


}
