#!/bin/bash
#num variable takes first command line argument
num=$1
i=0
rev=0
#this while block divide number and reverse it
while [ $num -gt 0 ];
do
	i=$(( $num % 10 ))
	rev=$(( $rev * 10 + $i ))
	num=$(( $num / 10 ))
done
sum=0
while [ $rev -ge 10 ];
do
	sum=$(( $sum + ($rev % 100)))
	rev=$(( rev / 10 ))
done
echo "The result is: $sum"
exit 0
