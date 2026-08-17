print("____________Calculator____________")
print("1.Add\n2.Subtract\n3.Divide\n4.Multiply")
opt=int(input("enter what you want to do:"))
a=float(input("enter num1:"))
b=float(input("Enter num2:"))
if opt==1:
    print(a+b)
elif opt==2:
    if a>b:
        print(a-b)
    else:
        print(b-a)
elif opt==3:
    print(a*b)
elif opt==4:
    print(a/b)
else:
    print("invalid option entered")
