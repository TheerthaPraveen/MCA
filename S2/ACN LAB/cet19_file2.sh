#!/bin/bash
read -p "Enter the filename : " file1
echo "The contents of the $file1 : "
cat   $file1
read -p "Enter the line number : " n
echo "Start print from line $n "
head -$n $file1
