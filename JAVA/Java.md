
## What is Java?
popular programming language owned by Oracle . Used for :-
* Mobile app
* desktop app
* web app
* games .etc

## Why to use java ?
Works on multiplatform. [ platform independent ]. Most popular programming language ,large demand in current job market ,Open-source,free,secured,fast and powerful,huge community support.

## Syntax for Hello world obviously

[
public class Main{
public static void main(String[] args){
String name = "John";
System.out.println("Hello" + name);	  }
		}
]


**NOTE: Bhai syntax is very important here.**


### Some Keypoints to remember while preparing JAVA pract
* A computer program is a list of instructions to be executed by a computer.in programming these instructions are called statements.
* Statements are executed one by one ,in same order of written.
* "" are same in this for wrapping text.
*  Here println() function is used for printing and for simplicity print() is used .The difference between two is only that it does not inserts a newline at end
* println () is same like printf only difference is about that newline and the syntax in java is System.out.println("text").
* here also comments starts from // . multi line comments /* start and */ end .
* Same var like c and c++ : String,int,float,char,bool

* here instead of static the word final is used like  syntax : 
final int n1=15; therefore it is used when you dont want the variable to change its value


### Types of data types :
1. Primitive data types : bytes,short,int ,long ,float ,double ,boolean,char
2. Non-Primitive data types : string,arrays,classes

* The Var keyword was introduced in java 10 which helps in data type defination , Here the var automatically assigns the data type according to the value assigned by you .

* **Widening casting** : automatically hoti hai . No risk of losing data. When passed a smaller size type into a larger size type like int into double .
* **narrowing casting** :  manual hoti hai . isme data loss ho skta hai .therefore isko parenthesis lagake properly kiya jata hai

**Logical Operators:
&& logical and ,     || logical or    ,      !  logical not 


___

* Java string var contain character(collection) in double quotes "".
* Here string is also considered as an object therefore all the strign operations in other languages can also be similarly processed on these in java.Like : string.length() or string.toUppercase(), or string.indexof() .etc.
* Rest functions for string are concatenation ( a new concat method is there where differnece is that a.concat(b); ) ,removing white spaces.etc
* For writing special char like this:
> We are the so called "Viking"
* We have to write the code like -> string a = "We are the so called \"Viking\";  these are called the escape characters .

>Here is a library named math which allows you to perform many mathematical task on numbers.
* Some function are : math.max(x,y),math.min(x,y),math.sqrt(x),math.abs(x).etc.

* **Java Booleans** : returns only two answers like true/false or 0/1 or yes/no.

## Java conditions and if statements 

conditions and if statements let you control the flow of your program,deciding which code to run and which one to skip .

* every if statement comes with a boolean result either true or false. if braces are appplied you can allot the block of code eles by default it takes only one line for its body .
* every else statement is run when the if statements comes false. and if else statemnet is used for exception handling .
* switch statement is another alternative of if else statements.

## Loops 
There are 3 types of loops :
1. For
2. While 
3. Do while 

> Generally for loop is used and rarely while do while is once in a blue moon observed till now .

