class StringProcessor:
    def __init__(self, str):
        self.str= str

    def find_character_position(self, char):
        positions = []
        for i in range(len(self.str)):
            if self.str[i] == char:
                positions.append(i)
        if positions:
            return positions
        else:
            return "Character not found in the string"

# Accept input from the user
str = input("Enter a string: ")
char = input("Enter the character to find: ")

# Create an instance of the class and find the position of the character
processor = StringProcessor(str)
positions = processor.find_character_position(char)

if isinstance(positions, list):
    print(f"The character '{char}' is found at positions: {positions}")
else:
    print(positions)
