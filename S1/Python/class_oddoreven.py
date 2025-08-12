# Define a class called NumberSeparator
# Initialize the class with an empty list to store numbers
# Method to accept numbers from the user
# Ask the user how many numbers they want to enter
# Loop to accept the numbers one by one
# Add the number to the list
# Method to display odd and even numbers separately
# Create an empty list for odd numbers
# # Create an empty list for even numbers
# Loop through each number in the list
# Check if the number is odd
# If the number is not odd, it is even
# Print the lists of odd and even numbers# Print the lists of odd and even numbers
class NumberSeparator:
    def __init__(self):
        self.numbers = []

   
    def accept_numbers(self):
        
        count = int(input("How many numbers would you like to enter? "))
        for _ in range(count):
            number = int(input("Enter a number: "))
            self.numbers.append(number)

   
    def display_numbers(self):
        
        odd_numbers = []
       
        even_numbers = []
        
        
        for number in self.numbers:
           
            if number % 2 != 0:
                odd_numbers.append(number)
            
            else:
                even_numbers.append(number)

        
        print("Odd numbers:", odd_numbers)
        print("Even numbers:", even_numbers)

# Create an instance of the NumberSeparator class
separator = NumberSeparator()
# Call the method to accept numbers from the user
separator.accept_numbers()
# Call the method to display odd and even numbers separately
separator.display_numbers()
