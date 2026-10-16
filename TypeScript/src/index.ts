console.log(2+"2")

// type annotations
let number1: number = 22;
let  name1: string = "mohammed";

console.log("hello my name is " + name1 + " and i have " + number1 + " baby mothars")


// typescript can still define variables dynamicaly , but its not recommended

// Anytype is a special type in TS that can represent any type

// generally advised to avoid using any type
let myVariable: any = 42;
myVariable = "helloo";

console.log(myVariable);

// Type annotations with objects
// we can do it like this 
let person :{
    first_name: string;
    last_name: string;
    age: number;
    date_of_birth: Date;
    address : {
        street: string;
        city: string;
    };
};

person = {
    first_name : "Mohammed",
    last_name : "hassan",
    age : 22,
    date_of_birth : new Date(),
    address : {
        street : "1120 wall street",
        city : "NY",
    }
}

// or we can do it like this

let person1 :{
    first_name: string;
    last_name: string;
    age: number;
    date_of_birth: Date;
    job_title?: string; // optional
    address : {
        street: string;
        city: string;
    };
} = {
    first_name : "Mohammed",
    last_name : "hassan",
    age : 22,
    date_of_birth : new Date(),
    address : {
        street : "1120 wall street",
        city : "NY",
    }
}


// type annotation with  functions to specify types of params and 
// return values

function calculaterectangleArea(w: number , L:number) : number {
    return w * L;
}

const length1: number = 22;
const width1: number = 50;
const area: number = calculaterectangleArea(length1 , width1);
console.log(area);

// we can make function params either optional or have default values

function greet(name: string , age?: number) {
    if (age !== undefined) {
        console.log("name : " + name + " age " + age);
    } else {
        console.log("name " + name)
    }
}

greet("Alice" , 22);
greet("Hassan");

function greetDefault(name: string , age: number = 18) {
    if (age !== undefined) {
        console.log("name : " + name + " age " + age);
    } else {
        console.log("name " + name)
    }
}

greetDefault("Alice" , 22);
greetDefault("Hassan");


// using rest parameter to pass whatever number of params we want

function findAll(...nums: number[]): number{
    let result = 0;
    for (let index = 0; index < nums.length; index++) {
        result += nums[index];
    }
    return result; 
}

console.log(findAll(1,5,4,88,96,77,5))

// Arrow functions in typescript

const addArrow = (num1: number , num2: number): number => num1 + num2;
console.log(addArrow(10,20));

// Anonymous functions used when you need a function only one time without creating a global one
const add = function (num1: number , num2: number): number {
    return num1 + num2;
};

console.log(add(10,12));

// Void and Never

// Void often used with functions that dont return any value

// take a look into this never type

// Advanced Types

// Union Types : a variable that s annotated with union type means 
// that this variable can hold values of many types

let myVar :number | string;


myVar = 24 ; 
console.log(myVar);
myVar = "momo";
console.log(myVar);


// literal Types used to specify an exact type (value that a variable can take)
// can be useful when you want to be explicit with the values that your variable can accept
let direction: "left" | "right" | "up" | "down";
direction = "right";
console.log(direction)

// Nullable Types in TS allow a variable to accept nullable values
// useful when working with data that might not be existing or not initialized
let username: string | null = "glisher"; // can hold string or null
let ageEx: number | null = null; // can hold string or null

// Type Alias used to define custom types

type MyString = string;

let myName : MyString = "hassan";

type MyStringOrNumber = string | number;

let myValue : MyStringOrNumber = 55;


type Employee = {
    name : string;
    age : number; 
    email? : string;
};

const alice: Employee = {
    name : "alice",
    age: 22,
}

const bob: Employee = {
    name : "bob",
    age: 55,
    email: "bobo@gmail.com"
}

console.log(alice)
console.log(bob)


// Intersection Type allows you to combine multiple types into one

type FirstType = {
    name: string;
    age: number;
};

type SecondType = {
    address: string;
    phone: string;
}

type CombinedType = FirstType & SecondType;

const person3: CombinedType = {
    name : "jhon doe",
    age: 55,
    address: "4450 hay errahma",
    phone: "0623569988",
}

// type annotation with arrays

let fruit: string[] = ["apple" , "bannana" , "orange"]; // can only take strings

// type annotation with multi dim arrays

let arrayOne : number[] = [1,4,5,5,66,99,7,11];
let arraytwo : string[] = ["a" , "b" , "c"];
let arrayThree : (string | number)[] = [1,2,3,"a","b","c"]

let multiDimArray: number[][] = [[1,2,3],[4,5,6]];

// tuple like the ones in python -> look into it more when needed
// tuples are fixed in size and cant have additionnal elements

let article: readonly [number , string , boolean] = [11 , "title one" , true];

// assigning a new tuple value to the article variable
article = [25 , "title two" , false];

console.log(article)

// Destructuring the tuple into individual variables

const [id, title, published] = article;
console.log(id);
console.log(title);
console.log(published);


// Enums -> used to define a set of constant values 

// enum Days {
//     Sunday, 
//     Monday,
//     Tuesday,
//     Wednesday,
//     Thursday,
//     friday,
//     Saturday,
// }

// const today: Days = Days.Saturday;
// console.log(Days[today]);


// Interfaces in TS
// later you have to see the difference between type and interface
interface PersonEX {
    name: string;
    age: number;
}

const jhon: PersonEX = {
    name: "jhon",
    age: 25
}

// interface methods and prameters

interface PersonEX2 {
    name: string;
    age: number;
    greet(message: string): void;
}

const person4: PersonEX2 = {
    name: "hassan",
    age: 45,
    greet(message) {
        console.log(`${this.name} says: ${message}`)
    },
}

person4.greet("hello from typescript !!!")


// ReOpen the interface and use cases 
// we can reopen interfaces in different files of our project and add nex attributes and 
// functions to them , and create our object that contain all of the 
// attributes and functions the interface now has (read more about this)

// this is enables modular developement by giving different parts of the 
// project the hand to contribute to building that interface

// Built in interfaces : are interfaces that are built and provided by TS/JS
// eg: HtmlElement

// Interfaces VS Type Aliases
// 1 - they have different declaration syntax
// 2 - interfaces can extand other classes , and can be implemented by other claasses unlike type aliases
// 3 - interfaces support declaration merging ( when you declare interfaces with the same name but different 
// attirbutes , TS merges them into one)
// 4 - inetrfaces are more extensible
// 5 - interfaces are recommended with apis and are genrally considered better for most use cases in dev



// Classes and POO in TS (yeah you can look into that later)

// Generics -> are a feature that allows you to write reusable code by passing types 
// to other types whether its class , interface or function

function returnType<T>(val: T): T{
    return val;
}

const numValue: number = returnType<number>(20);
const strValue: string = returnType<string>("victor");
const boolValue: boolean = returnType<boolean>(false);

// also deep dive into generics with multiple types