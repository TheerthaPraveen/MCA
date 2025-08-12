#!/bin/bash
read -p "Enter the directory you want to search : " dir
for filename in "C:/Users/ACER/OneDrive/Desktop/$dir"
do
    if [ -d "$filename" ]
    then    
        echo "$filename is a directory"
    else
        echo "$filename is not a directory"
    fi 
done