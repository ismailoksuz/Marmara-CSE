import numpy as np
import matplotlib.pyplot as plt

#Finds the option for q1.2
def question1_2(ans):
    options = [1,3,5,10,17]
    dif = abs(ans-options[0])
    res = options[0]
    for i in range(len(options)):
        if abs(ans-options[i])<dif:
            dif = abs(ans-options[i])
            res = options[i]
    return res

#Finds the option for q1.3
def question1_3(ans):
    rounded = round3float(ans)    
    options = [
        [1.000, 1.000],
        [0.713, 0.045],
        [0.016, 0.112],
        [-0.083, 0.029],
        [0.045, 0.024]
    ]
    res = options[0]
    for i in range(5):
        if rounded==options[i]:
            res = options[i]
    return ("("+str(res[0])+","+str(res[1])+")")

#Finds the option for q1.4
def question1_4(ans):
    options = [10**-1, 10**-7, 10**-14, 10**-17, 10**-20]
    dif = abs(ans - options[0])
    res = options[0]
    for i in range(0,5):
        if (abs(ans - options[i]) < dif):
            dif = abs(ans - options[i])
            res = options[i]
    return res

#Using for q6
def round3float(coordinates):
    v1 = coordinates[0]
    v2 = coordinates[1]
    nv1 = round(v1, 3)
    nv2 = round(v2, 3)
    ncoordinates = [nv1, nv2]
    return ncoordinates

#Calculates value for partialderivative
def fE(arr):
    v1 = arr[0]
    v2 = arr[1]
    expmv1 = np.exp(-v1)
    expv2 = np.exp(v2)
    pdrv = (v1*expv2 - 2*v2*expmv1)**2
    return pdrv

#Returns derivative respect to u
def derivative_fE_du(u, v):
    v1 = u
    v2 = v
    expmv1 = np.exp(-v1)
    expv2 = np.exp(v2)
    prdvroot = (v1*expv2 - 2*v2*expmv1)  
    return 2*prdvroot*(expv2 + 2*v2*expmv1)

#Returns derivative respect to v
def derivative_fE_dv(u, v):
    v1 = u
    v2 = v
    expmv1 = np.exp(-v1)
    expv2 = np.exp(v2)
    prdvroot = (v1*expv2 - 2*v2*expmv1)
    return 2*prdvroot*(v1*expv2 - 2*expmv1)

#Calculates gradient
def gradient(arr):
    v1 = arr[0]
    v2 = arr[1]
    expmv1 = np.exp(-v1)
    expv2 = np.exp(v2)
    pdrvroot = (v1*expv2 - 2*v2*expmv1)    
    ind1 = 2*pdrvroot*(expv2 + 2*v2*expmv1)
    ind2 = 2*pdrvroot*(v1*expv2 - 2*expmv1)
    arr = np.array([ind1,ind2])
    return arr

#Gradient Descent, answers for q1.2 and q1.3 come from this method
def gradDescent(fE, gradient, arr, tol=1e-14, n=0.1):
    noiterations = 0
    while fE(arr) > tol and noiterations <= 100:
        arr = arr - n*gradient(arr)
        noiterations += 1
    if noiterations > 100:

        #nothing will return
        return
    else:
        
        #returns no of iterations and coordinates here (answers of the q5 and q6)
        return (arr, noiterations)

#Coordinate Descent, answer for q1.4 come from this method
def crdDescent(fE, derivative_fE_du, derivative_fE_dv, uinit, vinit, tol=1e-14, n=0.1):
    v1 = uinit
    v2 = vinit
    v1arr = [v1]
    v2arr = [v2]
    for i in range(0,15):
        du = derivative_fE_du(v1, v2)
        v1 = v1 - n*du
        v1arr.append(v1)
        v2arr.append(v2)
        dv = derivative_fE_dv(v1, v2)
        v2 = v2 - n*dv
        v1arr.append(v1)
        v2arr.append(v2)
    return fE([v1, v2])
    
    
vals = np.array([1, 1])

#gets values for q1.2 and q1.3 with calling gradDescent method
coordinates, noiterations= gradDescent(fE, gradient, vals)

#gets values for q1.4 with calling crdDescent method
ansq7 = crdDescent(fE, derivative_fE_du, derivative_fE_dv, 1.0, 1.0)
answerq12 = question1_2(noiterations)
answerq13 = question1_3(coordinates)
answerq14 = question1_4(ansq7)
print("Question 1.2's answer: "+str(answerq12))
print("Question 1.3's answer: "+str(answerq13))
print("Question 1.4's answer: "+str(answerq14))