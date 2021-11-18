public class Bubble_sort {

    public static void BubbleSort(int [] arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,2,5,3,5,63,2,65,3,6,3};
        BubbleSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
