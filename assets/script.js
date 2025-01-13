
const contributorsContainer = document.getElementById("contributors-container");
fetch("https://api.github.com/repos/CET-MCA-26/MCA-Laboratory/contributors")
  .then((response) => response.json())
  .then((data) => {
    contributorsContainer.innerHTML = "";
    data.forEach((contributor) => {
      if (contributor.login === "jefintp") {
        return;
      }

      const contributorDiv = document.createElement("div");
      contributorDiv.className = "contributor";
      contributorDiv.innerHTML = `
                <img src="${contributor.avatar_url}" alt="${contributor.login}">
                <a href="${contributor.html_url}" target="_blank">${contributor.login}</a>
            `;
      contributorsContainer.appendChild(contributorDiv);
    });
  })
  .catch((error) => {
    contributorsContainer.innerHTML = "<p>Failed to load contributors.</p>";
    console.error("Error fetching contributors:", error);
  });

// Edit 

function openModal(content) {
  let labContent = '';
  if (content === 'Python Lab Content') {
    labContent = `
<<<<<<< HEAD
          <h3>PYTHON PROGRAMMING LAB</h3>
=======
          <h3>Python PROGRAMMING LAB</h3>
>>>>>>> main
          <h4>Lab Cycle</h4>
          <ul>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/01_area_perimeter_circle.py">Area and Perimeter of a Circle</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/02_swap2num.py">Swap 2 Numbers</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/03_Lof3.py">Largest of 3 numbers</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/04_ArithematicOps.py">Arithmetic Operations</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/05_firstn.py">First n Multiples</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/06_sumofeven.py">Sum of first 100 even numbers</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/07_factorial.py">Factorial</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/08_numofd.py">Number of digits</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/09_Leap.py">Leap year check</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/10_Rootsofquad.py">Roots of a quadratic equation</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/11_Stringechange.py">Exchange first and last characters in a string</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/12.list.py">Display first and last colours from a list</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/13.singlestring.py">Create a single string from two strings, swapping the character at position 1</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/14.dict.py">Sort dictionary (ascending and descending)</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/15.%20merge.py">Merge two dictionaries</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/16.GCD.py">GCD of 2 numbers</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/17.py">Remove all even numbers from a list</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/18.factorial.py">Factorial using function</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/19.fibinacci.py">Fibonacci series</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/20.charfreq.py">Character frequency in a string</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/21.IngorLy.py">Add 'ing' or 'ly' to a string</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/22.numbpyramid.py">Construct the pattern using nested loops</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/23.graphics.py">Graphics (Packages)</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/24.bank.py">Bank account (Constructor and Methods)</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/25.time.py">Time (Private attributes, Overloading)</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON8.Publisher.py">Publisher, Book, Python (Base class constructor, method overriding)</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/27.oddlines.py">Copy odd lines of one file to another</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/28.readcsv.py">Read each row from a CSV file</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/29.readcols.py">Read specific columns from a CSV file</a></li>
              <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/PYTHON/30.dicttocsv.py">Write a Python dictionary to a CSV file</a></li>
          </ul>
      `;
  }
  else if (content === 'DS Lab Content') {
    labContent = `
          <h3>ADVANCED DATA STRUCTURE LAB</h3>
          <h4>Lab Cycle</h4>
          <ul>
<<<<<<< HEAD
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/array.c">Array</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/stack.c">Stack</a></li>
            <li><a href="https://github.com/cetmca266/MCA-Laboratory/blob/main/S1/DS/queue.c">Queue</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/Circular(singly).c">Circular Queue</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/linkedlist.c">Linked List</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/Doubly_Linked_List.c">Doubly Linked List</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/Circular_DLL.c">Circular Linked List</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/Bitstringg.c">Set using Bit String</a></li>
          </ul>
          <h4>Lab Cycle 2</h4>
          <ul>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/BST.c">Binary Search Tree</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/prims.c">Prim's Algorithm</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/kruskals.c">Kruskal's Algorithm</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/djikstra.c">Dijkstra's Algorithm</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/topological.c">Topological Sorting</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/dfs.c">DFS</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/DS/bfs.c">BFS</a></li>
=======
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/array.c">Array</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/stack.c">Stack</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/queue.c">Queue</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/Circular(singly).c">Circular Queue</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/linkedlist.c">Linked List</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/Doubly_Linked_List.c">Doubly Linked List</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/Circular_DLL.c">Circular Linked List</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/Bitstringg.c">Set using Bit String</a></li>
          </ul>
          <h4>Lab Cycle 2</h4>
          <ul>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/BST.c">Binary Search Tree</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/prims.c">Prim's Algorithm</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/kruskals.c">Kruskal's Algorithm</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/djikstra.c">Dijkstra's Algorithm</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/topological_sort.c">Topological Sorting</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/dfs.c">DFS</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/blob/main/S1/DS/bfs.c">BFS</a></li>
>>>>>>> main
        </ul>
        `;
  }
  else {
    labContent = `
          <h3>WEB PROGRAMMING LAB</h3>
          <h4>Lab Cycle</h4>
          <ul>
          <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/Resume">Resume</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/InternalLink">Internal Links</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/ApplicationForm">Job Application</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/Frameset">Frameset</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/Css">CSS</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/RegistrationForm">Registration Form</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/factorial.php">Factorial</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/signup">Login Form</a></li>
<<<<<<< HEAD
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/WEB/javascriptfns.html">JavaScript Functions</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/tree/main/S1/WEB/bgcolorchange">JavaScript: Change Background Color</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/WEB/formvalidation.html">Form Validation</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/blob/main/S1/WEB/changeimage_hover.html.html">JavaScript: Change Image on Hover</a></li>
            <li><a href="https://github.com/cetmca26/MCA-Laboratory/tree/main/S1/WEB/Sample%20Qns/marks">Student Registration</a></li>
=======
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/JavaScriptFunctions">JavaScript Functions</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/ChangeBackgroundColor">JavaScript: Change Background Color</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/FormValidation">Form Validation</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/ChangeImageOnHover">JavaScript: Change Image on Hover</a></li>
            <li><a href="https://github.com/CET-MCA-26/MCA-Laboratory/tree/main/S1/WEB/StudentRegistration">Student Registration</a></li>
>>>>>>> main
            </ul>

          `;
  }
  document.getElementById('modal-body').innerHTML = labContent;
  document.getElementById('modal').style.display = 'flex';
}

function closeModal() {
  document.getElementById('modal').style.display = 'none';
}

window.addEventListener('scroll', function () {
  const navbar = document.getElementById('navbar');
  if (window.scrollY > 100) {
    navbar.classList.add('sticky');
  } else {
    navbar.classList.remove('sticky');
  }
});
