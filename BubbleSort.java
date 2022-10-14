
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array to be sorted ");
        int n=sc.nextInt();
        System.out.println("Enter teh array elements ");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.print("Sorted array in Ascending order is as follows: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
