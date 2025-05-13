# Web Programming Lab Questions

## 1. Create a User Registration Web Page
- The form should contain scrolling text with white font color and blue background.
- Fields to include:
  - Name
  - Username
  - Password
  - Retype Password
  - Submit Button
  - Reset Button
- On clicking the submit button, check if the Password and Retype Password fields match. If they do, enter the data into the database and display a message "Successfully Registered".

## 2. Create a User Registration Web Page with Bouncing Text
- The form should contain bouncing text with white font color and blue background.
- Fields to include:
  - Name
  - Username (Primary Key)
  - Password
  - Submit Button
  - Reset Button
- On clicking the submit button, check if the Username already exists. If it doesn't, enter the data into the database and display a message "Successfully Registered".

## 3. Create a Login Web Page
- A registered user needs to log in using the correct username and password.
- Provide a link named "Not a member" inside the same login page. Clicking this link should redirect to a user registration form containing fields:
  - Name
  - Gender
  - Age (Dropdown list containing values between 20 to 50)
  - Username (Primary Key)
  - Password
- After registration, the user needs to log in by entering the username and password.

## 4. Create a Table `login`
- Fields to include:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, redirect to a page displaying the details of books corresponding to the logged user in a neat format.

## 5. Create a Table `login` and a Web Page for Book Entry
- Table `login` fields:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, redirect to a page for entering book details:
  - Book ID
  - Book Name
  - Author
  - Number of Copies (Dropdown list)
- Store these details into a table named `book`.

## 6. Create a Table `student`
- Fields to include:
  - Roll Number (Primary Key)
  - Name
- Manually enter some values into the table (without using code).
- Create a web page with two links: Mark Entry and Mark View.
  - Clicking Mark Entry loads a web page for mark entry with fields:
    - Roll Number (Dropdown list)
    - Mark
  - On clicking submit, save these values into the database.
  - Clicking Mark View displays the entered mark and roll number in a neat format.

## 7. Create a Table `student` with Additional Fields for Marks
- Fields to include:
  - Roll Number (Primary Key)
  - Name
- Manually enter some values into the table (without using code).
- Create a web page with two links: Mark Entry and Mark View.
  - Clicking Mark Entry loads a web page for mark entry with fields:
    - Roll Number (Dropdown list)
    - Assignment Mark
    - Series Mark
  - On clicking submit, save these values into the database.
  - Clicking Mark View displays the entered marks and roll number in a neat format.

## 8. Create a Web Page for Subject Details
- Table `login` fields:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, display a web page containing fields:
  - Subject
  - Faculty Name
  - Number of Students Present
- On submitting, save these details into the database.

## 9. Create a Web Page for Faculty Details
- Table `login` fields:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, display a web page containing fields:
  - Subject
  - Faculty Name
  - Total Number of Hours Per Week
  - Number of Hours Engaged
- On submitting, save these details into the database.

## 10. Create a Web Page for Attendance Details
- Table `login` fields:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, display a web page containing fields:
  - Roll Number
  - Student Name
  - Attendance Percentage
- On submitting, save these details into the database.

## 11. Create a Web Page for Student Registration
- Fields to include:
  - Name
  - Age
  - Gender
  - Educational Qualifications (displayed as a table for entering details)
  - Username
  - Password
- On clicking the submit button, check if the username already exists. If it doesn't, enter the data into the database and display a message "Successfully Registered".

## 12. Create a Web Page for Attendance Details
- Table `login` fields:
  - Username
  - Password
- Manually enter some values into the table (without using code).
- Create a web page for login. After successful login, display a web page containing fields:
  - Roll Number
  - Student Name
  - Attendance Percentage
- On submitting, save these details into the database.

## 13. Design an Online Electricity Bill Generation System
- **Form 1: Main Home Page**
  - This form consists of a search bill option for users (search based on consumer number and month to view bill details for that month) and a login for admin.
- **Form 2: Admin Home**
  - It must contain two links for Consumer Registration (Form 3) and Bill Entry (Form 4).
- **Form 3: Consumer Registration**
  - This form consists of consumer number, consumer name, address, and phone number.
- **Form 4: Bill Entry**
  - This form is for entering the bill details of each consumer.
  - (Month must be one of the field of this form).

  ## 14. Design a Score Card Generating System
- **Form 1: Login form for admin and student**
  - Admin can log in with the username and password as "admin". Students can log in with their own credentials.
  
- **Form 2: Admin Home**
  - Admin can register new students and add marks details for each student.

- **Form 3: Student Registration form**
  - Fields to include:
    - Username
    - Password
    - Name
    - Additional fields as needed for student registration.
  
- **Form 4: Mark Entry form for admin**
  - Fields to include:
    - Student ID (dropdown list)
    - Subject Code
    - Internal Mark (40 marks)
    - University Mark (60 marks)
    - Calculate the grade based on marks:
      - Mark >= 90%: O grade
      - Mark >= 80%: A grade
      - Mark >= 70%: B grade
      - Mark >= 60%: C grade
      - Mark >= 50%: P grade
      - Mark < 50%: F grade
  - Save the details, including the grade, into the database.

- **Form 5: Score Card**
  - After login, students can view their ID, name, internal marks, university marks, and grade.