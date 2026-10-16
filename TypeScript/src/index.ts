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

