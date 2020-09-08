// Get the button:
mybutton = document.getElementById("myBtn");
mylogo = document.getElementById("header__logo--image");

// When the user scrolls down 100px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
  
  // Decrease logo
  if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
    mylogo.style.width = "7em";
  } else {
    mylogo.style.width = "9em";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}
