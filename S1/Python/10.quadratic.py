import math
def find_roots(a,b,c):
    d=b**2-4*a*c
    if d>0:
        root1=((-b-math.sqrt(d))/(2*a))
        root2=((-b+math.sqrt(d))/(2*a))
        print(f"The roots are real and distinct :{root1},{root2}")
    elif d==0:
        root1=-b/(2*a)
        print(f"The equal roots : {root1}")
    else:
        print("No real roots")

a=int(input("Enter the coefficient of x^2 : "))
b=int(input("Enter the coefficient of x : "))
c=int(input("Enter the coefficient of constant : "))
find_roots(a,b,c)