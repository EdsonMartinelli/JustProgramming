package src.imperative.romannumerals;

public class Main {

    public static void main(String args[]) {
        try{
            if (Integer.parseInt(args[0]) <= 3999 && Integer.parseInt(args[0]) > 0) {
                getDecimal(args[0]);
            } else {
                System.out.println("Number is not supported!");
            }
        } catch (Exception e){
            System.out.println("Invalid args!");
        }
    }

    public static void getDecimal(String number) {
        String[] alphabet = {"I", "V", "X", "L", "C", "D", "M"};
        String result = "";
        int pos = 0;
        for(int x = number.length(); x > 0 ; x--){
           int celNumber = Integer.parseInt(String.valueOf(number.charAt(x - 1)));
           String celString = getCelDecimal(celNumber,
                                            (pos <= alphabet.length - 1) ? alphabet[pos] : " ",
                                            (pos + 1 <= alphabet.length - 1) ? alphabet[pos + 1] : "",
                                            (pos + 2 <= alphabet.length - 1) ?alphabet[pos + 2] : " ");
           result = celString + result;
           pos += 2;
        }
        System.out.println(result);     
    }
    
    public static String getCelDecimal(int number,
                                       String unitValue,
                                       String halfValue,
                                       String fullValue ) {
        String romanCel = "";
        if (number == 4) return unitValue + halfValue;
        if (number == 9) return unitValue + fullValue;

        if (number >= 5){
            romanCel = halfValue;
            number = number - 5;
        }

        for(int cont = 0; cont < number; cont++){
            romanCel += unitValue;
        }

        return romanCel;
    }
}
