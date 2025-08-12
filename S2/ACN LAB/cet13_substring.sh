#!/bin/bash
read -p "Enter the string : "  str
read -p "Enter the index position : " i
read -p "Enter the no:of characters : " c
substr=${str:i:c}
echo "Substring is : $substr"