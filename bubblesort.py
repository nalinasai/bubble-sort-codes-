unsorted_list = [2,5,1,8,4]
print("Unsorted list: ",*unsorted_list)

print("After sorting: ")

size = len(unsorted_list)

for i in range(size-1):
    for j in range(size-i-1):
        if(unsorted_list[j]>unsorted_list[j+1]):
            unsorted_list[j],unsorted_list[j+1] = unsorted_list[j+1],unsorted_list[j]
        else:
            continue

for element in unsorted_list:
    print(element, end=" ")

