#imports
import pandas as pd

#Can update the csv as needed
print("Use this python file to find out specific data about watches.")
print("Watch data can be found in the watch_data.csv file.")

#show the data in the csv file
watchFile = pd.read_csv('watch_data.csv')
print(watchFile)

#modify as needed to see necessary data analysis
avgPrice = watchFile["Price"].mean()
print("The average price is: $", avgPrice)
    
