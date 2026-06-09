const prompt = require("prompt-sync")();
function trackEmployee(numOfEmployees, numOfWeeks) {
    const track = [];

    for (let employee = 1; employee <= numOfEmployees; employee++) {
        console.log(`---- Employee ${employee} ----`);

        track[employee - 1] = [];
        for (let week = 1; week <= numOfWeeks; week++) {
            let days = Number(prompt(`Days present in week ${week}:`));

            while (days < 0 || days > 5 ) {
                days = Number(
                    prompt(`Invalid input. Enter days present in week ${week}:`)
                );
            }

            track[employee - 1][week - 1] = days;
        }
    }

    return track;
}

function getTotalOfEmployeesAttenadance(track){

let total = [];

    for(let count = 0; count < track.length; count++){
        total[count] = 0;   
        for(let counter = 0; counter < track[count].length; counter++){
        total[count] += track[count][counter];
            }
    }
return total;
}

function getPercentageOfDaysPresent(total, weeks){
    
    let percentage = [];

    for(let count = 0; count < total.length; count++){
        percentage[count] = (total[count] / (weeks * 5)) * 100;
    }
return percentage
}

function getStatusOfEmployee(percentage){
    let status = [];

    for(let count = 0; count < percentage.length; count++){
        if(percentage[count] < 60){
            message = '*** Low ***';            
        } else {
            message = 'ok';
        }
        status[count] = message;
    }
return status;
}


let employees = Number(prompt('enter number of employees: '));
let weeks = Number(prompt('enter number of weeks: '));
const attendance = trackEmployee(employees, weeks);
const totalOfDays = getTotalOfEmployeesAttenadance(attendance);
const percentage = getPercentageOfDaysPresent(totalOfDays, weeks);
const status = getStatusOfEmployee(percentage)
console.log(attendance);
console.log(totalOfDays);
console.log(percentage);
console.log('================ EMPLOYEE ATTENDANCE REPORT ================');

process.stdout.write("EMPLOYEE\t")
    for(let count = 1; count <= weeks; count++){
process.stdout.write(`WK${count}\t`);
}
process.stdout.write("TOTAL\t")
process.stdout.write("%\t")
process.stdout.write("STATUS\t")
console.log('\n==========================================================')

for(let counter = 0; counter < attendance.length; counter++){
process.stdout.write(`\nEmployee ${counter+1}`)
    for(let count = 0; count < attendance[counter].length; count++){
        process.stdout.write(`\t${attendance [counter][count]}      `)
    }
        process.stdout.write(`${totalOfDays [counter]}\t`)
        process.stdout.write(`${percentage [counter]}\t`)
        process.stdout.write(`${status [counter]}\t`)
        if(status[counter] === '*** Low ***'){
        console.log(`\nEmployee with attendance below 60%:
        -> Employee ${counter + 1} ${percentage [counter]} -> Flagged`)
        }
}



module.exports = {
trackEmployee,
getTotalOfEmployeesAttenadance,
getPercentageOfDaysPresent,
getStatusOfEmployee,
};










