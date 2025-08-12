#!/bin/bash

read -p "Enter the string : " str
str=$(echo "$str" | tr '[:upper.]' '[:lower.]')
len=${#str}
vowel_count=0
consonant_count=0

for((i=0;i<len;i++))
do
    char="${str:i:1}"
    if [[ "$char" == [aeiou] ]]
    then    
        ((vowel_count++))
    elif [[ "$char" =~ [a-z] ]] 
    # else
    then
        ((consonant_count++))
    fi
done
echo "The number of vowels in '$str' is: $vowel_count"
echo "The number of consonants in '$str' is: $consonant_count"