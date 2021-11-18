public class quickSort {

    public static void quickSort(int [] arr){
        int i = 0;
        int j = arr.length-1;
        sort(arr,i,j);
    }


    public static void sort(int [] arr,int i , int  j){
       if (i<j){
          int pivot = partition(arr,i,j);
           sort(arr,i,pivot-1);
           sort(arr,pivot+1,j);
       }

    }

    public static int partition(int [] arr,int i , int  j) {
int pivot = i;

i+=1;

while (i<=j){
    if (arr[pivot]>=arr[i]) i++;
    else if (arr[pivot]<arr[j]) j-- ;
    else {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
        int temp = arr[j];
        arr[j]= arr[pivot];
        arr[pivot]= temp;

        pivot = j;

    return pivot;}


    public static void main(String[] args) {
        int [] arr = {7,2,3,4,6,2,987,30,73,9,6};
        quickSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
