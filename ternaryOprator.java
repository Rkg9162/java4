
//find greatest number using ternary oprator 
public class ternaryOprator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int res = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(res);
        // find greatest number using if else
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
