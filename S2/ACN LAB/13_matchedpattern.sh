#!/bin/bash
read -p "Enter the filename : " file1
echo "Enter the contents of the $file1 : "
cat > $file1

while true
do
    echo "1:display matched pattern from a file "
    echo "2:display lines start with a particular word"
    echo "3:display the count of lines which matches the given word"
    read -p "Enter your choice: " op
    case $op in
    1)
        read -p "Enter the pattern to search : " s
        grep -ni $s $file1
        ;;
    2)
        read -p "Enter the word  : " w
        grep "^$w" $file1
        ;;
    3)
        read -p "Enter the word to  count : " c
        grep -c $c $file1
        ;;
    4)
        echo "Exiting"
        exit 0;;
    *)
        echo "Invalid Choice";;
    esac
done

    