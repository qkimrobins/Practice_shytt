#Take 2 inputs and find and print numbers between 1 to 1000 divisble by both the numbers
a=int(input("Enter for var A:"))
b=int(input("Enter for var B:"))
for i in range(1,1000):
    if i%a==0 and i%b==0:
        print(i)

