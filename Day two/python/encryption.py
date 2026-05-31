#// ceasar cephers encryption
#// write a message and shift eac letter of the message with a specific amount of shift
#// collect input
#// count the amount of letters in the word and use the length to create an array to store the digit
#// take each letter and turn it into numbers
#// now add the specific amount of shift to each number
#// convert back to words
#//print
#
word = input("enter message: ")

shift =int(input("enter shift: "))

user = []
conversion = []

for count in range(len(word)):                      
    cast = ord(word[count]);
    user.append(cast);



for counter in range(len(user)):
    user[counter] += shift;
 


for finalcount in range(len(user)): 
    index = chr(user[finalcount])
    conversion.append(index);

point = "".join(conversion)

print(point);    
    
    

