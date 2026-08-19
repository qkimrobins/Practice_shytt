#Printing multiples of 3 from 1 to 50 but skipping 15
for i in range(3, 51, 3):
    if i == 15:
        continue
    print(i)