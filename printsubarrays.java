public class printsubarrays {
    public static void subarray(int a[]) {
        for(int i=0;i<=a.length;i++){
            int start=i;
            for(int j=i+1;j<a.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        subarray(a);
    }
    
}
