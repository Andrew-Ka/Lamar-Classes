#State Purpose
print("Welcome to Honest Burger!")

#Get user input
foodCost = float(input("How much did your food cost? "))

#tip calculation
tip = foodCost * 0.18

#tax cost
tax = foodCost * 0.07

#output results
print("Your food cost ", foodCost)
print("Your tip costs ", round(tip, 2))
print("Your tax costs ", round(tax, 2))
print("Your total cost is", round((foodCost + tip + tax), 2))