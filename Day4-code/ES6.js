// arrow function:

const add = (a, b) => a + b;
console.log(add(2, 3));

//Default Parameters

function greet(name = "user name", message = "Welcome") {
  console.log(`Hello ${name}, ${message}`);
}
greet("Praveen", "good morning");
greet();

//Template Literals
function formatString(name, age) {
  return `Hello, my name is ${name} and I am ${age} years old.`;
}

formatString("Praveen", 25);

//Object Destructuring

const person = {
  name: "Alice",
  age: 25,
  address: {
    city: "New York",
    country: "NY",
  },
};

function extractinfo(person) {
  const {
    name,
    age,
    address,
    address: { city, country },
  } = person;

  console.log(`${name} lives in ${city}`);
  console.log(`address is ${address}`);
}

extractinfo(person);

//Rest Operator ...args collects all arguments passed into the function into an array named args.

function sumAll(...numbers) {
  //   let sum =numbers.reduce((a,b)=>a+b,0)

  let sum = 0;
  for (num of numbers) {
    sum += num;
  }
  return sum;
}

console.log(sumAll(2, 5, 3, 7, 8));

// Filter Even Numbers

function filterEven(...numbers) {
  let evennumbers = numbers.filter((num) => num % 2 == 0);

  console.log(evennumbers);
}

filterEven(34, 56, 29, 95);

//Array Mapping

function doublevalues(...arrays) {
  const doublearr = arrays.map((num) => num * 2);
  console.log(doublearr);
}

doublevalues(4, 5, 2, 7, 5, 1);

// Find the Maximum

function maximumarr(numbers) {
  return Math.max(...numbers);
}

const arr = [4, 6, 3, 8, 5, 4];

console.log(maximumarr(arr));

// Object and Array Destructuring
// Arrays are destructured using []
// Objects are destructured using {}

const data = [
  {
    name: "Bob",
    age: 24,
  },
  {
    name: "Alice",
    age: 21,
  },
];

function arrdest(data) {
  //  const [obj1,obj2]=data;
  //  const{name,age}=obj1;
  //  const{name:name2,age:age2}=obj2;

  const [{ name, age }, { name: name2, age: age2 }] = data;

  console.log(` ${name2} age is ${age}`);
}

arrdest(data);

// Data Manipulation using Array functions

const details = [
  {
    id: 1,
    title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 3.9,
      count: 120,
    },
  },
  {
    id: 2,
    title: "Fjall - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 4.9,
      count: 130,
    },
  },
];

function selectedData(details) {
  const result = details.map((info) => ({
    id: info.id,
    title: info.title,
    rate: info.rating.rate,
    count: info.rating.count,
  }));
  return result;
}

console.log(selectedData(details));

// Default Parameter

const fun = (name = "abc") => {
  if (name) {
    console.log("if", name);
  } else {
    console.log("else", name);
  }
};
fun(""); // output else

// Deep Clone Objects

const obj = { a: 1, b: { c: 2 } };
const deepcpy = JSON.parse(JSON.stringify(obj));
deepcpy.b.c = 42;
console.log(obj.b.c);
console.log(deepcpy.b.c);

//Flatten Nested Arrays

function flattenArray(arr) {
  return arr.reduce((acc, val) => {
    if (Array.isArray(val)) {
      return acc.concat(flattenArray(val));
    } else {
      return acc.concat(val);
    }
  }, []);
}

console.log(flattenArray([1, [2, [3, [4, 5]]]]));
