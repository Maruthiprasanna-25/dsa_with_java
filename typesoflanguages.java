/*TYPES OF LANGUAGES
1.Procedural Language
2.Functional Language
3.Object Oriented Language

1.Procudural language : a procedural language is a type of programming language designed for giving instructions to a computer in a specific order.

procedure :
1. first we breakdown the problem into a sequence of instructions like telling the computer to add two numbers,print the output etc.
2.we can also contain functions simply we can call them if you want from anyhere of the code in this type the code is more organised and efficient.
3.It mainly requires to specify both what we want(outcome) and how to solve this(steps to solve or way to solve)

Ex : C,Fortan,Cobal etc */

#include <stdio.h>

// Function to calculate the factorial of a number using recursion
int factorial(int n) 
{
    if (n == 0 || n == 1)  //  It "||" represents the logical OR operator in many programming languages, including C, C++, Java, and others. It is used to combine two boolean expressions and returns true if either of the expressions is true, otherwise, it returns false.
        return 1;
    else
        return n * factorial(n - 1);
}

// Main function
int main() {
    int num = 5;
    int result;

    // Call the factorial function
    result = factorial(num);

    // Print the result
    printf("Factorial of %d = %d\n", num, result);

    return 0;
}


/* FUNCTIONAL LANGUAGE : A functional programming language is a type of programming language that emphasizes the use of functions to perform computations and to express the logic of a program

The data is immutable.
