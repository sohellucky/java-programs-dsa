public class pairsinarray {
    public static void pairs(int a[]){
        int current;
        for(int i=0;i<a.length;i++){
            current=a[i];
            for(int j=i+1;j<a.length;j++){
                System.out.println("("+current+","+a[j]+")");
            }
            
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        pairs(a);
    }
    
}
