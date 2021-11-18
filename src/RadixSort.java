public class RadixSort {

    public static void sort(int [] arr,int j){

        int [] a = new int[arr.length];
        int [] b = new int[10];

        for (int i = 0; i <10 ; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < arr.length; i++)
            b[(arr[i] / j) % 10]++;


        for (int i = 1; i <10 ; i++)
            b[i]+=b[i-1];


        for (int i = arr.length - 1; i >= 0; i--) {
            a[b[(arr[i] / j) % 10] - 1] = arr[i];
            b[(arr[i] / j) % 10]--;
        }

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=a[i];
        }
    }



    public static void RadixSort(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]) max=arr[i];
        }

        for (int j = 1; max / j > 0; j *= 10)
            sort(arr, j);


    }

    public static void main(String[] args) {
        int arr[] = { 2865683,437342,942798,94279,4739,573829,3,298477 };
        RadixSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}

