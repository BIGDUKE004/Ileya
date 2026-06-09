const { trackEmployee,
getTotalOfEmployeesAttenadance,
getPercentageOfDaysPresent,
getStatusOfEmployee } = require("./EmployeeTracker.js");

test("test that i collect and store the user input", () => {
    const result = trackEmployee(2, 2);
    const expectedOutput = [
        [2, 2],
        [2, 2],
    ];

    expect(result).toEqual(expectedOutput);
});

test("test that i get total of employees attendance",() => {
    const track = [
        [2, 2],
        [2, 2]
    ];
    const result = getTotalOfEmployeesAttenadance(track);
    const expectedOutput = [4, 4]
    expect(result).toEqual(expectedOutput);
});

test("test that we get percentage of days present ", () => {
const total = [4,4]
const weeks = 2
const  result = getPercentageOfDaysPresent(total, weeks)
const expectedOutput = [ 40, 40 ]
expect(result).toEqual(expectedOutput);
});

test("test that i get status of employee", () => {
const total = [ 40, 40 ]
const result = getStatusOfEmployee(total)
const expectedOutput = ['*** Low ***', '*** Low ***']
expect(result).toEqual(expectedOutput)
});
