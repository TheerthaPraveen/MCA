a=int(input("enter first number: "))
b=int(input("enter second number: "))
op=input("Enter operation to perform : \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n")
if(op=='1'):
    sum=a+b
    print("result is ",sum)
elif(op=='2'):
    diff=a-b
    print("result is ",diff)
elif(op=='3'):
    mul=a*b
    print("result is ",mul)
elif(op=='4'):
    if(b==0):
        print("cannot be divided by zero")
    else:
        div=a/b
        print("result is ",div)
else:
    print("Invalid option")

