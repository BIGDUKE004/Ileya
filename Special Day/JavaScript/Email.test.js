const {cleanEmail} = require('./Email.js');

test('test that we get the email clean or invalid input', () => {

const email = 'Elijah miracle'
const result = cleanEmail(email);
const expectedOutput = 'Invalid Email';

expect(result).toEqual(expectedOutput);

});
