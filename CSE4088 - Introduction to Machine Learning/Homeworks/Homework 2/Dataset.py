import random
import matplotlib.pyplot as plt
import numpy as np

def getRandomCoordinates():
    return (random.uniform(-1, 1),random.uniform(-1, 1))

class PerceptionLearningAlgorithm:
  def getCandidateFunction(self, point):
    return int(np.sign(self.weight[0]*1 + self.weight[1]*point[0] + self.weight[2]*point[1]))
        
  def __init__(self, dataset):
    self.weight = np.array([0, 0, 0])
    self.dataset = dataset
        
  def fit(self, iterationPloted=False):
    self.weight = np.array([0, 0, 0])
    iterationCount = 0
    while True:
      misclassifiedPointsArray = []
      for (x, y) in zip(self.dataset.xs, self.dataset.ys):
        if self.getCandidateFunction(x) != y:
          misclassifiedPointsArray.append((np.array([1, x[0], x[1]]), y))
      if len(misclassifiedPointsArray) > 0:
        iterationCount += 1
        mpa1, mpa2=random.choice(misclassifiedPointsArray)
        self.weight = self.weight + mpa1*mpa2
      else:
        return iterationCount 

class Dataset:
  def __init__(self, num_points):
    axis1 = getRandomCoordinates()
    axis2 = getRandomCoordinates()
    self.augmented1 = (axis2[1] - axis1[1]) / (axis2[0] - axis1[0])
    self.augmented2 = axis1[1] - self.augmented1 * axis1[0]
    self.xs = []
    self.ys = []
    for i in range(num_points):
      xn = getRandomCoordinates()
      self.xs.append(xn)
      self.ys.append(self.getTargetFunction(xn))

  def getTargetFunction(self, point):
    var1=self.augmented1
    var2=self.augmented2
    mult=var1*point[0]
    if mult + var2 > point[1]:
      return -1
    else:
      return 1       
  
  



