#!/bin/bash
read -p "Enter the string : " str

# reverse_string=$(echo "$str" | rev)
# echo "Reverse string is : $reverse_string"

len=${#str}
reverse="" 
for((i=$len-1;i>=0;i--))
do
    char=${str:i:1}
    reverse="$reverse$char"
done
echo "Reverse string is : $reverse"

