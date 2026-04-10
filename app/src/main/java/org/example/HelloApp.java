package org.example;

class HelloApp{
    public static void main(String [] args){
        String names = "";

        if (args.length == 0) {
            names = "World";
        } else {
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names += ", ";
                }
                names += name;
                first = false;
            }
        }

        System.out.println("Hello, " + names + "!");

    }
}
