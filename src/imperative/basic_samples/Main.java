package src.imperative.basic_samples;

public class Main {
    
    public static void main(String[] args) {
        /*
         * All primitive variables
         */
        int intVar = 7;
        long longVar = 5;
        String stringVar = "tes";
        String stringVar2 = "t";
        char charVar = 's';
        boolean booleanVar = true;
        float floatVar = (float) 232.2323; // need a cast because double is the standard.
        double doubleVar = 1.6652118;
        byte byteVar = (byte) intVar; // 00000101.


        /*
         * Array declaration examples
         */
        int intArray[] = {23, 32, 54};
        String stringArray[] = {"Rafaws", "Leonir", "Erastotenes"};
        boolean booleanArray[] = {true, true, false, true};
        float floatArray[] = new float[4]; // Array not initialized;
        char charArray[] = new char[5]; // Array not initialized;

        int int0 = intArray[0];
        String string2 = stringArray[1];
        boolean boolean1 = booleanArray[2];

        floatArray[3] = (float) 23.3333;
        charArray[4] = 'w';


        /*
         * Condicional
         */
        if((intVar>= 25 && intVar <= 76)){
            System.out.println("It is between 25 and 76!");
            if(intVar == 5 || intVar == 7) {
                System.out.println("It is 5 or 7!");
            } else {
                System.out.println("It is not 5 or 7!");
            }
        } else if (intVar == 255){
            System.out.println("It is not between 25 and 76 but it is 255!");
        } else {
            System.out.println("It is different of 255 and it is not between 25 and 76!");
        }

        if (booleanVar == true) {
            System.out.println("BooleanVar is true!");
        }

        if (booleanVar) {
            System.out.println("It is another way to use boolean in conditional! (And BooleanVar continues true)");
        }

        if (true) {
            System.out.println("It always runs!");
        }

        if(stringVar.equals(stringVar2)){
            System.out.println("stringVar is equal than stringVar2!");
        }else{
            System.out.println("stringVar is not equal than stringVar2!");
        }

        switch(stringVar){
            case "teste": System.out.println("It is teste!"); break;
            case "test": System.out.println("It is test!"); break;
            case "tes": System.out.println("It is tes!"); break;
            case "te": System.out.println("It is te!"); break;
            case "t": System.out.println("It is t!"); break;
            default: System.out.println("The values is not in switch and it is just a default message!");
        }


        /*
         * Loop
         */
        while(charVar == 's'){
            if(longVar == 5){
                charVar = 'e';
            }
            longVar++;
        }

        /* 
        while(false){
            // I will never run.
        } 
        */

        for(int index = 0; index < intVar; index++){
            System.out.println(index);
        }


        /*
         * Using functions
         */
        simpleFunction();
        String returnString = simpleFunctionWithReturn();
        System.out.println(returnString);
        String returnStringWithArgs = simpleFunctionWithReturnAndArgs("Another message.");
        System.out.println(returnStringWithArgs);

    }

    /*
     * Simple function
     */
    public static void simpleFunction(){
        System.out.println("Just a simple function.");
    }

    public static String simpleFunctionWithReturn(){
        return "Just returning some thing.";
    }

    public static String simpleFunctionWithReturnAndArgs(String message){
        return message;
    }
}