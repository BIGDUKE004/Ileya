const{isSpam} = require('./Spam.js');

test('test that messages returns true or false', () => {

let message = 'come and make buy now ';
const actual = isSpam(message);
const expectedOutput = true;
expect(actual).toBe(expectedOutput);

});
