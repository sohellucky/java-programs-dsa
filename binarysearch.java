import java.util.*;
public class binarysearch {
    public static int binary(int a[],int key){
        int start=0,end=a.length-1,mid;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int key = s.nextInt();
        int index=binary(a,key);
        if (index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at: "+index);
        }
    }
    
}
