class q2 {
    public static void main(String args[]) {
        int[] arr = { 1, 7, 2, 17, 7, 20 };
        int[] a = counting_sort(arr);
        int i = 0;
        while (i < a.length) {
            System.out.println(a[i]);
            i = i + 1;
        }

    }

    public static int[] counting_sort(int[] arr) {
        int[] h_array = new int[21]; // make hash array with 21 element fromm 0 to 20 and initial value is of each
                                     // element is 0

        int l = arr.length;
        int i = 0;
        int k;
        while (i < l) { // if arr has x element add +1 in xth place in the hash_array
            k = arr[i];
            h_array[k]++;
            i++;
        }
        int[] s_array = new int[arr.length];
        i = 0;
        int j = 0;
        int s;
        while (i < 21) { // convert hash_array into output array
            s = h_array[i];
            int q = j + s;
            while (j < q) {
                s_array[j] = i;
                j = j + 1;
            }
            i++;

        }
        return s_array;

    }
}