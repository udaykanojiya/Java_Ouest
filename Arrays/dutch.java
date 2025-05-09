package Arrays;

public class dutch {
    public static void main(String[] args) {

        int[] a = { 0, 2, 1, 0, 2, 2, 0, 1, 2, 1, 2 };
        int zc = 0;
        int oc = 0;
        int tc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
                zc++;
            }
            else if(a[i]==1){
                oc++;
            }
            else{
                tc++;
            }
        
        }
        for(int i=0;i<a.length;i++){
            if(i<zc){
                a[i]=0;
            }
            else if(i<oc){
                a[i]=1;
            }
            else{
                a[i]=2;
            }

        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }
}
