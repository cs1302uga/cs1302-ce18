
# cs1302-ce18 Generic Method Implementation

> ```java
> String notSecret = "VG8gSGVjayB3aXRoIFRlY2gh";
> String decoded = new String(java.util.Base64.getDecoder().decode(notSecret));
> System.out.println(decoded);
> ```
> **-- Age Old Saying**

This class exercise explores functional interfaces, lambda expressions, and method
references in conjunction with generic methods and interfaces. In this exercise, 
only the generic method signatures will be provided. Implementation details are left 
to the student.

## References and Prerequisites

* [Oracle: Generic Methods](https://docs.oracle.com/javase/tutorial/extra/generics/methods.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce18`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce18.git
   ```

1. Change into the `cs1302-ce18` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

### Exercise Steps

   
1. Take a close look at the `printlnMappedMatches` method and its associated Javadoc in `MoreLambdaFun.java`. 
   The exact signature for this method is:
   ```java
   private static <T> void printlnMappedMatches(T[] t, Predicate<T> p, Function<T, String> f)
   ```
   Answer the following questions about this method in your notes:
   * What is the generic type parameter?
   * Specifically, what reference types can replace `T`?
   * In order to call this method, we need a reference to an object of a class that implements `Function<T, String>`
     and a reference to an object of a class that implements `Predicate<T>`. Similar to `Predicate<T>`,
     `Function<T, R>` is a functional interface. Write the full method signature of the single, abstract method
     of `Function<T, R>` in your notes. Pay careful attention to the return type and the type of the formal parameter.
     **Note**: The method *can* (but doesn't have to) return a datatype that is different from the datatype of the 
     parameter.
     
1. Implement the `printlnMappedMatches` method in `LambdaFun.java`. You do not need to use a lambda for this step.
   You will only need to use the `Function<T, R>` and `Predicate<T>` references to call the appropriate methods.
   
1. At the end of the `main` method of `LambdaFun` class:
   * Declare a variable of type `Predicate<Email>` and assign to it, using a lambda expression, a referene to
     an object that tests if the sender of the email does not have a `"gatech.edu"` email address 
     (we'll "pretend" that they go to the spam filter). Remember, you can always refer to the API documentation
     for the associated interface when trying to determine the layout of your lambda.
   * Declare a variable of type `Function<Email, String>` and assign to it, using a lambda expression, a reference
     to an object that takes an `Email` object as a parameter and return the contents of the email as some
     nicely formatted `String`. Remember, you can always refer to the API documentation
     for the associated interface when trying to determine the layout of your lambda.
   
1. Call the `printlnMappedMatches` using your newly created variables to filter out emails in the array referred
   to by `inbox` from our rival school. Make sure to provide sufficient output so that it will be easy to 
   convince your TA or instructor that everything is working properly.
   
1. Stage and commit all changes.
   
1. Create two additional `Function<Email, String>` objects to further test your `printlnMappedMatches` method on the same
   array with the same predicate. In other words, you can provide different ways to print out the emails. 
   Make sure to provide sufficient output so that it will be easy to convince your TA or instructor that 
   everything is working properly.
   
1. Stage and commit all changes.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
