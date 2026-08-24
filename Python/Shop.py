# Creating a Shopping store code for practicing loops,list and syntaxes

stock = {1: "Chips",2: "Kurkure",3: "Fizz",4: "Cake",5: "Paperboat",6: "Dairymilk"}

print("The store's inventory contains these items:")

for i in stock:
    print(i, stock[i])

print(" ")

print("What do you want to buy?")

x = int(input("Enter the number of items you want to buy: "))

while x != 0:
    item = int(input("Enter the itemID: "))

    if item in stock:
        print("You bought:", stock[item])
        del stock[item]
    else:
        print("Sorry, that item is not available.")

    x=x-1

print("\nRemaining inventory:")
for i in stock:
    print(i, stock[i])