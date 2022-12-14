package src.functional.romannumerals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        List<String> numberList = new ArrayList<>(Arrays.asList(number.split("")));
        List<String> romanNumberList =  numberList
                                        .stream()
                                        .reduce( 
                                            new ArrayList<String>(), 
                                            (result, element) -> {
                                                int intElement = Integer.parseInt(element);
                                                String stringElement = getCelDecimal(intElement, numberList.size() - 1 - result.size());
                                                result.add(stringElement);
                                                return result;

                                            },
                                            (ident, u) -> {
                                                ident.addAll(u);
                                                return ident;
                                            }        
                                        );
        String romanNumber = romanNumberList.stream().collect(Collectors.joining());
        System.out.println("Result: " + romanNumber);     
    }
    
    public static String getCelDecimal(int number, int pos) {
        String[] alphabet = {"I", "V", "X", "L", "C", "D", "M"};
        int posAlph = pos * 2;
        Function<Integer, String> verifyLenght = (x) -> (x <= alphabet.length - 1) ? alphabet[x] : " ";
        String unitValue = verifyLenght.apply(posAlph);
        String halfValue = verifyLenght.apply(posAlph + 1);
        String fullValue = verifyLenght.apply(posAlph + 2);

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
