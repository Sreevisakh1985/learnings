console.log("Running the script in node - Google's JS V8 standalone engine");
let name  = 'Sree';
console.log(name);
console.log("Primitive types - String , Number, Boolean , null , undefined")

let person = { 
    name : "Sree",
    age : "36"
};
console.log(person)
console.log(person.age)
console.log(person.name)
person.age = 37;
console.log(person['age']);

let selectedColors = ['Red' , 'Blue' , 'Yellow'];
console.log(selectedColors)
function greet() {
    let nameArray = ['Minny' , 'Micky'];
    console.log('Inside the func' + nameArray)
}

greet();





