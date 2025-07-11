public class MergeSort {
  public static void divide(int[] a, int low, int high){
    if(low<high){
      int mid = low + (high-low)/2;
      divide(a, low, mid);
      divide(a, mid+1, high);
      mergeSort(a,low,mid,high);

    }
    
  }
  public static void mergeSort(int[] a, int low, int mid, int high){
    int[] merged = new int[high-low+1];
    int index1=low, index2=mid+1, x=0;
    while(index1<=mid && index2<=high){
      if(a[index1]<a[index2]){
        merged[x++] = a[index1++];
      }
      else{
        merged[x++] = a[index2++];

      }
    } 
    while(index1<=mid){
      merged[x++] = a[index1++];
    }
    while(index2<=high){
      merged[x++] = a[index2++];
    }
    for(int i=low,j=0; j<merged.length; i++,j++){
      a[i] = merged[j];
    }

  }
  public static void main(String[] args) {
    int[] a = {4,1, 10, 8, 16, 34};
    divide(a, 0, a.length-1);
    for(int x:a){
      System.out.print(x+" ");
    }
  }
  
}
