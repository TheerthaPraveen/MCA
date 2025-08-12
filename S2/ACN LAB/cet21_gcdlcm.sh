#!/bin/bash
read -p "Enter two numbers : " a b
if((a<b))
then
    s=a
else
    s=b
fi
for((i=s;i>0;i--))
do
    if(( $a % i == 0 && $b % i == 0))
    then
        gcd=$i
        break
    fi
done
echo "Gcd is : $gcd"
lcm=$(((a*b)/gcd))
echo "Lcm is : $lcm"