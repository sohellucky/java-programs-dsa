import java.util.*;
public class largestelement {
    public static int largest(int a[]){
        int l=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                l=a[i];
            }
        }
        return l;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,30,6,7,19};
        int largest=largest(a);
        System.out.println("largest element is :"+largest);
    }
}
