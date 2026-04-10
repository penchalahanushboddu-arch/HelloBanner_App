package org.example;

class HelloApp{
    public static void main(String [] args){
        String name;

        // Check if command-line argument is provided
        if (args.length > 0) {
            name = args[0];   // take first argument
        } else {
            name = "World";  // default value
        }
        System.out.println("Hello, " + name + "!");

    }
}
