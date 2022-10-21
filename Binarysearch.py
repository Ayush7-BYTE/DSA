# Binary Search in python

def binarySearch(array, x, low, high):

    if high >= low:

        mid = low + (high - low)//2

      

        if array[mid] == x:

            return mid

        

        elif array[mid] > x:

            return binarySearch(array, x, low, mid-1)

        

        else:

            return binarySearch(array, x, mid + 1, high)

    else:

        return -1

array = [3, 4, 5, 6, 7, 8, 9]

x = 4

result = binarySearch(array, x, 0, len(array)-1)

if result != -1:

    print("Element is present at index " + str(result))

else:

    print("Not found")
