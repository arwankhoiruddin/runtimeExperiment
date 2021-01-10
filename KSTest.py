from scipy.stats import ks_2samp
import numpy as np

np.random.seed(12345678)
x = np.random.normal(0, 1, 1000)
y = np.random.normal(0, 1, 1000)
z = np.random.normal(1.1, 0.9, 1000)

[s, p] = ks_2samp(x,y)
if (s < 0.05):
    print("no significant difference between x and y")
else:
    print("x and y are significantly different")

[s, p] = ks_2samp(x, z)
if (s < 0.05):
    print("no significant difference between x and z")
else:
    print("x and z are significantly different")
