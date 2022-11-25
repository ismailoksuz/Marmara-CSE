#!/bin/bash


file=$1
word1=$2
word2=$3
count=0
#this block reads given file word to word and if determine word who is given as a command line argument 2, changes it with the command line argument 3 
while read line;do
	for word in $line;do
		if [ "$word" == "$word1" ]; then
			let "count += 1"
			sed -i s/$word/$word2/g $file			
		fi	
	done
done<$file

echo "All $count occurences of $word1 in file has changed with $word2"


