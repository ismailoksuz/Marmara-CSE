#!/bin/bash

#creates 'smallest' and 'largest' dirctories if they are no exists
if [ ! -d "smallest" ];then 
mkdir smallest
fi
if [ ! -d "largest" ];then 
mkdir largest
fi

#finds smallest and largest files(this code blocks sorts only files not directories) and move smallest one to the smallest directory, largest one to the largest directory
smallest=$(find . -maxdepth 1 -type f -printf "%s %f\0" | sort -z -n | head -z -n 1 | cut -z -d ' ' -f 2- | tr '\0' '\n' )
mv $smallest smallest/

largest=$(find . -maxdepth 1 -type f -printf '%s %p\n'| sort -n -r | head -n 1 | cut -n -d ' ' -f 2- | tr '\0' '\n' )
mv $largest largest/



