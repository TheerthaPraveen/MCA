#!/bin/bash
read -p "Enter the string : " str
read -p "Enter the character/word to count : " char
count=$(grep -o "$char" <<< "$str" | wc -l)
echo "Occurence of '$char' is : $count"