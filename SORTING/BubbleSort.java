public class BubbleSort {
     public static void bubbleSort(int[] arr, int n){
        for(int i = n-1; i>=1; i--){
                 int bestCase = 0;
            for(int j =0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                    bestCase = 1;
                }
            }
            if(bestCase == 0){
                break;
            }
            

        }
      }

    public static void main(String args[]){
        //int [] arr = {13,46,52,24,20,9};
        //best case
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        bubbleSort( arr,n);
        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
