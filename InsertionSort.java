

public class InsertionSort {
    public static void main(String[] args) {
        int []a= {3,5,2,6,1,4};
        int j,x;
        for (int i=1; i<a.length; i++){
            j = i-1;
            x=a[i];
            while (j>-1 && a[j]>x){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=x;
        }
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
