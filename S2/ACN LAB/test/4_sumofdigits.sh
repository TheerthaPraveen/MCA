# Step 1: Start
# Step 2: Prompt the user to enter a number and store it in variable num.
# Step 3: Initialize sum = 0.
# Step 4: Store the original number in another variable n (optional, useful if you need to keep the original value for later use).
# Step 5: Repeat the following steps while num > 0:
# a. Find the last digit of num using lastdigit = num % 10.

# b. Add lastdigit to sum.

# c. Remove the last digit from num using num = num / 10.

# Step 6: When num becomes 0, exit the loop.
# Step 7: Print the value of sum as the sum of digits.
# Step 8: Stop


#!/bin/bash
read -p "Enter the number : " num
sum=0
n=$num
while [ $num -gt 0 ]
do
    lastdigit=$((num%10))
    sum=$((sum+lastdigit))
    num=$((num/10))
done
echo "Sum of the digits is : $sum"