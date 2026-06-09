//The Goal: Write a function called isSpam that checks if a message contains forbidden words.The Rules:Accept a message string as a parameter.If the message contains the word "buy now" or "free money", return true.Otherwise, return false.Hint: Make sure to lowercase the message first so it catches "BUY NOW" too!

function isSpam(message){
let validation;
    if(message.includes(message.toLowerCase('buy now')) || message.includes(message.toLowerCase('free money'))){
     validation = true;
    }  else {
    validation = false;    
    }
return validation ;
}
module.exports = {isSpam};
