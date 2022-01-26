package romannumerals;

public class Main {

    public static void main(String args[]) {
        try{
            if (Integer.parseInt(args[0]) <= 3999 || Integer.parseInt(args[0]) == 0) {
                getDecimal(args[0]);
            } else {
                System.out.println("Numero nao suportado ou nao existente.");
            }
        } catch (Exception e){
            System.out.println("Argumento invalido.");
        }
    }

    public static void getDecimal(String number) {
        String[] alphabet = {"I", "V", "X", "L", "C", "D", "M", "", ""};
        String celNumbers[] = number.split("(0-9)*");
        String result = "";
        int pos = 0;
        for(int x = celNumbers.length; x > 0 ; x--){
           int celNumber = Integer.parseInt(celNumbers[x - 1]);
           String celString = getCelDecimal(celNumber, alphabet[pos], alphabet[pos+1], alphabet[pos+2]);
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
