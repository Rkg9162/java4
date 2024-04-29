import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age !");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are now adult");
        } else if (age < 30) {
            System.out.println("you are now a younger man");

        } else if (age < 60) {
            System.out.println("you are now a younger man");

        } else {
            System.out.println("you are very older");
        }
        sc.close();

    }

}
//input 25
//Output you are now a younger man