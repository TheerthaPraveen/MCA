#!/bin/bash
read -p "Enter the first filename : " file1
echo "The contents of the $file1 are : "
cat > $file1
read -p "Enter the second filename : " file2
echo "The contents of the $file2 are : "
cat > $file2
read -p "Enter the third filename : " file3
diff -a $file1 $file2 > $file3
cat $file3