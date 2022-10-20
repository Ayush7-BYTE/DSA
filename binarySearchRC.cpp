#include <iostream>
using namespace std;

bool binarySearch(int arr[], int start, int end, int k)
{
    // Base Case
    // Element not found
    if (start > end)
        return false;

    int mid = start + (end - start) / 2;
    // Element found
    if (arr[mid] == k)
        return true;

    if (arr[mid] < k)
        return binarySearch(arr, mid + 1, end, k);
    else
        return binarySearch(arr, start, mid - 1, k);
}

int main()
{
    int arr[10] = {4, 8, 10, 15, 18, 25, 35, 40, 46, 49};
    bool ans = binarySearch(arr, 0, 9, 18);
    if (ans)
        cout << "True" << endl;
    else
        cout << "False" << endl;
    return 0;
}