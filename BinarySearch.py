# Binary Search in python by https://github.com/Prasanna1717


def binarySearch(array, x, first, last): #defining User-defined-function

    
    while first <= last:

        mid = first + (last - first)//2

        if array[mid] == x:
            return mid

        elif array[mid] < x:
            first = mid + 1

        else:
            last = mid - 1

    return -1


array = [3, 4, 5, 6, 7, 8, 9]
x = 4

result = binarySearch(array, x, 0, len(array)-1)

if result != -1:
    print("Element is present at index " + str(result))
else:
    print("Nothing is found")

#The code was submitted by Prasanna
''' Thank You '''