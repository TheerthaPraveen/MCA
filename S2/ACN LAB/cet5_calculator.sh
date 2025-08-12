#!/bin/bash
while true
do
    read -p "Enter the two numbers :"  a b
    read -p "Enter the operation : " op
    case $op in
    "+")
    ans=$(echo "$a + $b" | bc);;
    "-")
    ans=$(echo "$a - $b" | bc);;
    "*")
    ans=$(echo "$a * $b" | bc);;
    "/")
    ans=$(echo "scale=2; $a / $b" | bc);;
    *)
    exit 0;;
    esac

echo "$a $op $b = $ans"
done
