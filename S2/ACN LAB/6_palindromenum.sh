#!/bin/bash
read -p "Enter the number : " num
n=$num
rev=0
while [[ $num -gt 0 ]]
do
    lastdigit=$((num%10))
    rev=$(((rev*10)+lastdigit))
    num=$((num/10))
done
if((n==rev))
then
    echo "$rev is a palindrome number"
else
    echo "$rev is not a palindrome number"
fi