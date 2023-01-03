import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(Solution.reverse(x));
    }

    public static class Solution {
        public static int reverse(int x) {
            char[] xchar;
            if (x > 0 && x < Integer.MAX_VALUE){
                xchar = Integer.toString(x).toCharArray();
                reverseString(xchar);
                long value = Long.parseLong(new String(xchar));
                if (value < Integer.MAX_VALUE){
                    return Integer.parseInt(new String(xchar));
                }
            }else if (x < 0 && x > Integer.MIN_VALUE) {
                xchar = Integer.toString(Math.abs(x)).toCharArray();
                reverseString(xchar);
                long value = Long.parseLong(new String(xchar));
                if (value < Integer.MAX_VALUE){
                    return Integer.parseInt("-" + new String(xchar));
                }
            }
            return 0;
        }
        private static void reverseString(char[] xchar) {
            char a;
            for (int i = 0; i < xchar.length/2; i++){
                a = xchar[i];
                xchar[i] = xchar[(xchar.length-1) - i];
                xchar[(xchar.length-1) - i] = a;
            }
        }
    }
}
