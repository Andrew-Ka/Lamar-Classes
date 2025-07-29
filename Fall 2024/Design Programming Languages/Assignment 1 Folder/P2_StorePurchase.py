#State Purpose
print("Hello Customer, Ready for Checkout?")
print("Enter Your 5 Item Prices Below")

#Go Through for loop and take in input
#add each to a sum variable
sum = 0
for i in range(5):
    print("Item ", (i+1), end=": ") 
    sum += float(input())

print("_________________________")

#add a variable called subtotal for the 
#total before tax
subtotal = sum

#add tax, add var called total
total = round(subtotal * 1.07, 2)


#Print the results
print("Subtotal = ", subtotal)
print("Total = ", total)