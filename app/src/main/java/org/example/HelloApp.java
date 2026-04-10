package org.example;

class HelloApp{
    public static void main(String [] args){
        String names;

        if (args.length > 0) {
            names = String.join(", ", args);  // join all names with comma
        } else {
            names = "World";  // default
        }

        System.out.println("Hello, " + names + "!");

    }
}
