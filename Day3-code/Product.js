function Product(name, price, category) {
  this.name = name;
  this.price = price;
  this.category = category;
}

Product.prototype.getDiscountedPrice = function (percent) {
  return this.price - (this.price * percent) / 100;
};

function getMaxPrice() {
  var max = 0;
  for (var i = 0; i < this.length; i++) {
    if (this[i] > max) {
      max = this[i];
    }
  }
  return max;
}

(function () {
  var products = [
    new Product("Laptop", 79999, "Electronics"),
    new Product("Earphone", 1200, "Electronics"),
    new Product("T-shirt", 25, "Clothing"),
    new Product("Bag", 9999, "Accessories"),
  ];

  var productList = document.getElementById("Productlst");
  var costliestDiv = document.getElementById("costliest");

  var prices = products.map((p) => p.price);
  var maxPrice = getMaxPrice.call(prices);

var heading = document.createElement("h4");
heading.textContent = `Price of costliest product is $${maxPrice}`;
costliestDiv.appendChild(heading);

  products.forEach((product) => {
    var card = document.createElement("div");
    card.className = "card";
    card.style.border = "1px solid #ccc";
    card.style.padding = "10px";
    card.style.margin = "10px";
    card.style.display = "inline-block";
    card.style.width = "200px";

    var name = document.createElement("h3");
    name.textContent = product.name;

    var price = document.createElement("p");
    price.textContent = `Price: RS ${product.price}`;

    var category = document.createElement("p");
    category.textContent = `Category: ${product.category}`;

    var discount = document.createElement("p");
    discount.textContent = `After 10% off: RS ${product
      .getDiscountedPrice(10)
      .toFixed(2)}`;

    card.appendChild(name);
    card.appendChild(price);
    card.appendChild(category);
    card.appendChild(discount);

    card.addEventListener("mouseenter", function () {
      card.style.backgroundColor = "lightblue";
    });

    card.addEventListener("mouseleave", function () {
      card.style.backgroundColor = "white";
    });

    productList.appendChild(card);
  });
})();

// const a = 'string'

// const ar = document.getElementsByClassName("product");
// const ar2 = document.querySelectorAll(".product");
// console.log("getElemntByClassname" ,ar);
// console.log("querySelector", ar2);

// const list1 = [];
// const list2 = [];

// ar.forEach(element => {
//   list1.push(element)
// });

// for (let i = 0; i < ar.length; i++) {
//   const element = array[i];

// }

// ar2.forEach(element => {
//   list2.push(element)
// });

// ar2.map(element => element);

// console.log("ar", ar);
// console.log("ar2", ar2);

// const liveCollection = document.getElementsByClassName("product"); // HTMLCollection
// const staticNodeList = document.querySelectorAll(".product"); // NodeList

// console.log("Initially:");
// console.log("HTMLCollection:", liveCollection.length);
// console.log("NodeList:", staticNodeList.length);

// // Add a new product when button is clicked
// document.getElementById("add").addEventListener("click", () => {
//   const newDiv = document.createElement("div");
//   newDiv.className = "product";
//   newDiv.textContent = "New Product";
//   document.body.appendChild(newDiv);

//   console.log("After adding new product:");
//   console.log("HTMLCollection (live):", liveCollection.length);
//   console.log("NodeList (static):", staticNodeList.length);
// });
