#!/bin/bash
read -p "Enter the three numbers : " a b c
if [ $a -gt $b ] && [ $b -gt $c ]
then
    echo "$a is the greatest"
elif [ $b -gt $c ]
then
    echo "$b is the greatest"
else
    echo "$c is the greatest"
fi