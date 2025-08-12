#!/bin/bash
read -p "Enter the filename : " file1
echo "The contents of the $file1 are : "
cat > $file1
read -p "Enter the pattern you want to search : " s
grep -ni $s $file1