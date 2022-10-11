import java.util.Scanner;

class q4 {
    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt(); // Take input from the user

        while (n != 1 && n > 0) { // run the loop until n=1
            System.out.print(n);
            System.out.print(" ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

        }

        System.out.println(n);

    }

}