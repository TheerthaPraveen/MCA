#!/bin/bash
read -p "Enter the file name : " file1
echo "Enter the contents of $file1 : "
cat > $file1
read -p "Enter thr second file : " file2
cp $file1 $file2
echo " $file1 copied successfully"
cat $file2