#!/bin/bash
read -p "Enter the filename : " file
# echo "The contents of the $file are : "
# cat  $file
echo "The first 2 rows of the file : " 
head -2 $file