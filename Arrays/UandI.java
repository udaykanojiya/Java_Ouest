package Arrays;

public class UandI {

    public static void main(String[] args) {
        // System.out.println("\n");
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 4, 5, 6, 7, 8 };
        int ilen;
        if (a.length > b.length) {
            ilen = b.length;
        } else {
            ilen = a.length;
        }

        int[] c = new int[ilen];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count] = a[i];
                    count++;
                }
            }
        }
        System.out.print("INTERSECTION : {");
        for (int i = 0; i < count; i++) {

            System.out.print(c[i] + ",");

        }

        System.out.print("}");
        System.out.println("\nUNION:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

        for (int j = 0; j < b.length; j++) {
            int printt = 1;
            for (int k = 0; k < count; k++) {
                if (b[j] == c[k]) {
                    printt = 0;
                    break;
                    

                }
            }
            if(printt==1){
                System.out.print(b[j]+",");
            }
        }

    }
}
