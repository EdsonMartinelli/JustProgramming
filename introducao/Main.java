package introducao;

public class Main {
    
    public static void main(String[] args) {

        int x = 7;
        long testeLong = 5;
        String y = "tes";
        String y1 = "tes";
        char w = '1';
        boolean testeCondicional = true;
        float teste = (float) 232.2323; 
        double testeDouble = 1.6652118;
        byte byteTeste = (byte) x; // 00000101 

        int idades[] = {23, 32, 54};

        String nomes[] = {"Rafaws", "Leonir", "Erastotenes"};

        int idadeRafaws = idades[0];
        String nomeRafaws = nomes[0];

        if( (x >= 76 || x <= 25) && x == 7 ){
            System.out.println("foi");
        } else if (x == 5){
            System.out.println("foi de segunda");
        } else {
            System.out.println("não foi");
        }

        if (testeCondicional == true) {
            System.out.println("teste");
        }

        if (true) {
            System.out.println("entra de qualquer");
        }

        switch(y){
            case "teste": System.out.println("blz, valor 1"); break;
            case "test": System.out.println("blz, valor 2"); break;
            case "tes": System.out.println("blz, valor 3"); break;
            case "te": System.out.println("blz, valor 4"); break;
            case "t": System.out.println("blz, valor 5"); break;
            default: System.out.println("não foi nenhum desses");
        }

    }

}