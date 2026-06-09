//📋 The Rules for Your FunctionTrim any accidental spaces at the front or back of the email.Turn the entire email into lowercase letters.Check if the email ends with "@gmail.com".If it does end with @gmail.com, return the clean email.If it does not, return the text "Invalid Email".
function cleanEmail(email){
let message;
    email = email.trim();
    email = email.toLowerCase();
    if(email.endsWith('@gmail.com') === true){
    message = email;
    } else {
    message = 'Invalid Email'    
    }
return message;
}
module.exports = {cleanEmail};
