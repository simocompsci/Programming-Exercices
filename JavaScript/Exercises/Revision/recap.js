const numbers = [6, 10];
const [first, second, , fourth] = numbers;

console.log(first, second, fourth);
console.log(first, second, fourth);
console.log(first, second, fourth);

const user = { name: "Nishant", height: "20 meters" };
const { name, salary = 200, height } = user; // salary defaults to 200 [11]

console.log(name, salary, height);

// Safe Property Reading (Optional Chaining &amp; Nullish Coalescing)
// Optional Chaining (?.)**: Short-circuits evaluation and safely returns `undefined`
//  instead of throwing a runtime type error if a nested property does not exist

// **Nullish Coalescing (??): Provides a fallback value specifically when
// an expression evaluates to `null` or `undefined`[10]

const city = user?.profile?.address?.city ?? "No address provided";
[14, 15];

// array and object destructuring in JS
// Note on Shallow Copies: Spread syntax performs a shallow copy,
// meaning nested objects or arrays retain shared references in memory unless deeply cloned

// Array updating and merging

const numbers1 = [6, 8];
const updatedNumbers = [...numbers, 4]; // Adds 4 immutably [19] const mergedArrays = [...array1, ...array2]; // Merges two arrays [23]

// Object Updating and Merging

const user1 = { name: "Matsu", age: 28 };
const updatedUser = { ...user1, age: 29 }; // Overrides age without modifying `user` [22]

// transforming data with array methods

// JavaScript provides functional array methods—`map`, `filter`, and `reduce`—
// that transform data immutably by returning new values without modifying the original array

// map() -> element transformation
// Creates a new array of the same lengthby applying a function to transform each element

const numbers2 = [1, 2, 3, 4, 5];
const squared = numbers2.map(num => num * num);
console.log(squared);

// filter() -> subset selection
// Creates a new array containing only the elements that pass a given conditional test

const students = [
  { name: "quincy", age: 22 },
  { name: "mounir", age: 14 },
  { name: "dubois", age: 16 },
  { name: "hassan", age: 25 },
];

const adultStudents = students.filter(student => student.age >= 18);
console.log(adultStudents)

// reduce() -> aggregation
// Iterates over an array to aggregate its elements into a single resulting value 
// (such as a sum, count, or accumulated object) using an initial accumulator value

const numbers3 = [1,2,5,8,7,9]
const sum = numbers3.reduce((acc , num) => acc + num, 0);
console.log(sum)

// Chaining transformation operations 
// These functional methods can be chained together into a single pipeline 
// to perform multi-step data processing efficiently and cleanly

const numbers4 = [6,66,5,87,99,10,24,2]

const sumOfEvenSquares = numbers4.filter(num => num % 2 === 0)
                                  .map(num => num * num)
                                  .reduce((acc , num) => acc + num , 0)

console.log(sumOfEvenSquares)


// Arrow functions and Callbacks
// Introduced in ES6, arrow functions offer a modern syntax 
// for declaring functions with specific structural advantages


// Traditional function
const add1 = function(a, b) { return a + b; };

// Arrow function with implicit return [2, 4]
const add2 = (a, b) => a + b;

// Understanding callbacks 

// A callback is a function passed as an argument into another 
// function, designed to be executed ("called back") at a later time or in response to a specific action.

// Callbacks are widely used across JavaScript:

// 1. Array Processing: Passed into transformation methods like `map()`, `filter()`, and `reduce()` to process items.
// 2. Event-Driven Execution: Attached to DOM events or UI component triggers to execute when user actions happen (such as clicks or keypresses).
// 3. Asynchronous Handlers: Passed to timers (`setTimeout`) or API request chains to run when asynchronous operations complete.