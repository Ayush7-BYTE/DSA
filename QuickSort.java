public class QuickSort {
    public static void main(String[] args) {
        int []a={5,3,7,1,9,2,6};
        quickSort(a,0,a.length-1);
        for (int x:a
             ) {
            System.out.print(x+" ");
        }
    }
    public static void swap(int a[], int b,int c){
        int t = a[b] ;
        a[b] = a[c];
        a[c] = t;
    }
    public static int partition(int []a, int l, int r){
        int pivot = a[r];
        int i = l-1;

        for (int j=l; j<r; j++){
            if (a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,pivot);
        return i+1;
    }
    public static void quickSort(int []a,int l , int r){
        if(l<r){
            int p = partition(a,l,r);

            quickSort(a,l,p-1);
            quickSort(a,p+1,r);
        }
    }
}
