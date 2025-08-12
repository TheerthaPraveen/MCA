#book 15

string=input("enter the string : ")
letter=input("enter the letter to be counted : ")
count=0
for i in string:
    if(i==letter):
        count+=1
print("Count is " ,count)
