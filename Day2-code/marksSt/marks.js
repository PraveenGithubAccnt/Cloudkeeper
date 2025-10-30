var students = [];
var addBtn = document.getElementById('addm');
var tableBody = document.getElementById('tableBody');

function calculateTotal(marks) {
  return marks.reduce((acc, mark) => acc + mark, 0);
}


function calculateAverage(marks) {
  return calculateTotal(marks) / marks.length;
}

function saveData() {
  localStorage.setItem('students', JSON.stringify(students));
}

function loadData() {
  var saved = localStorage.getItem('students');
  if (saved) {
    students = JSON.parse(saved);
    for (var i = 0; i < students.length; i++) {
      addRowToTable(students[i]);
    }
  }
}

function addRowToTable(student) {
  var row = document.createElement('tr');
  var rowHtml = "<td>" + student.name + "</td>";
  for (var i = 0; i < student.marks.length; i++) {
    rowHtml += "<td>" + student.marks[i] + "</td>";
  }
  rowHtml += "<td>" + student.total + "</td>";
  rowHtml += "<td>" + student.average.toFixed(2) + "</td>";
  row.innerHTML = rowHtml;
  tableBody.appendChild(row);
}

function addStudent() {
  var name = prompt("Enter student's name:");
  while (!name || name.trim() === "") {
    alert("Name cannot be empty. Please enter a valid name.");
    name = prompt("Enter student's name:");
  }

  var marks = [];
  for (var i = 1; i <= 5; i++) {
    var mark = parseFloat(prompt("Enter marks for Subject " + i + " (0-100):"));
    while (isNaN(mark) || mark < 0 || mark > 100) {
      alert("Please enter a valid number between 0 and 100.");
      mark = parseFloat(prompt("Enter marks for Subject " + i + " (0-100):"));
    }
    marks.push(mark);
  }

  var total = calculateTotal(marks);
  var average = calculateAverage(marks);

  var student = {
    name: name.trim(),
    marks: marks,
    total: total,
    average: average
  };

  students.push(student);
  addRowToTable(student);
  saveData();

  alert("Student added successfully!");
  console.log("Students Data:", students);
}

addBtn.addEventListener('click', addStudent);

loadData();
