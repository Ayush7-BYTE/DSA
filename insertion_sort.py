def insertionSort(arr):
 
    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):
 
        key = arr[i]
        j = i-1
        while j >=0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key
 
 
arr = [22,99,79,999,20202]
insertionSort(arr)
#empty list to store sorted elements
lst = [] 
print("The Sorted array is : ")
for i in range(len(arr)):
    #appending the elements in sorted order
    lst.append(arr[i])  
print(lst)
