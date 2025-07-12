public class CountSort {
  public static void countSort(int[] a){
    int min=a[0];
    int max=a[0];
    for(int x:a){
      if(x>max){
          max=x;
      }
      else if(x<min){
        min=x;
      }
    }

    int[] freq = new int[max-min+1];
    for(int x:a){
      freq[x-min]++;
    } 

    for(int i=0, j=0; i<freq.length; i++ ){
      while(freq[i]>0){
        a[j++]=i+min;
        freq[i]--;
      }
    }



  }
  public static void main(String[] args) {
    int[] a = {5, 4, 1, 3, 1, 3, 5, 2};
    countSort(a);
    for (int i : a) {
      System.out.print(i+" ");
      
    }
  }
  
}
