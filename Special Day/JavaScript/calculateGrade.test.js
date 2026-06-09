const {calculateStudentGrade} = require("./calculateGrade.js");

test ("that we get student grade", () => {
const list = [70, 85, 90];
const actual = calculateStudentGrade(list);
const expectedOutput = 'A';
expect(actual).toEqual(expectedOutput);

});
