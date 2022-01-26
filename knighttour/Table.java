package knighttour;

public class Table {

    private boolean[][] tableChess = new boolean[8][8];
    private int[][] tableChessNumber = new int[8][8];
    private int cont;

    public Table(){
        for(int x = 0; x < this.tableChess.length; x++){
            for(int y = 0; y < this.tableChess[x].length; y++){
                this.tableChess[x][y] = false;
            }
        } 
        this.cont = 64;      
    }

    public boolean isValidPosition (int posX, int posY){
        return !(this.tableChess[posX][posY]);
    }

    public void setPastPosition (int posX, int posY){
        this.tableChess[posX][posY] = true;
    }

    public void resetPosition (int posX, int posY){
        this.tableChess[posX][posY] = false;
    }

    public boolean isFull(){
        for(int x = 0; x < this.tableChess.length; x++){
            for(int y = 0; y < this.tableChess[x].length; y++){
                if (this.tableChess[x][y] == false) return false;
            }
        }
        return true;
    }

    public void setNumberPosition (int posX, int posY){
        this.tableChessNumber[posX][posY] = cont;
        this.cont--;
    }

    public void setStartNumberPosition (int posX, int posY){
        this.tableChessNumber[posX][posY] = 1;
    }

    public void printTableNumber(){
        for(int x = 0; x < this.tableChessNumber.length; x++){
            for(int y = 0; y < this.tableChessNumber[x].length; y++){
                if(this.tableChessNumber[x][y] < 10) System.out.print("0");
                System.out.print(this.tableChessNumber[x][y] + " ");          
            }
            System.out.println();
        }
    }
}
