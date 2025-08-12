#!/bin/bash
while true
do
    echo -e "\n String Manipulations Menu"
    echo "1:Convert upper case to lower case"
    echo "2:Extract the substring"
    echo "3:Replace word in a string"
    echo "4:count occurence of a character in a word"
    echo "5:check if two strings are equal"
    echo "6:exit"
    read -p "Enter your choice : " choice

    case $choice in
    1)
        read -p "Enter a string : " str
        lower=$( echo "$str" | tr '[:upper:]' '[:lower:]' )
        upper=$( echo "$str" | tr '[:lower:]' '[:upper:]' )
        echo "Lowercase : $lower"
        echo "Uppercase : $upper"
        
        ;;
    2)
        read -p "Enter a string : " str
        read -p "Enter the index position : " i
        read -p "Enter the no of characters : " n
        substring=${str:i:n}
        echo "The substring is : $substring"
        ;;
    3)
       read -p "Enter the string : " str
        read -p "Enter the word to be replace : " word1
        read -p "Enter the word to be replaced : " word2
        result=${str//$word1/$word2}
        echo "The modified string : $result"
        ;;
    4)
        read -p "Enter the string : " str
        read -p "Enter the character/word to count : " char
        count=$(grep -o "$char" <<< "$str" | wc -l)
        echo "Occurence of '$char' is : $count"
        ;;
    5)
        read -p "Enter the first string : " str1
        read -p "Enter the second string : " str2
        if [[ "$str1" == "$str2" ]]
        then
            echo "Strings are equal"
        else
            echo "Strings are not equal"
        fi 
        ;;
    6)
        echo "Existing program"
        break
        ;;
    *)
        echo "Invalid choice"
        ;;
    esac
done


