#!/bin/bash
read -p "Enter the file name : " file1
echo "Enter the file contents : " 
cat > $file1
read -p "Enter the 2nd filename : " file2
cp $file1 $file2
echo "File copied"
cat $file2

