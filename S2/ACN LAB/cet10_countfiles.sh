#!/bin/bash
# count=0

# for entry in "$dir"/*
# do
#     if [ -f $entry ]
#     then
#         count=$((count+1))
#     fi
    
# done
# echo "no of files is : $count"

read -p "Enter the directory : " dir
i="C:/Users/ACER/OneDrive/Desktop/nsa lourde/$dir"
if [ -d $i ]
then
    no_files=$(find "$i" -type f | wc -l)
    echo "No of files : $no_files"
else
    echo "not a directory"
fi
