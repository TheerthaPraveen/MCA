#!/bin/bash
read -p "Enter the number : " num
a=0
b=1
sum=0
for((i=0;i<num;i++))
do
    echo "$a"
    sum=$((sum+a))
    c=$((a+b))
    a=$b
    b=$c
done
echo 
echo "The sum of the numbers : $sum"