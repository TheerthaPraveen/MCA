# my book 12

def exchange(a):
    if(len(a)<2):
        return a
    else:
        return a[-1]+a[1:-1]+a[0]

a=input("Enter the string : ")
result=exchange(a)
print("String after exchanging first and last character :",result)
