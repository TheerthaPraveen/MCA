#!/bin/bash
i="yes"
read -p "Enter the name of the database : " db
while [ $i = "yes" ]
do
    clear
    echo "1:View Database"
    echo "2:View Specific Record"
    echo "3:Add Record"
    echo "4:Delete Record"
    echo "5:exit"
    read -p "Enter your choice : " ch
    case $ch in
    1)
        cat $db;;
    2)
        read -p "Enter ID : " id
        grep -i $id $db
        ;;
    3)
        read -p "Enter the new student ID: " sid
        read -p "Enter new name : " sname
        read -p "Enter department : " sdept
        read -p "Enter  college name : " scollege
        echo $sid $sname $sdept $scollege>>$db
        ;;
    4)
        read -p "Enter the ID: " id
        grep -v "$id" $db > dbs1
        echo "Record is deleted "
        cat dbs1
        ;;
    5)
        exit ;;
    *)
        echo "Invalid choice"
    esac
    read -p "do you want to continue ? " i
    if [ $i != "yes"]
    then
        exit
    fi 
done