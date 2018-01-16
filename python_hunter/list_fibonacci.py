f=[0,1]
n=raw_input()
num=n-2
for i in range(num):
    f.append(f[i]+f[i+1])
    
print(f)
