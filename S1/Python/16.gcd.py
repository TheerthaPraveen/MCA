#book 11

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

a = int(input("Enter a: "))
b = int(input("Enter b: "))
result = gcd(a, b)
print(f"GCD of {a} and {b} is {result}")