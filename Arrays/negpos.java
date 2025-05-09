package Arrays;

import java.util.Scanner;

public class negpos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for( int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        
        int[] b = new int[len];


        int lcnt=len-1;
        int fcnt=0;
        for( int i=0;i<len;i++){
            if(a[i]<0){
                b[fcnt]=a[i];
                fcnt++;
            }else{
                b[lcnt]=a[i];
                lcnt--;
            }
        }

        for(int i=0 ; i<len;i++ ){
            System.out.print(b[i]+",");
        }
    }
}
