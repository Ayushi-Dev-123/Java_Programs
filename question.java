1. How to reverse a String in Java? 
2.How to swap two numbers without using a third variable?
3.Java Program to check if a vowel is present in the string?
4.Java program to check if the given number is Prime?
5.Fibonacci Series using recursion
6.Check if a List of integers contains only odd numbers?
7.Palindrome Check
8.How to remove Whitespaces from String
9.How to remove leading and trailing whitespaces from a string?
10.Sorting an array in Java?
11.How to Create a Deadlock Scenario Programatically?
12.Find factorial of an integer?
13.Revese a Linked List?
14. How to implement Binary Search?
15.Create pyramid of character.
16.Check if two arrays contains same elements?
17.Sum of all elements in integer array?
18. Find second largest number in an array?
19. How to find if a string is present in a text file?
20.How to print date in specific format?
21.How to merge two lists in java?
22.How to Sort HashMap by values?
23.remove all occurrences of a given character from input String?
24. How to get distinct characters and their count in a String?
25.Write a Program to showcase inheritance?
26.Write a Program to Show Diamond Problem with Multiple Inheritance?
27.Write a Program to show try catch example?
28.Write a code to show NullPointerException
29.Write an interface with default and static method?
30.How do we create a Functional interface?
31.Show an example of using lambda expressions in Java
32.Show examples of overloading and overriding in Java
-----------------------------------------------------------------
Array :-
1) What is array ? In which scenario of application  you would like to go for the array concept?
2) Where array create the memory in java.
3) Write a java program to find  one missing number in array (Remember ,All element are unique.).
4) Write a Program to search an element in array and also find total occurance of given element and index positions.
5) WAP  to find duplicate number on Integer array in Java?
6)How to find largest and smallest number in unsorted array?
7)Write a program to remove duplicates from array in Java? 
8)How do you separate zeros and non-zeros in a given Array in java?
	Sample Input- {0,10,43,27,0,98,75,59,191,0}
	Sample Output-[10, 43, 27, 98, 75, 59, 191, 0, 0, 0] 
9) What is maximum size limit of array in java? write down figure.
10) WAP to delete an element from specified position in array.position entered by User using command line argument.
11) WAP to remove smallest even element from array.
12) WAP to find union of two given arrays of type int.
13) WAP to find intersection of two given arrays of type int.
14) WAP to multiplication of two matrix(2*3).
15) WAP to sort 2D array row wise.
16) WAP to print left diagonal element of matrix using only one loop      otherwise your program will be consider as a wrong program.
17) What is jagged array.Explain with example.
------------------------------------------------------
Object - oriented
18) What is Object oriented? Write down difference b/w Object oriented and procedure oriented programming approach.
19)What is class and object? Explain all oop features in java with example.
20)What are the role of setter and getter method ? What is POJO In Java.
21)How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) ?
22) Create an Object having two properties and four behaviours
(add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties private.

23)What is Constructor? List down the keypoints about constructor.
24)Can we make multiple contructor inside a class? if yes then what is the need of it.Explain,
25) Private constuctor is legal or illegal ?
26) What is Singleton class explain with suitable example?
27)What is method overloading ? What are importance of method overloading ? Can we overload the main method in java ?
28) How to pass as many argument to java method?
29) Can we overload the method with var-arg type of argument.
30) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area
31) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
32) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer
33) Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
34) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method.
35) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
36) Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
37)Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
-----------------------------------------------------------------------------
Inheritance :-
1) What is Inheritance ? Is Java Support the multiple inheritance ? If no then why.
2)What is method overriding ? List down the difference between method overloading and method overriding.
3) What is the role of return type in case of method overloading and method overriding?
4) Can we Override static, private method?
5) Create class OneBHK with instance variable roomArea , hallArea and price.
Create default and parameterized constructor.
Method show(): to print OneBHK data member information.
6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
Create default and parameterized constructor.
Method show(): to print all data member information.
Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.

7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
 Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
 Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 

8) Create a class Student with two members : rollno and percentage.
	Create default and parameterized constructors. Create method show() to 	display information.
	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.
	Create a class(say XYZ) with main method that carries out the operation of the project :
