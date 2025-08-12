#book 16


s=input("Enter the string : ")
if s[-3: ]=='ing':
    s=s+'ly'
else:
    s=s+'ing'
print("New string is : ",s)
