#//manage student grade: a program that let teachers enter scores for all his student, no matter how huge the students are and number of subject
#//the app should: collect number of students
#//collect number of subject
#//collect the scores of each student for every subject
#//note: score must be between 0 and 100
#//display summary after collecting everything
#
#// output to collect num of student
#// same for subject
#// create a 2d array for soring the input
#// now collect the each score and store it in the array
#
#// now i have gotten the scores to be kept in an array i need to get the average of this values including thier totoal
#//write another function to calculate the both of them

def collectStudentScores(numOfStudent, numOfSubjects):
    storage = [numOfStudent][numOfSubjects];
    count = 1;
    while(numOfStudent >= count):
        print(f"Entering Score For Student {count}: ")
        counter = 1;
        while(numOfSubjects >= counter){
            score = int(input(f"Entering Score For Subject {counter}: "))
            repeat = 0;
            while(score < 0 or score > 100){
                score = int(input(f"Entering Score For Subject {counter}: "));
                repeat += 1
                                    
        print("""
        Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Saved Successfully 
        """);

        storage[count - 1][counter - 1] = score;             
        counter += 1                  
        count += 1
return storage;



def getTotalOfScores(storage):
total = [len(storage)];

for count in storage:
    for counter in count:
        total[count] += storage[count][counter];  
return total;
 


def getAverageOfScores(total, amount):
average = [len(total)]
for count in total:
    average[count] = total[count] / amount    
return average;
    


#//to get the position for each student we have to sort the totals and before that we assign them....each student have their score now we sort it and assign grade to tehm let say we sort it from smallest to largest then do an incline loop where let say it is 5 sorted totals then the samllest value will start from 5 to the end and then when i wanna print i will just do if the value is equal to this then print that...omor!!!!!!!!!!!!!!
def gettingStudentGrade(total):
sort = [len(total)][2]
for count in total:
    for counter+1 in total:
        if(total[count] > total[counter]):
        temp = total[count];
        total[count] = total[counter];
        total[counter] = temp;            

#// now let fill index 0  with the scores
for outter in sort: 
    sort[outter][0] = total[outter];
    
#// now let fill index 1n with the values[grades]
value = len(sort)

for inner in sort:
    sort[inner][1] = value;
value -= 1

return sorted;




numOfStudent = int(input("How many student do you have: "))
numOfSubjects = int(input("How many subject do they offer: "))

storage = collectStudentScores(numOfStudent, numOfSubjects)
total = getTotalOfScores(storage)
average = getAverageOfScores(total, numOfSubjects);
sort = gettingStudentGrade(total);

    print("===========================================================================");
print("Student");

for count in range(numOfSubjects+1):
    print("%10s%d" % ("Sub", count))

print("%s %s %s" % ("    Total", "    Average", "    Position"));

    print("===========================================================================");

for score in storage:
    print("Student %d" % (scores+1));   
    for counter in storage[scores]:
        print("%9d" % (storage[scores][inner]));            
    print("%8d%16f" % (total[scores], average[scores]));   
    if(sort[scores][0] == total[scores]):
        print("%10d" % (sort[scores][1])); 
    print();  
                    
print("===========================================================================");
    print("===========================================================================");

