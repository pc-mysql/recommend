import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int max1 = -1, min1 = Integer.MAX_VALUE;
        String maxstring = null, minstring = null;
        for (String s1 : split) {
            if (s1.length() > max1) {
                maxstring = s1;
                max1 = s1.length();
            }
            if (s1.length() < min1){
                minstring = s1;
                min1 = s1.length();
            }
        }
        System.out.println(maxstring);
        System.out.println(minstring);

    }
}
