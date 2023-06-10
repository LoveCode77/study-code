number=int(input("please input a number indicates the maximum range:"))
for i in range(100,number):
    onesPlace=i%10
    tensPlace=i//10%10
    hundredsPlace=i//10//10
    if onesPlace**3+tensPlace**3+hundredsPlace**3==i:
        print(i)
