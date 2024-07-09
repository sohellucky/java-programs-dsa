public class frequency {
    public static void countFrequencies(int[] arr) {
        int[] frequencies = new int[arr.length];
    
        for (int i = 0; i < arr.length; i++) {
          int count = 1;
          for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
              count++;
              frequencies[j] = -1; // Mark visited elements
            }
          }
          if (frequencies[i] != -1) {
            frequencies[i] = count;
          }
        }
    
        System.out.println("Element | Frequency");
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
          if (frequencies[i] != -1) {
            System.out.println(arr[i] + " | " + frequencies[i]);
          }
        }
      }
    
      public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        countFrequencies(arr);
      }
    
}
