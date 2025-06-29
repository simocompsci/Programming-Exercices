// var message = ' is one of my favorite things to do';

// const hobbies =[
//     'gaming',
//     'sports', 
//     'traveling',
//     'boxing',
//     'manga',
// ];
// const name = 'Mohammed';
// const age = '21';

// hobbies.map((hobbie) =>(
//     console.log(hobbie + message)
// ));
// const bigInt = 1234567890123456789012345678901234567890n;

// console.log(bigInt + bigInt);

// document.write(`hello my name is ${name} and i am ${age} years old`)


// const sayMyName =(name)  =>{
//     console.log(`Your ${name}`)
// };
// sayMyName("Heisenberg");

// let weight = prompt("How much do you wheigh :");
// let gender = prompt("what gender are you");


// function ValueWeight(weight , gender){
//     if(gender == 'Male'){
//         weight > 80 ? alert("you fat fuck") : alert("skinny bitch")
//     }
//     else if(gender == "female"){
//         weight > 50 ? alert("you fat bitch") : alert("you have a healty body hh")
//     }
// }

// ValueWeight(weight , gender)

// const DeleteUser =() =>{
//     confirm("do you really want to delete this user");
// }


// let age = prompt("how old are you");

// let message = (age > 0 )? "hello there": (age > 18)?"youre an adult":(age > 80 )?"you are really old": "fuck off" ;
// alert(message);
// alert( alert(1) || 2 || alert(3) );


const hobbies = ["football" , "swimming" , "dancing"];

// for(let i = 0 ; i <= hobbies.length ; i++){
//     console.log(hobbies[i] + "is one of the best things i like to do")
// }
// let i = 0;
// while (i <= hobbies.length -1) {
//         console.log(hobbies[i] + "is one of the best things i like to do");
//         i++;
// }

// let i = 0;
// do {
//     document.write(`<h1>${hobbies[i]} is one of the best things i love to do</h1>`);
//     i++
// } while (i <= hobbies.length -1);


/*in this block of code we give our loop a label so that when we want to break from a bunch of nested loops 
we break from the one that has a label*/


// outer: for (let i = 0; i < 3; i++) {

//   for (let j = 0; j < 3; j++) {

//     let input = prompt(`Value at coords (${i},${j})`, '');

//     // if an empty string or canceled, then break out of both loops
//     if (!input) break outer; // (*)

//     // do something with the value...
//   }
// }

// alert('Done!');
// const day = "Friday";

// switch (day) {
//     case "Monday":
//         console.log("i hate my life");
        
//         break;
//     case "Friday":
//         console.log("i love my life");
//         break;


//     default:
//         console.log("the cycle keeps repeating");
//         break;
// }

// function noTextGiven(){
//     return "no text given you dumbass"
// }
// function showText (name , text = noTextGiven()){
//     return console.log(`My name is ${name} and the text is ${text}`);
// }

// showText("hassan" , "heloo my name is soozie sozie baloti hhhhhhh");

// function showPrimes(n) {

//   for (let i = 2; i < n; i++) {
//     if (!isPrime(i)) continue;

//     alert(i);  // a prime
//   }
// }

// function isPrime(n) {
//   for (let i = 2; i < n; i++) {
//     if ( n % i == 0) return false;
//   }
//   return true;
// }

// showPrimes(60);


