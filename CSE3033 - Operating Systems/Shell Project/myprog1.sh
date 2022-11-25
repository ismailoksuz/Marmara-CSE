#!/bin/bash
#file var takes command line arg
file=$1
#while block reads the file and prompt * according to relevant integer 
while read line
do
for (( i=0; i<$line; i++ ))
do
printf "*"
done
echo 
done < $file
exit 0
