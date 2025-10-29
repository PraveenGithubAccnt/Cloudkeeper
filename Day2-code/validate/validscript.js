    const formval = document.getElementById('Nform');
    const fnameInput = document.getElementById('fname');
    const ageInput = document.getElementById('ageu');
    const clrchange = document.getElementById('dcolor');
    
    

    // name validation
    function validateForm() 
    {  

      const nameValue = fnameInput.value.trim();
      if (nameValue === "") {
        alert("Name must be filled out");
        return false; 
      }
     
      // age validation
      const ageValue = ageInput.value.trim();
      if (ageValue<18 ) 
        {
        alert("You must be at least 18 years old.");
        return false;
      }
       

      alert("Form submitted successfully!");
      return true;

    }

      // color change
    clrchange.addEventListener("mouseenter", function() {
    clrchange.style.backgroundColor = "yellow";
  });

  clrchange.addEventListener("mouseleave", function() {
    clrchange.style.backgroundColor = "white";
  });
