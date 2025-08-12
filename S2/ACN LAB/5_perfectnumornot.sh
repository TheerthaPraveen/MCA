# Step 1: Start
# Step 2: Prompt the user to enter a number and store it in variable num.
# Step 3: Initialize a variable sum = 0
# (This will store the sum of all proper divisors of num)

# Step 4: Run a loop from i = 1 to i < num
# (Loop through all numbers less than num)

# Step 5: In each iteration, check if num is divisible by i
# If yes, add i to sum

# Step 6: After the loop ends, compare sum with num
# If sum == num
# → Print "num is a perfect number"

# Else
# → Print "num is not a perfect number"

# Step 7: Stop



#!/bin/bash
read -p "Enter the number : " num
sum=0
for((i=1;i<num;i++))
do
    if((num % i == 0))
    then
    sum=$((sum+i))
    fi
done
if ((sum==num))
then
    echo "$num is a perfect number"
else
    echo "$num is not a perfect number"
fi