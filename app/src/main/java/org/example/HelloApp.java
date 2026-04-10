package org.example;

class HelloApp{
    public static void main(String [] args){
        String names = "";

        if (args.length == 0) {
            names = "World";
        } else {
            for (String name : args) {
                names += name + ", ";
            }

            // remove last ", "
            names = names.substring(0, names.length() - 2);
        }

        System.out.println("Hello, " + names + "!");

    }
}
