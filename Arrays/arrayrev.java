package Arrays;

public class arrayrev {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,0};
        int temp;
        int len = a.length;
        for(int i=0,j=len-1; i<=j;i++,j--){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        for(int i=0;i<len;i++){
            System.out.print(a[i]+",");
        }
    }
}
