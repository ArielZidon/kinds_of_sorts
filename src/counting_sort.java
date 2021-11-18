public class counting_sort {

    public static void counting_sort(int arr []){
        int [] a = new int[arr.length];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max = arr[i];
        }
        int [] b = new int[max+1];

        for (int i = 0; i <arr.length; i++) {
        b[arr[i]]++;
        }

        for (int i = 1; i <b.length ; i++) {
            b[i]+=b[i-1];
        }

        for (int i = 0; i <a.length ; i++) {
           a[b[arr[i]]-1]=arr[i];
            b[arr[i]]--;
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=a[i];
        }
    }

    public static int[] find(int [] arr , int k){
        counting_sort(arr);

        int [] a = new int[2*k];

        for (int i = 0; i <k ; i++)
            a[i] = arr[i];

        for (int i = 0;  i<k ; i++)
            a[k+i] = arr[arr.length-k+i];

        for (int i = 0; i <2*k ; i++) {
            System.out.print(a[i]+" ");
        }
    return a;}

    public static void main(String[] args) {
        int [] arr = {1,6,2,8,11,3,5,7,1,3,0,9,5,3,2};
        find(arr,4);
        //        counting_sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        find(arr,3);

    }
}
