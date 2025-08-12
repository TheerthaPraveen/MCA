def count_digit(number):
    return len(str(number))
number=int(input("enter the number: "))
digit_count=count_digit(number)
print(f"{digit_count} numbers")
