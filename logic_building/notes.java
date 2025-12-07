package logic_building;

public class notes {
  public static void main(String[] args) {
    System.out.println("Notes file for logic building");
  }
}

//---------> Non-primitive data types are called reference types because they refer to objects.

// The main differences between primitive and non-primitive data types are:

// Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
// Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
// Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
// Primitive types always hold a value, whereas non-primitive types can be null.



//---------> The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

// This helps you write cleaner code and avoid repeating types, especially for long or complex types.
// For example, instead of writing int x = 5;, you can write:
// var x = 5;  // x is an int
// System.out.println(x);
//var only works when you assign a value at the same time (you can't declare var x; without assigning a value)

//for more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read:

// Example
// Without var
// ArrayList<String> cars = new ArrayList<String>();
// With var
// var cars = new ArrayList<String>();