package erastotenessiege;

public class Main{
    public static void main(String[] args) {
        int[] table = new int[100];
        
        populateTable(table);
        sieveOfEratosthenes(table);
        System.out.println("Tabela final: ");
        printTable(table);
        System.out.println();
        System.out.println("Numeros primos de 1 a 100: ");
        printPrimeNumbers(table);
    }

    public static void populateTable(int[] table) {
        for(int x = 0; x < table.length; x++){
            table[x] = x + 1;
        }
        table[0] = 0;
    }

    public static void printTable(int[] table) {
        for(int x = 0; x < table.length; x++){
            if( table[x] < 10 ){
                System.out.print("0" + table[x] + " ");
            } else {
                System.out.print(table[x] + " ");
            }
            if( (x + 1) % 10 == 0 && x != 0){
                System.out.println();
            }
        }
    }

    public static void printPrimeNumbers(int[] table) {
        for(int x = 0; x < table.length; x++){
            if(table[x] != 0 ){
                System.out.print(table[x] + " ");
            }
        }
        System.out.println();
    }

    public static void sieveOfEratosthenes(int[] table){
        for(int x = 0; x < table.length; x++){
            if(table[x] != 0){
                for(int y = table[x]; y < table.length; y++){
            
                    if ( (y + 1) % table[x] == 0){
                        table[y] = 0;
                    } else {
                        if(table[y] != 0){
                            table[y] = y + 1;
                        }
                    }
                    
                }
            }
        }
    }

}