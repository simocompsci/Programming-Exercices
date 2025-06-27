var message = ' is one of my favorite things to do';

const hobbies =[
    'gaming',
    'sports', 
    'traveling',
    'boxing',
    'manga',
];
const name = 'Mohammed';
const age = '21';

hobbies.map((hobbie) =>(
    console.log(hobbie + message)
));
const bigInt = 1234567890123456789012345678901234567890n;

console.log(bigInt + bigInt);

document.write(`hello my name is ${name} and i am ${age} years old`)


const sayMyName =(name)  =>{
    console.log(`Your ${name}`)
};
sayMyName("Heisenberg");

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

const DeleteUser =() =>{
    confirm("do you really want to delete this user");
}