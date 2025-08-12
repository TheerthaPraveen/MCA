num=int(input("Enter the number : "))
a=0
b=1
for i in range(num):
    print(a)
    c=a+b
    a=b
    b=c



#using function
# def fib(n):
#     a,b=0,1
#     for i in range(n):
#         print(a,end='')
#         a,b=b,a+b
# num=int(input("enter no of terms   : "))
# fib(num)