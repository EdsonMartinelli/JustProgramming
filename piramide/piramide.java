public class piramide {
    public static void main(String args[]) {
        if (args.length == 2) {
            try{
                int length = Integer.parseInt(args[1]);
                switch(args[0]){
                    case "1" : buildPyramid(length); break;
                    case "2" : inversePyramid(length); break;
                    case "3" : symmetricPyramid(length); break;
                    case "4" : inverseSymmetricPyramid(length); break;
                    default : System.out.println("Argumento invalido.");
                }
            } catch (Exception e){
                System.out.println("A altura da piramide não eh um numero.");
            }
        } else {
            System.out.println("Argumentos incorretos para construir a piramide.");
        }
    }

    public static void buildPyramid(int length) {
        for(int line = 0; line < length; line++) {
            for(int asterisk = 0; asterisk < line + 1; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inversePyramid(int length) {
        for(int line = 0; line < length; line++) {
            for(int asterisk = length - line; asterisk > 0; asterisk--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void symmetricPyramid(int length) {
        for(int line = 1; line <= length; line++) {
            for(int space = 0; space < length - line; space++){
                System.out.print(" ");
            }
            for(int asterisk = 0; asterisk < (line * 2) - 1; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverseSymmetricPyramid(int length) {
        for(int line = length; line >= 1; line--) {
            for(int space = 0; space < length - line; space++){
                System.out.print(" ");
            }
            for(int asterisk = 0; asterisk < (line * 2) - 1; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}