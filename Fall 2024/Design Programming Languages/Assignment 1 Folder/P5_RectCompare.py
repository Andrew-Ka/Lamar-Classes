#State Purpose
print("I can compare which of your \n2 rectangles are bigger")
#print("2 rectangles are bigger")

#user input
#Rectangle 1 dimensions:
Rect1L = float(input("Length of Rectangle 1: "))
Rect1W = float(input("Width of Rectangle 1: "))
#Rectangle 2 dimensions:
Rect2L = float(input("Length of Rectangle 2: "))
Rect2W = float(input("Width of Rectangle 2: "))

#Calculations for area
Area1 = Rect1L * Rect1W
Area2 = Rect2L * Rect2W

#Print output
print("Rectangle 1 has an area of ", Area1)
print("Rectangle 2 has an area of ", Area2)
if (Area1 > Area2):
    print("Rectangle 1 is bigger")
elif (Area1 > Area2):
    print("Rectangle 2 is bigger")
else:
    print("They are the same size")
