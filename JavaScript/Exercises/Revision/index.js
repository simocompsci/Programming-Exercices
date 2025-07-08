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


// const hobbies = ["football" , "swimming" , "dancing"];

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


// how we write objects
const object1 = {
    id : 1,
    name : "hassan",
    job : "software engineer"
}

// we can create objects this way too
// put in mind we can use variable names like (var , let for , return , as a variable name ) but only inside objects
function makeUser(name, age) {
  return {
    // name : name,
    // age : age,
    name, // same as name: name
    age,  // same as age: age
  };
}


// let user1 = makeUser("mohammed" , 52);
// console.log(user1);
// console.log("age" in user1); // this in operatoe to check if a property exists within an object

// for (let element in user1){ // this loop is like a for each loop (used for arrays) it executes some code for each element in the
//                             // object(for in is used for objects)
//     console.log(element);
//     console.log(user1[element]);
// }

/* when we loop over objects we only get the result sorted ASC we we have integers as keys but strings are sorted by order of creation*/
// let codes = {
//   "49": "Germany",
//   "41": "Switzerland",
//   "44": "Great Britain",
//   // ..,
//   "1": "USA"
// };

// for (let code in codes) {
//   alert(code); // 1, 41, 44, 49
// }

// let user1 = {
//     name : "mohammed",
//     age: 24,
//     sayfuck : function(){
//         alert(`My name is ${this.name} and i tell you to fuck off`);
//     }
// }

// user1.sayHi = function(){
//     console.log(`hello my name is ${user1.name}`)
// }

// user1.sayHi();
// user1.sayfuck();

// let ladder = {
//   step: 0,
//   up() {
//     this.step++;
//     return this;
//   },
//   down() {
//     this.step--;
//     return this;
//   },
//   showStep: function() { // shows the current step
//     alert( this.step );
//     return this;
//   }
// };

// ladder.up().up().down().showStep().down().showStep(); 
// /* in this code each function in the object returns the object through  
// this keyword wich enables method chaining*/

let data;
async function fetchData (){
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
    data = await response.json();
    console.log(data);
  } catch (error) {
    throw new Error("Error" , error);
    
  }

}
fetchData();



                                                      