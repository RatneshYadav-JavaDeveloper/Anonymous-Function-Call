************ LAMBDA EXPRESSION ************

A lambda expression is a concise block of code that accepts input parameters and returns a value. It's similar to a method, but it doesn't require a name and can be defined directly within a method's body.

Lambda expressions are a concise way to define a function. A simple lambda expression consists of a single parameter and an expression. The syntax for this is: 

parameter -> expression

If you need to use more than one parameter, you can enclose them in parentheses, like this:

(parameter1, parameter2) -> expression

There are some limitations to expressions. They must immediately return a value, and they cannot contain variables, assignments, or statements like if or for. To perform more complex operations, you can use a code block enclosed in curly braces. If your lambda expression needs to return a value, you should include a return statement in the code block, like this:

(parameter1, parameter2) -> { 
  // code block
  return someValue;
}

************ ANONYMOUS FUNCTION ************

An anonymous function is a function that does not have a name, return statement, or modifier.

Syntax:

In Java, you can create an anonymous function using this syntax:

(parameters) -> { body }

Parameters are the inputs and the body contains the code that runs when the function is called. For example, this code shows an anonymous function that adds two integers:

(parameters) -> { return parameter1 + parameter2; }

(a, b) -> a + b can be used as an argument or assigned to a variable: 

Function<Integer, Integer> add = (a, b) -> a + b;

We define 'add' as a function that adds two integers.

************ FUNCTIONAL INTERFACE ************

A functional interface is an interface that contains only one abstract method.

Functional interfaces don't require the abstract keyword. 
The method defined inside the interface is abstract by default. 
Lambda expressions can also be considered as instances of functional interfaces.

