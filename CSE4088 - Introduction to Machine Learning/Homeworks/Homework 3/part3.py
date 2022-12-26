import numpy as np
import requests

#It requests to download in.dta from website
try:
    with open("in.dta", "x") as input:
        req= requests.get("http://work.caltech.edu/data/in.dta")
        input.write(req.text)
        print("Successfully downloaded.")
except FileExistsError as fee:
    print("It is downloaded before")

#It requests to download out.dta from website
try:
    with open("out.dta", "x") as output:
        req2 = requests.get("http://work.caltech.edu/data/out.dta")
        output.write(req2.text)
        print("Successfully downloaded.")
except FileExistsError as e:
    print("It is downloaded before")

#It loads data
input = np.loadtxt("in.dta")
trainer1, trainer2 = input[:,:2], input[:,2]
output = np.loadtxt("out.dta")
tester1, tester2 = output[:,:2], output[:,2]