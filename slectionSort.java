import java.util.Scanner;

public class slectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout = 0, j = 0;
        System.out.print("Enter the length of Array: ");
        int q = sc.nextInt();
        int list[] = new int[q];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the Element of an array:");
            list[i] = sc.nextInt();
        }
        System.out.print("Enter The Number for Search:");
        int target_num = sc.nextInt();
        while (j < list.length) {
            if (target_num == list[j]) {
                System.out.print(target_num + " is Present in the list");
            } else {
                cout++;
            }
            j++;
        }
        if (cout == list.length) {
            System.out.print("Number " + target_num + " is Not Found");
        }
        sc.close();
    }
}
