
print("Enter the input: ",end="")

stringlist = input().split()

integerlist = list(map(int,stringlist))

print("After sorting: ",end="")

# Implementing Bubble Sort algorithm
for i in range(len(integerlist)-1):
    for j in range(len(integerlist)-i-1):
        # Compare current element with the next element
        if(integerlist[j]>integerlist[j+1]):
            # Swap the elements if they are in the wrong order
            integerlist[j],integerlist[j+1] = integerlist[j+1],integerlist[j]
        else:
            continue

for element in integerlist:
    print(element, end=" ")
