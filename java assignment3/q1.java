class q1 {
    public static void main(String args[]) {
        String s = "lettes";
        String p = "letter";
        int a = compare(s, p); // if first string is above second it returns 1 if second string is above it
                               // returns -1
        System.out.println(a); // if both strings are equal than it returns 0
    }

    public static int compare(String s, String p) {
        String sl = s.toLowerCase(); // convert string to lower case
        String pl = p.toLowerCase(); // convert string to lower case
        int l1 = s.length();
        int l2 = p.length(); // l is equal to lenght of the smaller string
        int l = 0;
        if (l1 < l2) {
            l = l1;
        } else {
            l = l2;
        }
        int i = 0;
        char c1;
        char c2;
        int d1;
        int d2;
        while (i < l) { // while loop runs from 0 to l-1
            c1 = sl.charAt(i);
            c2 = pl.charAt(i);
            d1 = c1;
            d2 = c2;
            if (d1 < d2) {
                return 1; // if acaii value of c2 is greater than c1 than return 1
            }
            if (d2 < d1) {
                return -1; // if acaii value of c1 is greater than c2 return -1
            }
            if (d2 == d1) {
                i = i + 1; // if c1 and c2 are equal than increase value of i
            }
        }
        if (l1 < l2) {
            return 1;
        }
        if (l2 < l1) {
            return -1;
        }
        if (l1 == l2) {
            return 0;
        }
        return 0;

    }
}