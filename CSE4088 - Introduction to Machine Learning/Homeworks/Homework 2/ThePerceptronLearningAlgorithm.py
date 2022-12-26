# import matplotlib.pyplot as plt
import numpy as np
import Dataset

#finds the correct option for question 4
def answer4(noOfIteration):
  options=[1,15,300,5000,10000]
  dif=abs(noOfIteration-options[0])
  choice=0
  for i in range(0,len(options)):
    if abs(noOfIteration-options[i])<dif:
      dif=abs(noOfIteration-options[i])
      choice=i
  return options[choice]

#finds the correct option for question 5 and 7
def answer57(probError):

  #as the options are same for q5 and q7, i used single function
  options=[0.001,0.01,0.1,0.5,0.8]
  dif=abs(probError-options[0])
  choice=0
  for i in range(0,len(options)):
    if abs(probError-options[i])<dif:
      dif=abs(probError-options[i])
      choice=i
  return options[choice]

#finds the correct option for question 6
def answer6(noOfIteration):
  options=[50,100,500,1000,5000]
  dif=abs(noOfIteration-options[0])
  choice=0
  for i in range(0,len(options)):
    if abs(noOfIteration-options[i])<dif:
      dif=abs(noOfIteration-options[i])
      choice=i
  return options[choice]

#calculates the results
def calculator(run,N,numpoints,qNo):
  iterationCountArray = []
  cntrTrueClassified = 0
  cntrErrorClassified = 0
  for i in range(run):
      dataset = Dataset.Dataset(num_points=numpoints)
      perceptionLearningAlgoritm = Dataset.PerceptionLearningAlgorithm(dataset)
      iterationCountArray.append(perceptionLearningAlgoritm.fit())
      for j in range(N):
          p = Dataset.getRandomCoordinates()
          if dataset.getTargetFunction(p) == perceptionLearningAlgoritm.getCandidateFunction(p):
              cntrTrueClassified += 1
          else:
              cntrErrorClassified += 1
  cntrClassified=cntrErrorClassified+cntrTrueClassified
  probError=answer57(float(cntrErrorClassified)/(cntrClassified))
  if qNo==4:
    noOfIteration=answer4(np.mean(iterationCountArray))
  elif qNo==6:
    noOfIteration=answer6(np.mean(iterationCountArray))
  if qNo%2==0:
    return noOfIteration
  else:
    return probError

#prints the answers
print("Question 4 =>",calculator(2000,1000,10,4))
print("Question 5 =>",calculator(2000,1000,10,5))
print("Question 6 =>",calculator(1000,100,100,6))
print("Question 7 =>",calculator(1000,100,100,7))