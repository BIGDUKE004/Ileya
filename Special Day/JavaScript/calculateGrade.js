//calculateGrade(scores)
//
//It should:70 – 100	"A"
//60 – 69	"B"
//50 – 59	"C"
//40 – 49	"D"
//below 40	"F"
//
//take an array of numbers (scores)
//return a letter grade based on the average

function calculateStudentGrade(score){
    let average = 0
    let total = 0
    for(let counter = 0; counter < score.length; counter++){
            total += score[counter];
    }

    average = total / score.length
            if(average>= 70 ){
            message = 'A'
            } else if(average >= 60 || average <= 69){
            message = 'B'            
            } else if(average >= 50 || average <= 59){
            message = 'C'
            }else if(average >= 40 || average <= 49){
            message = 'D'
            } else {
            message = 'F'
            }
return message
}

module.exports={calculateStudentGrade};
