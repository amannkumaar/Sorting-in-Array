public class BubbleSort{
  public static void bubbleSort(int[] nums){
    int length = nums.length;
    for(int i=0; i<length-1; i++){
      int count=0;
      for(int j=0; j<length-1-i; j++){
        if(nums[j] > nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
          count++;
        }
         if(count==0){
           break;
          }
      }
     
    }

  }
  public static void main(String[] args) {
    int[] nums = {60, 40, 30,2, 5, 10};
    System.out.println("Before Sorting");
    for(int x:nums){
      System.out.print(x+" ");
    }
    bubbleSort(nums);
    System.out.println("\nAfter Sorting");
    for(int x:nums){
      System.out.print(x+" ");
    }


  }
}