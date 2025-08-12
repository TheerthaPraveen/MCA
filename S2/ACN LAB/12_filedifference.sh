#!/bin/bash
read -p "Enter the first filename : " file1
echo "Enter the contents of $file1 : "
cat > $file1
read -p "Enter the second filename : " file2
echo "Enter the contents of $file2 : "
cat > $file2
read -p "Enter the third filename : " file3
echo "The different contents are : "
diff -a $file1 $file2 > $file3

cat $file3