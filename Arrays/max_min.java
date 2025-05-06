package Arrays;

public class max_min{

    public static void main(String[] args) {

        int[] a = { 3, 23, 5, 27, 44, 22, 88, 49 };
        int len = a.length;
        int max, min;
        if (a[0] > a[1]) {
            max = a[0];
            min = a[1];
        } else {
            max = a[1];
            min = a[0];
        }

        for (int i = 2; i < len; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];

            }
        }

        System.out.println("\n"+"Max: "+max+"\n"+"Min: "+min);
    }
}
