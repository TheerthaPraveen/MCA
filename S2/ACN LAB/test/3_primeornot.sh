# Step 1: Start
# Step 2: Prompt the user to enter a number and store it in variable num.
# Step 3:If num is less than or equal to 1, then
# → Print "num is not a prime number"

# Step 4:
# Initialize a loop variable i from 2 to (num - 1)

# Step 5:
# In each iteration, check if num is divisible by i (i.e., num % i == 0)

# Step 6:
# If num is divisible by any i, then
# → Print "num is not a prime number"
# → Exit the program

# Step 7:
# If the loop completes without finding any divisors, then
# → Print "num is a prime number"

# Step 8: Stop



#!/bin/bash
read -p "Enter the number : " num
if [ $num -le 1 ]
then
    echo "$num is not a prime number"
    exit 0
fi
for((i=2;i<num;i++))
do
    if [ $((num%i)) -eq 0 ]
    then
        echo "$num is not a prime number"
        exit 0
    fi
done
echo "$num is a prime number"