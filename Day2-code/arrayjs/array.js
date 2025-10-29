let numbers = [30, 20, 35, 11, 10];
console.log("Initial Array:", numbers);

let choice = prompt(`Choose an operation (enter the number):
1. Add a number to the end
2. Remove the first number
3. Insert a number at a specific index
4. Replace all occurrences of a number
5. Sort ascending (without sort)
6. Reverse (without reverse)
7. Find index of a number`);

switch (parseInt(choice)) {
  case 1:
    let addNum = parseInt(prompt("Enter a number to add at the end:"));
    numbers.push(addNum);
    console.log("After adding:", numbers);
    break;

  case 2:
    numbers.shift();
    console.log("After removing first element:", numbers);
    break;

  case 3:

    let insertNum = parseInt(prompt("Enter the number to insert:"));
    let index = parseInt(prompt("Enter the index to insert at:"));
    numbers.splice(index, 0, insertNum);
    console.log(`After inserting ${insertNum} at index ${index}:`, numbers);
    break;

  case 4:
    //Replace all occurrences
    let oldNum = parseInt(prompt("Enter the number to replace:"));
    let newNum = parseInt(prompt("Enter the new number:"));
    for (let i = 0; i < numbers.length; i++) {
      if (numbers[i] === oldNum) {
        numbers[i] = newNum;
      }
    }
    console.log(`After replacing ${oldNum} with ${newNum}:`, numbers);
    break;

  case 5:
    // Sort ascending
   let num = numbers.slice(); 
    num.sort(); 
    console.log("After sorting ascending (with sort()):", num);
    break;

  case 6:
    // Reverse
   let reversed = [];
   for (let i = numbers.length - 1; i >= 0; i--) {
    reversed.push(numbers[i]);
  }

  console.log("Reversed array:", reversed);
    break;

  case 7:
    // Find index of a number
    let searchNum = parseInt(prompt("Enter the number to find:"));
    let ind = numbers.indexOf(searchNum);

  if (ind!== -1) 
    {
  console.log(`${searchNum} found at index ${ind}`);
  } 
else 
    {
  console.log(`${searchNum} not found`);
}
    break;

  default:
    console.log("Invalid choice! Please refresh and try again.");
}
