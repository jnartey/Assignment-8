# Assignment-8
Files Exercises

1. Reading a single file

Create one file on your desktop named hello
Fill the file with two lines:
Hello
World

Create a program to print the lines of the file.
Modify the program to print the lines of the file backwards.

Add more content to the file and see if you can make your program work.

2. Reading multiple files

Create two files on your desktop named courseCode and courseName.
Fill each file with 2 lines of data.

Try to print the contents of the files at the same time like so:
CS235 - Object Oriented Programming II
CS135 - Intro to Object Oriented Programming

Hint: If you can't read both files at the same time, maybe you can store
      each one in some kind of variable?

3. Storing a Student

Create a class named Student which contains student information.
Specifically, create three variables: name, grade, and gpa.

Create an instance of type Student and read the values from user input.

Create three files on your desktop named: names, grades, and gpas.

Store the information from this Student in those files.
(name stored in names, grade => grades, gpa => gpas)

4. Students revisited

Create a method in your Student class called getInfo(), which prints a line that looks like this:
My name is Mike. I'm in grade 15 and I have a 4.0 GPA. For now, at least...

Create three files on your desktop named: names, grades, and gpas.
Create 10 lines of information in each file.

Read the lines of each file and store their contents in their own arrays.

Create an array of type Student[] and fill it using those arrays.

To confirm your work, loop through your Student[] array and call the getInfo method on each Student.

5. There has to be a better way

Instead of storing your student information in three seperate files,
let's try storing them in one.

You can do this by separating columns of data with a designated character.
For instance, separting student data with a comma might look like this:
Mike,15,4.0

While separating student data with a space would look like this:
Mike 15 4.0

For this exercise, let's stick with commas.

Create a new file on your desktop named students.csv (csv means Comma Separated Values)
Fill it up with 10 lines of data (feel free to use the values from your old files!)

Now, read each line of the file and, with the help of String.split(), 
store the line in a String array.

Then, immediately store the data from that array in a Student object.

Finally, add that Student object to your Student[] array and continue with the loop.

To confirm your work, loop through your Student[] array and call the getInfo method on each Student.
