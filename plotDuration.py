import matplotlib.pyplot as plt 

duration = []
with open('durasi.txt', 'r') as reader:
    line = reader.readline()
    while line != '': #EOF
        duration.append(line)
        line = reader.readline()

plt.plot(duration)
plt.ylabel('Duration of Bubble Sort')
plt.show()