has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
display all record from the array.
search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
count how many students are having A grade,if for A grade percentage >75.
9) What is abstract class?. What is interface? Differentiate abstract class and 	interface.
10) Write down difference b/w abstract class and jdk1.8 interface.
11) Create an Abstract class Processor with int member variable data and method showData to display data value.
Create abstract method process() to define processing of member data.
Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number by overriding the process method.
Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial 	or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism.

12) Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 	Create abstract method calcTax().
Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
13) Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).
Display all employee info using toString() method.
14) What is the difference b/w jdk1.7 and jdk1.8 interface. Explain jdk1.8 new changes for interface with example.

15) Explain functional interface, predicate, lambda expression, method reference and constructor reference with example.

16)  Create a program that helps banks to maintain records. It should havefollowing facilities.
Anybody can create current or saving account with following initial information:account number, name, balance, and branch.
display account detail for a particular accounts.
display total money deposited in bank.
allow deposit and withdrawal in an account .
for saving account opening balance and minimum balance must be 5000.
for current account opening balance and minimum balance must be 1000.
can not withdraw the amount from the account that makes balance less than the minimum balance.
---------------------------------------------------------------------------
String :-
1) What is String in java? What  do you mean by mutability and immutability?
2) What is diffenence b/w String , SrtingBuffer and StringBuilder?
Explain with example.
3) What is difference b/w == operator and String class equals() method?
4) How many ways to initialize String  in java? Explain role of String literal pool.
5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI”
6) Write a java program to find all possible palindrom of given String.
	Sample Input: “aaabbbacccababacccaabb”
7)WAP to remove the duplicate letters from given String.
	Sample Input: “aabbccddd”
	Output: “abcd”
8) WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:   a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times
9) WAP to find word of maximum length in given String.
	Sample Input: “Dear Student ,You have need to work hard”
`	Output: “Student”
10) WAP to count the word whose first letter is  vowel.
11) Input name of a person and count how many vowels it contains. Use String class methods.
12) Input data exactly in the following format, and print sum of all integer values.
	Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)
13)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
				  TRIANGLE - INTEGRAL)

14) WAP check if a String contains only digits?
15)What is Exception in java? Explain Exception  Hierarchy.
16) What do you mean by checked and unchecked exeption ?
17) Explain try,catch,finally, throw and throws ?
18) What is difference between final , finally and finalize()?
19) Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position from user and print day name. Handle array index out of bound 	exception and give proper message if user enter day index outside range (0-6).
20) Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should throw a checked exception if  age is less than 18. The message of exception is “invalid age for voter”.

----------------------------------------------------------------------------
File and MultiThread
1) Write a java program to read/write data into the file.(Use FileOutputStream,FileInputStream).
2) What is Serialization ? Write a java program to store the object into the file.
3) Explain transient keyword in java with example.
4)Write a program to count how many times character ‘t’ occurs in a file.
5)Write a program to count no of words in a text file and average word size.
6)Write a program to count number of bytes in a image file(jpeg/png/gif). Also find how much time it will take to upload the file on server if internet speed is 256 bps(bitsper second).
7)Write a program to store your shopping details in a binary file(shopping.dat) with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object ).
8) Write a program to read data from shopping.dat file creted in above problem and find total money spent on all shopping items. . (Use ObjectInputStream to read Item class object ).
9) What is multiThreading ? How many way to implement thread in Java application. Also explain the life cycle of thread.
10) Explain sleep(),wait(),join() method .
11) Create a Thread class to print following star(*) pattern on screen with delay of 1 second between each * print. Number of lines in the pattern should be passed 	to the constructor of Thread class.
	* * * * *
	* * * *
	* * *
	* *
	*
Use this class in main method and ask user to enter number of lines to print.
12) What is the need of Synchronization explain with example.
13) What is object level locking and class level locking explain with example?
14) Write a java program to show the deadlock conditon.
15) What is deadlock. Write a java program for deadlock condition.
16) Create a class that checks whether a given number is prime or not using Runnable interface.




