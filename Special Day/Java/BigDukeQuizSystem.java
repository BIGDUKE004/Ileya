// this is a quiz app where you ask: the user,the number of student that enrolled for the quiz
// ask for the number of quizzes taken
// collect each student score for every quiz
// now what to do.........
// so if the total number of student is 2, you will collect 2 quiz score from the user;
//  so the number of quiz taken will determine the amount of times the program would collect input of scores
import java.util.Arrays;
import java.util.Scanner;
public class BigDukeQuizSystem{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in); 
    
    System.out.print("how many student enrolled: ");
    int enroll = input.nextInt();    
    
    System.out.print("how many quiz was taken: ");
    int quiztaken = input.nextInt();  

    int [] [] scores = new int[enroll] [quiztaken];
    int [] average = new int[enroll];


    for(int count = 0; count < enroll; count++){
            System.out.printf("Student %d: \n", count);   
                
        for(int counter = 0; counter < quiztaken; counter++){
            System.out.printf("Score for quiz:  ");               
            int user = input.nextInt(); 
                if(user < 0 || user > 100){
                System.out.print("wrong input");    
            } else {
            scores[count] [counter]= user;
            }
        }    
    
    } 

        for(int out = 0; out < scores.length; out++){
        
            for(int in = 0; in < scores[out].length; in++){
                    int add = scores[out][in];   
                    average[out] += add; 
                }            
        }

        for(int through = 0; through < average.length; through++){
                average[through] = average[through] / quiztaken;

        }
                int largest = average[0];
        for(int high = 0; high < average.length; high++){

                if(average[high] > largest){
               largest =  average[high];
                }
        }        

System.out.println("========= QUIZ GRADE REPORT==========");
System.out.print("Student   ");

        for(int display = 1; display <= quiztaken; display++){
System.out.printf("QZ%d   ",  display);
}

System.out.print("\n------------------------------------\n");
 
       for(int print = 0; print < enroll; print++){
//System.out.printf("Student%d: ", print);
        for(int quiz = 0; quiz < quiztaken; quiz++){
System.out.printf("Student%d: %d\n", print, scores[print][quiz]);
}
}

System.out.print("\n------------------------------------\n");
System.out.print("student average:   ");
        for(int ave = 0; ave < average.length; ave++){
            System.out.printf(" QZ%d  %d", ave+1, average[ave]); 
}
System.out.printf("Best Quiz: %d", largest);
    }

}
