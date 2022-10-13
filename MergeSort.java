import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    private static int[] mergesort(int[] arr) {

        if (arr.length == 1)
            return arr;

        int m = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergesort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] l, int[] r) {

        int[] ans = new int[l.length + r.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                ans[index] = l[i];
                i++;
                index++;
            } else {
                ans[index] = r[j];
                j++;
                index++;
            }
        }

        while (i < l.length) {
            ans[index] = l[i];
            i++;
            index++;
        }

        while (j < r.length) {
            ans[index] = r[j];
            j++;
            index++;
        }

        return ans;
    }

}
