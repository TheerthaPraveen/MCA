#!/bin/bash
read -p "Enter the filename : " file1
echo "The contents of the $file1 are : "
cat  $file1
read -p "Enter the word to count : " c
grep -c $c $file1