import numpy as np
import matplotlib.pyplot as plt

#creates dataset
def createDataset(N):
  x1, y1 = 2*np.random.rand()-1, 2*np.random.rand()-1
  x2, y2 = 2*np.random.rand()-1, 2*np.random.rand()-1
  ydif = y2 - y1
  xdif = x2 - x1
  l1 = ydif/xdif
  l2 = y2 - l1*x2
  x = 2*np.random.rand(N, 3)-1
  x[:,0] = 1
  y = np.sign(l2 + l1*x[:,1] - x[:,2])
  dsk = np.where(y==-1)
  yksk = np.where(y==1)
  plt.scatter(x[dsk,1], x[dsk,2])
  plt.scatter(x[yksk,1], x[yksk,2])
  plt.show()
  return x,y

#tried to hold values for epoch and Eout into an array
epoch = []
Eout = []
for i in range(1,100):
  x, y = createDataset(100)
print(np.average(epoch))
print(np.average(Eout))
  


     

