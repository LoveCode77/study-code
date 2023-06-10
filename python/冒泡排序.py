a=[2,1,3,4,5]
len=len(a)
for i in range(len-1):
	  for j in range(len-1-i):
		  if a[j]>a[j+1]:
			  a[j],a[j+1]=a[j+1],a[j]
print(a)
