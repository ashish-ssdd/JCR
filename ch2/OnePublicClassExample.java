package ch2;

// Can have mutiple main method in a java file if only one Class is public and others are non public
//and that class should be the one named after the file.
// Can invoke main methods of classes using java ClassName
public class OnePublicClassExample {
    public static void main(String args[]) {
        System.out.println("Main Method of the Public Class.");
    }
}

class OnePublicClassExample2 {
    public static void main(String args[]) {
        System.out.println("Main Method of Non Public Class.");
    }
}
