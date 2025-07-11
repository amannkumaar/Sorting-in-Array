public class SelectionSort {
  public static void selectionSort(int[] nums){
    int n = nums.length;
    for(int i=0; i<n-1; i++){
      int minIndex=i;
      for(int j=i+1; j<n; j++){
        if(nums[j] < nums[minIndex]){
          minIndex = j;
        }
      }
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;

    }

  }
  public static void main(String[] args) {
    int[] nums = {60, 40, 30, 3, 2, 10};
    System.out.println("Before Sorting");
    for(int x:nums){
      System.out.print(x+" ");
    }
    selectionSort(nums);
    System.out.println("\nAfter Sorting");
    for(int x:nums){
      System.out.print(x+" ");
    }
  }
  
}
