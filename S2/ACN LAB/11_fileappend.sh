#!/bin/bash
read -p "Enter the file name : " file1
echo "Enter the contents of $file1 : "
cat > $file1
read -p "Enter the filename to append : " file2
echo "Enter the contents of $file2: " 
cat > $file2
cat $file1 >> $file2
echo "The contents on file 2 after appending : "
cat $file2