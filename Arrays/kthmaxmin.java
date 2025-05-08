package Arrays;


public class kthmaxmin {
    void sort(int[] a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,55,3,22,34,65,8,33};
        kthmaxmin obj = new kthmaxmin();
        obj.sort(a);
    
        int k=3;
        System.out.println("Kth Max: "+a[a.length-k]+" Kth Min: "+a[k-1]);
        
    }
}
