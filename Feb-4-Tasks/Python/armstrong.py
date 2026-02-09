num = int(input("Enter a number: "))

digits = len(str(num))
sum = 0

for d in str(num):
    sum += int(d) ** digits

if sum == num:
    print("Armstrong number")
else:
    print("Not an Armstrong number")
