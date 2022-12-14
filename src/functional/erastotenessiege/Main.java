package src.functional.erastotenessiege;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        final int MAX_NUMBER = 100;
        System.out.println("Final Table: ");
        List<Integer> sieve= sieveOfEratosthenes(createTable(MAX_NUMBER));
        printTable(sieve);
        System.out.println("Prime numbers between 1 and 100: ");
        printPrimeNumbers(sieve);
    }

    public static List<Integer> createTable(int MAX_NUMBER) {
        List<Integer> table = new ArrayList<>();
        for(int x = 0; x < MAX_NUMBER; x++){
            table.add(x + 1);
        }
        return table;
    }

    public static void printTable(List<Integer> table) {
        for(int x = 0; x < table.size(); x++){
            System.out.print((table.get(x) < 10 ? "0" : "") + table.get(x) + " " );
            if( (x + 1) % 10 == 0 ){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printPrimeNumbers(List<Integer> table) {
       table
       .stream()
       .filter(number -> number != 0)
       .collect(Collectors.toList())
       .forEach((number) -> System.out.print(number + " "));
    }

    public static List<Integer> sieveOfEratosthenes(List<Integer> table){

        Function<Integer, Integer> verifyFactors= (number) -> {
            List<Integer> factors = table
                                    .stream()
                                    .filter(item -> number % item == 0)
                                    .collect(Collectors.toList()); 
            return factors.size() == 2 ? number : 0;
        };
        List<Integer> resultTable = table
                                    .stream()
                                    .map(verifyFactors)
                                    .collect(Collectors.toList());
        return resultTable;
    }

}