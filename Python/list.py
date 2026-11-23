#intro to Lists
marks=[98,99,97,95,94,47]
print(marks,type(marks))
print(len(marks))
#slicing list
print(marks[-2])
print(marks[-3:])
#printing values
for score in marks:
    print(score)

#Appending values
marks.append(50)
print(marks)

#Inserting value
marks.insert(1,41)
print(marks)

#checking
print (100 in marks)

#clearing 
marks.clear()
print(marks,type(marks))