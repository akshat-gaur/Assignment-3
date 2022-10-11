import java.util.Arrays;

class q3 {
    public static void main(String args[]) {
        String s = "hello world";
        char[] c = s.toCharArray(); // conver sting into array of character
        Arrays.sort(c); // sort that array using in build character
        int i = 0;
        while (i < c.length) {
            System.out.println(c[i]);
            i++;

        }

    }
}