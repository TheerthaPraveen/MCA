#!/bin/bash
read -p "Enter the string  : " str
len=${#str}
str=$( echo "$str" | tr '[:upper.]' '[:lower.]' )

for((i=0;i<len/2;i++))
do
    if [ "${str:i:1}" != "${str:len-i-1:1}" ]
    then
        echo "The string '$str' is not a palindrome"
        exit 
    fi
done
echo "The string '$str' is palindrome"