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
  id: 1,
  name: "hassan",
  job: "software engineer"
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

// let data;
// async function fetchData (){
//   try {
//     const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
//     data = await response.json();
//     document.writeln(JSON.stringify(data.title));
//   } catch (error) {
//     throw new Error("Error" , error.response.message);

//   }

// }
// fetchData();

// function disemvowel(str) {
//  const vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'];
//   for(i = 0 ; i< str.length ; i++){
//     for(j = 0 ; j< vowels.length ; j++){
//       if(str[i] == vowels[j] || str[i] == "\n"){
//         str = str.replace(str[i], "");
//       }

//     }
//   }
//   return str;
// }

// console.log(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));

// var isSquare = function(n){
//   let roundedsqrt = Math.round(Math.sqrt(n));
//   if (Math.pow(roundedsqrt , 2) == n) {
//     return true;
//   }
//   return false;
// }
// console.log(isSquare(4));

// var uniqueInOrder = function (iterable) {
//   //your code here - remember iterable can be a string or an array
//   let resultedarr = [];
//   for (let i = 0; i < iterable.length; i++) {
//     if (iterable[i] !== iterable[i + 1]) {
//         resultedarr.push(iterable[i]);
//     }
//   }
//   return resultedarr;
// }

// console.log(uniqueInOrder("AAAABBBCCDAABBB"));
// console.log(uniqueInOrder([1,2,2,3,3]));
// console.log(uniqueInOrder('ABBCcAD'));

// function getMiddle(s) {
//   if (s.length % 2 == 0) {
//     return s[(s.length / 2)-1] + s[(s.length / 2)];
//   }
//   return s[Math.floor(s.length / 2)];
// }


// console.log(getMiddle("middle"));


// function solution(str) {
//   let pairs = [];


//   if (str.length % 2 == 0) {
//     for (let i = 0; i < str.length; i += 2) {
//       pairs.push(str.slice(i, i + 2));
//     }
//   }
//   else {
//     str = str + '_';
//     for (let i = 0; i < str.length; i += 2) {
//       pairs.push(str.slice(i, i + 2));
//     }
//   }

//   return pairs;
// }

// console.log(solution('abc'))

// function openOrSenior(data) {
//   let output = [];
//   for (let i = 0; i < data.length; i++) {
//     if (data[i][0] >= 55 && data[i][1] > 7) {
//       output.push("Senior");
//     }
//     else {
//       output.push("Open");

//     }

//   }
//   return output;
// }

// console.log(openOrSenior([[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]));

// function dnaStrand(dna){
//   let result = "";
//   for (let i = 0; i < dna.length; i++) {
//     if (dna[i] == "A") {
//       result += "T";
//     } else if (dna[i] == "T") {
//       result += "A";
//     } else if (dna[i] == "C") {
//       result += "G";
//     } else if (dna[i] == "G") {
//       result += "C";
//     }

//   }
//   return result;
// }

// console.log(dnaStrand("ATGCTAGCTAGCTAGCTAGCTA"));


// function findNextSquare(sq) {
//   // Return the next square if sq is a perfect square, -1 otherwise
//   nextsr = (Math.sqrt(sq)) % 1 === 0 ? Math.pow((Math.sqrt(sq) +1) , 2) : false;
//   return nextsr;

// }

// console.log(findNextSquare(11))

// function count(string) {
//   const result = {};
//   for (const char of string) {
//     result[char] = (result[char] || 0) + 1;
//   }
//   return result;
// }

// console.log(count("hahahahhgdgyyy"))

// function increment(x) { x++; }

// let a = 5;
// increment(a);
// console.log(a);


// let name = "Mohammed";
// console.log(name.toUpperCase());

// these fuckers in javascript can store elements of any type
// let fruits = ["Apple", "Orange", "Plum"];
// alert(fruits);

// for (let fruit of fruits) {
//   alert(fruit);
// }

// let matrix = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9]
// ];

// alert( matrix[0][1] );

// ["Bilbo", "Gandalf", "Nazgul"].forEach((item, index, array) => {
//   alert(`${item} is at index ${index} in ${array}`);
// });

// let users = [
//   { id: 1, name: "John" },
//   { id: 2, name: "Pete" },
//   { id: 3, name: "Mary" },
//   { id: 4, name: "John" }
// ];

// let user = users.find(item => item.id == 1);

// alert(user.name);



// Find the index of the first John
// alert(users.findIndex(user => user.name == 'John')); // 0

// // Find the index of the last John
// alert(users.findLastIndex(user => user.name == 'John')); // 3

// let someUsers = users.filter(item => item.id < 3);

// alert(someUsers.length);

// let lengths = ["Bilbo", "Gandalf", "Nazgul"].map(item => item.length); // we use map to transform elements of an array
// alert(lengths); // 5,7,6



// binary search algorithm implementation
// let arr = [1, 55, 88, 99, 102, 200, 451, 986];
// let target = 55;

// const BinarySearch = (arr, target) => {
//   let left = 0;
//   let right = arr.length - 1;
//   while (left <= right) {
//     const mid = Math.floor((left + right) / 2);
//     if (arr[mid] === target) {
//       return mid;
//     }
//     else if (arr[mid] > target) {
//       right = mid - 1;
//     }
//     else {
//       left = mid + 1;
//     }
//   }

//   return -1;
// }

// console.log(BinarySearch(arr , target));


// selection sort algorithm implementation
const findsmallest = (liste) =>{
  let smallest = liste[0];
  let smallest_index = 0;
  for (let i = 0; i < liste.length; i++) {
    if(liste[i] < smallest){
      smallest = liste[i];
      smallest_index = i;
    }
    
  }
  return smallest_index;
}

const selectionSort = (liste) => {
  let newArr = [];
  let copiedArr = [...liste];

  while (copiedArr.length > 0) {
    let smallestIndex = findsmallest(copiedArr);

    newArr.push(copiedArr[smallestIndex]);

    copiedArr.splice(smallestIndex, 1);
  }

  return newArr;
};


console.log(selectionSort([2, 451, 986 , 455, 88, 99, 102, 200]))