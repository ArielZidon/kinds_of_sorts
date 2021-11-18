

public class marge_sort {

    public static void  margeSort(int[] arr){
        if (arr.length==1) return;

            int mid = arr.length / 2;

            int[] left = new int[mid];
        System.arraycopy(arr, 0, left, 0, left.length);

            int y = 0;
            int [] right;

            if (arr.length%2==0) { right = new int[arr.length - mid];
            for (int i = mid; i > 0; i--) {
                right[y++] = arr[arr.length - i];
            }}

            else {right = new int[arr.length - mid];
                for (int i = mid+1; i > 0; i--) {
                    right[y++] = arr[arr.length - i];
                }}

            margeSort(left);
            margeSort(right);


        int [] C = marge(left,right);

        System.arraycopy(C, 0, arr, 0, C.length);

    }

    public static int[] marge(int[] a1, int[] a2){
        int[] n = new int[a1.length+a2.length];
        int x = 0,y=0,z=0;

        while (x!=a1.length+a2.length){
            if (y==a1.length) n[x++]=a2[z++];

            else if(z==a2.length) n[x++]=a1[y++];

            else if (a1[y]>a2[z]) n[x++]=a2[z++];

            else n[x++]=a1[y++];

        }
    return n;}


    public static void main(String[] args) {
        int[] arr = {2,6,36,6,54,6,678,3456,4567,78,6543,987,9876,543};
        margeSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
