class NumberComparison:
    def __init__(self, num1, num2, num3):
        self.num1 = num1
        self.num2 = num2
        self.num3 = num3

    def display_maximum(self):
        if self.num1 >= self.num2 and self.num1 >= self.num3:
            print("The largest number is:", self.num1)
        elif self.num2 >= self.num1 and self.num2 >= self.num3:
            print("The largest number is:", self.num2)
        else:
            print("The largest number is:", self.num3)

# Accept input from the user
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
num3 = int(input("Enter the third number: "))

# Create an instance of the class and display the maximum number
comparison = NumberComparison(num1, num2, num3)
comparison.display_maximum()
