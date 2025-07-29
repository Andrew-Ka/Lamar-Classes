#State Purpose
print("I can want to convert your numbers ")
print("into something you can understand")

#user input
#get's to choose which input's
heartRate = float(input("Enter you heart rate: "))
bp = str(input("Your blood pressure please (in the form of x/y, like 100/80): "))
slash = bp.find('/')
systole = int(bp[:slash])
diastole = int(bp[(slash+1):])
age = int(input("Enter your age: "))



#Calculations
strokeVolume = (systole - diastole) / (systole + diastole)
cardiacOutput = strokeVolume * heartRate 
bpIndic = ""
heartRateIndic = ""

if (age<12):
    if(systole < 60):
        bpIndic += "systole outside and lower, "
    elif(systole <128):
        bpIndic += "systole inside, "
    else:
        bpIndic += "systole outside and higher, "
    

    if(diastole <40):
        bpIndic += "diastole outside and lower"
    elif(diastole <80):
        bpIndic += "diastole inside"
    else:
        bpIndic += "diastole outside and higher"
    


    if(heartRate <65):
        heartRateIndic +="outside and lower"
    elif(heartRate <100):
        heartRateIndic +="inside"
    else:
        heartRateIndic +="outside and higher"
    

elif (age<40):
    if(systole < 100):
        bpIndic += "systole outside and lower, "
    elif(systole <128):
        bpIndic += "systole inside, "
    else:
        bpIndic += "systole outside and higher, "
    

    if(diastole <60):
        bpIndic += "diastole outside and lower"
    elif(diastole <80):
        bpIndic += "diastole inside"
    else:
        bpIndic += "diastole outside and higher"
    


    if(heartRate <60):
        heartRateIndic +="outside and lower"
    elif(heartRate <100):
        heartRateIndic +="inside"
    else:
        heartRateIndic +="outside and higher"

else:
    if(systole < 110):
        bpIndic += "systole outside and lower, "
    elif(systole <140):
        bpIndic += "systole inside, "
    else:
        bpIndic += "systole outside and higher, "
    

    if(diastole <70):
        bpIndic += "diastole outside and lower"
    elif(diastole <90):
        bpIndic += "diastole inside"
    else:
        bpIndic += "diastole outside and higher"
    


    if(heartRate <60):
        heartRateIndic +="outside and lower"
    elif(heartRate <100):
        heartRateIndic +="inside"
    else:
        heartRateIndic +="outside and higher"


links = [
    "https://my.clevelandclinic.org/health/diagnostics/23344-cardiac-output",
    "https://www.mayoclinic.org/diseases-conditions/high-blood-pressure/expert-answers/hypertension/faq-20058527",    
    "https://www.cedars-sinai.org/health-library/diseases-and-conditions/h/high-blood-pressure-hypertension.html",
    "https://www.mayoclinic.org/diseases-conditions/low-blood-pressure/symptoms-causes/syc-20355465#:~:text=A%20change%20of%20just%2020,serious%20infections%20or%20allergic%20reactions.",
    "https://www.health.harvard.edu/heart-health/a-look-at-diastolic-blood-pressure",    
    "https://www.deltexmedical.com/decision_tree/stroke-volume-and-cardiac-output/"
]
chart = "https://static.physoc.org/app/uploads/2019/07/04120435/pn5.jpg.jpg"

#Print output
print("For your age, you have a heart rate", heartRateIndic, "of the normal range for your age")
print("For your age, you have a blood pressure", bpIndic, " of the normal range for your age")
print("Your stroke volume: ", strokeVolume)
print("Your cardiac output: ", cardiacOutput)
print("Links you may want to check out: ")
print(*links, sep= "\n")
print("General Chart can be found here: ", chart)
