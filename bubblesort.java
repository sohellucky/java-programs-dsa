public class bubblesort {
    public static void bubble(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }

    }
    public static void main(String[] args) {
        int a[]={9,8,6,7,4,5,2,3,1};
        bubble(a);
    }
    
}
