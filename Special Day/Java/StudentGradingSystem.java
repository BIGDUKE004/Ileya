//manage student grade: a program that let teachers enter scores for all his student, no matter how huge the students are and number of subject
//the app should: collect number of students
//collect number of subject
//collect the scores of each student for every subject
//note: score must be between 0 and 100
//display summary after collecting everything

// output to collect num of student
// same for subject
// create a 2d array for soring the input
// now collect the each score and store it in the array

// now i have gotten the scores to be kept in an array i need to get the average of this values including thier totoal
//write another function to calculate the both of them

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class StudentGradingSystem{

    public static int [] [] collectStudentScores(int numOfStudent, int numOfSubjects){

    Scanner input = new Scanner(System.in);

            String message = "";

            int [] [] storage = new int[numOfStudent][numOfSubjects];

            int count = 1;
            while(numOfStudent >= count){
                    System.out.printf("Entering Score For Student %d \n", count);

                    int counter = 1;
                    while(numOfSubjects >= counter){
                            System.out.printf("Entering Score For Subject %d: \n", counter);
                            int score = input.nextInt();
                        
                            int repeat = 0;
                                while(score < 0 || score > 100){
                                System.out.printf("Entering Score For Subject %d: \n", counter);
                                score = input.nextInt();
                                repeat++;
                                }
                            
                            message = """
                            Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                            Saved Successfully 
                            """;

                            storage[count - 1][counter - 1] = score;  
                   
                    counter++;
                    }
            count++;
            }         
    return storage;
}




    public static int [] getTotalOfScores(int [] [] storage){
    
    int [] total = new int[storage.length];

    for(int count = 0; count < storage.length; count++){
            for(int counter = 0; counter < storage[count].length; counter++){
              total[count] += storage[count][counter];  
        }    
    }
    return total;
    }


    public static float [] getAverageOfScores(int [] total, int amount){

    float [] average = new float [total.length];

   for(int count = 0; count < total.length; count++){
            average[count] = total[count] / amount;    
        }  
    return average;
    }


//to get the position for each student we have to sort the totals and before that we assign them....each student have their score now we sort it and assign grade to tehm let say we sort it from smallest to largest then do an incline loop where let say it is 5 sorted totals then the samllest value will start from 5 to the end and then when i wanna print i will just do if the value is equal to this then print that...omor!!!!!!!!!!!!!!
    public static int [] [] gettingStudentGrade(int [] total){

    int [][] sorted = new int[total.length][2];
    
    for(int count = 0; count < total.length; count++){
        for(int counter = count+1; counter < total.length; counter++){
                    if(total[count] > total[counter]){
                    int temp = total[count];
                    total[count] = total[counter];
                    total[counter] = temp;            
            }
        }    
    }
// now let fill index 0  with the scores
    for(int outter = 0; outter < sorted.length; outter++){
        sorted[outter][0] = total[outter];
    }
// now let fill index 1n with the values[grades]
    int value = sorted.length;
    for(int inner = 0; inner < sorted.length; inner++){
        sorted[inner][1] = value;
        value--;
    }

    return sorted;

    }


// main method
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("How many student do you have: ");
    int numOfStudent = input.nextInt();

    System.out.print("How many subject do they offer: ");
    int numOfSubjects = input.nextInt();

    int [] [] storage = StudentGradingSystem.collectStudentScores(numOfStudent, numOfSubjects);

    int [] total = StudentGradingSystem.getTotalOfScores(storage);

    float [] average = StudentGradingSystem.getAverageOfScores(total, numOfSubjects);

    int [][] sorted = StudentGradingSystem.gettingStudentGrade(total);

//    int [][] subject = StudentGradingSystem.storeScoresOfStudentInAParticularSubject(storage);

    System.out.print("\n===========================================================================\n");


    
    System.out.print("Student");



    for(int count = 1 ; count <= numOfSubjects; count++){
    System.out.printf("%10s%d", "Sub", count);
        }



    System.out.printf("%s %s %s", "    Total", "    Average", "    Position");

    System.out.print("\n===========================================================================\n");

    for(int scores = 0; scores < storage.length; scores++){
        System.out.printf("\nStudent %d", (scores+1));   
            for(int inner = 0; inner < storage[scores].length; inner++){
                System.out.printf("%9d" , storage[scores][inner]);            
        }
        System.out.printf("%8d%16f", total[scores], average[scores]);   
        if(sorted[scores][0] == total[scores]){
        System.out.printf("%10d", sorted[scores][1]);
        } 
    System.out.println();  
                    
    }


    System.out.print("\n===========================================================================\n");
    System.out.print("\n===========================================================================\n");




// second output
int counter = 1;

    System.out.println();  
    System.out.println();  
    System.out.println("SUBJECT SUMMARY");
    while(counter <= numOfSubjects){
int largest = 0;
int lowest =  0;
int totalScoreOfEachSubject = 0;
int inside = 0;

System.out.print("\n===========================================================================\n");
System.out.printf("Subject %d", counter);
System.out.print("\n===========================================================================\n");

int smallest = storage[0][counter - 1];
int highest = 0;

for(int count = 0; count < storage.length; count++){
totalScoreOfEachSubject += storage[count][counter - 1];
}

for(int large = 0; large < storage.length; large++){
    if(storage[large][counter - 1] > largest){
        largest = storage[large][counter - 1];  
        highest = large;              
        }
    }

for(int small = 0; small < storage.length; small++){
    if(storage[small][counter - 1] < smallest){
        smallest = storage[small][counter - 1];  
        lowest = small;              
        }
    }

int averageScore = totalScoreOfEachSubject / 2;
int pass =0;
int fail = 0;

for(int passmark = 0; passmark < storage.length; passmark++){
    if(storage[passmark][counter-1] > averageScore){
        pass++;    
    } else{
        fail++;    
    }
}
counter++;


System.out.printf("Highest scoring student is: Student %d scoring %d\n", highest+1,largest );
System.out.printf("Lowest scoring student is: Student %d scoring %d\n", lowest+1,smallest );
System.out.printf("Total score is: %d\n",totalScoreOfEachSubject);
System.out.printf("Average score is: %d\n",averageScore);
System.out.printf("Number of passes: %d\n", pass);
System.out.printf("Number of fails: %d\n", fail);
System.out.print("\n===========================================================================\n");
    
}


// third output

    }
}
