import java.util.*;
class linearsearch{
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        
        }
        return -1;
    }
        

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=s.nextInt();
        int index=linearsearch(arr,key);
        if (index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at:"+index);
        }

    }
}