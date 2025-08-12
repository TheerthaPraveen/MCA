# Step 1: Start
# Step 2: Prompt the user to enter the length of the rectangle and store it in variable l.
# Step 3: Prompt the user to enter the breadth of the rectangle and store it in variable b.
# Step 4: Calculate the area of the rectangle using the formula:
# area = l * b

# Step 5: Calculate the perimeter of the rectangle using the formula:
#  perimeter = 2 * (l + b)

# Step 6: Display the calculated area.
# Step 7: Display the calculated perimeter.
# Step 8: Stop



#!/bin/bash
read -p "Enter the length of the rectangle : " l
read -p "Enter the breadth of the rectangel : " b

area=$((l*b))
perimeter=$((2*(l+b)))
echo "Area of the rectangle is : $area"
echo "Perimeter of the rectangle is : $perimeter"