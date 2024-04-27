public class assignmentOprator2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 10;
        a = a += 10;
        b = a -= 10;
        c = a *= 10;
        d = a /= 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}

// output = 20