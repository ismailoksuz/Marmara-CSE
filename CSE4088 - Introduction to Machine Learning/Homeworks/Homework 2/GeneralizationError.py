#I used numpy
import numpy


'''findArgument finds the argument part of logarithm. 
pb stands for probability bound and M stands for M'''
def findArgument(pb,M):
    return pb/(2*M)


'''findMin finds the min value of N
argument is the result of findargument part and e2 is the epsilon value'''
def findMin(e2,argument):
    ln=numpy.log
    minN=(ln(argument))/(-2*(e2**2))
    return minN


#findOption finds the correct option according to the minimum N value.
def findOption (minN):
    options=[500,1000,1500,2000]
    for j in range(0,len(options)-1):
        if(minN>options[j] and minN<=options[j+1]):
            return options[j+1]
    return "More exaples are needed"

#İsmail ÖKSÜZ
#150119516

#Created arrayM for M values
arrayM=[1,10,100]

#Created results to append answers
results=[]

#Code runs for every M values.
for i in range (0,len(arrayM)):

    #assign value to argument varible => ln(pb/(2*M))
    argument=findArgument(0.03,arrayM[i])

    #assign value to minN varible => argument/(-2*epsilon^2)
    minN=findMin(0.05,argument)

    #finds the correct option and add the result to results array
    results.append(findOption(minN))

#results array holds the answers for each question
for m in range(0,len(results)):
    print("Question",m+1,"=>",results[m])
    
            


    