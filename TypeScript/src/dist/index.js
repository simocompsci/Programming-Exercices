"use strict";
console.log(2 + "2");
// type annotations
let number1 = 22;
let name1 = "mohammed";
console.log("hello my name is " + name1 + " and i have " + number1 + " baby mothars");
// typescript can still define variables dynamicaly , but its not recommended
// Anytype is a special type in TS that can represent any type
// generally advised to avoid using any type
let myVariable = 42;
myVariable = "helloo";
console.log(myVariable);
// Type annotations with objects
// we can do it like this 
let person;
person = {
    first_name: "Mohammed",
    last_name: "hassan",
    age: 22,
    date_of_birth: new Date(),
    address: {
        street: "1120 wall street",
        city: "NY",
    }
};
// or we can do it like this
let person1 = {
    first_name: "Mohammed",
    last_name: "hassan",
    age: 22,
    date_of_birth: new Date(),
    address: {
        street: "1120 wall street",
        city: "NY",
    }
};
// type annotation with  functions to specify types of params and 
// return values
function calculaterectangleArea(w, L) {
    return w * L;
}
const length1 = 22;
const width1 = 50;
const area = calculaterectangleArea(length1, width1);
console.log(area);
// we can make function params either optional or have default values
function greet(name, age) {
    if (age !== undefined) {
        console.log("name : " + name + " age " + age);
    }
    else {
        console.log("name " + name);
    }
}
greet("Alice", 22);
greet("Hassan");
function greetDefault(name, age = 18) {
    if (age !== undefined) {
        console.log("name : " + name + " age " + age);
    }
    else {
        console.log("name " + name);
    }
}
greetDefault("Alice", 22);
greetDefault("Hassan");
// using rest parameter to pass whatever number of params we want
function findAll(...nums) {
    let result = 0;
    for (let index = 0; index < nums.length; index++) {
        result += nums[index];
    }
    return result;
}
console.log(findAll(1, 5, 4, 88, 96, 77, 5));
// Arrow functions in typescript
const addArrow = (num1, num2) => num1 + num2;
console.log(addArrow(10, 20));
// Anonymous functions used when you need a function only one time without creating a global one
const add = function (num1, num2) {
    return num1 + num2;
};
console.log(add(10, 12));
// Void and Never
// Void often used with functions that dont return any value
// take a look into this never type
// Advanced Types
// Union Types : a variable that s annotated with union type means 
// that this variable can hold values of many types
let myVar;
myVar = 24;
console.log(myVar);
myVar = "momo";
console.log(myVar);
// literal Types used to specify an exact type (value that a variable can take)
// can be useful when you want to be explicit with the values that your variable can accept
let direction;
direction = "right";
console.log(direction);
// Nullable Types in TS allow a variable to accept nullable values
// useful when working with data that might not be existing or not initialized
let username = "glisher"; // can hold string or null
let ageEx = null; // can hold string or null
let myName = "hassan";
let myValue = 55;
const alice = {
    name: "alice",
    age: 22,
};
const bob = {
    name: "bob",
    age: 55,
    email: "bobo@gmail.com"
};
console.log(alice);
console.log(bob);
const person3 = {
    name: "jhon doe",
    age: 55,
    address: "4450 hay errahma",
    phone: "0623569988",
};
// type annotation with arrays
let fruit = ["apple", "bannana", "orange"]; // can only take strings
// type annotation with multi dim arrays
let arrayOne = [1, 4, 5, 5, 66, 99, 7, 11];
let arraytwo = ["a", "b", "c"];
let arrayThree = [1, 2, 3, "a", "b", "c"];
let multiDimArray = [[1, 2, 3], [4, 5, 6]];
// tuple like the ones in python -> look into it more when needed
// tuples are fixed in size and cant have additionnal elements
let article = [11, "title one", true];
// assigning a new tuple value to the article variable
article = [25, "title two", false];
console.log(article);
// Destructuring the tuple into individual variables
const [id, title, published] = article;
console.log(id);
console.log(title);
console.log(published);
// Enums -> used to define a set of constant values 
var Days;
(function (Days) {
    Days[Days["Sunday"] = 0] = "Sunday";
    Days[Days["Monday"] = 1] = "Monday";
    Days[Days["Tuesday"] = 2] = "Tuesday";
    Days[Days["Wednesday"] = 3] = "Wednesday";
    Days[Days["Thursday"] = 4] = "Thursday";
    Days[Days["friday"] = 5] = "friday";
    Days[Days["Saturday"] = 6] = "Saturday";
})(Days || (Days = {}));
const today = Days.Saturday;
console.log(Days[today]);
