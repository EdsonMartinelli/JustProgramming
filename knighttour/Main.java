package knighttour;

public class Main{
    public static void main(String[] args) {
        Table table = new Table();
        Knight knight = new Knight(table, 0 , 0);
        backTracking(table, knight);
        table.printTableNumber();
    }

    public static boolean backTracking(Table table, Knight knight) {
        if (table.isFull()) {
            return true;
        }

        int[][] positions = knight.getValidPosition();
        int[] initialKnightPos = knight.getPosition();

        for (int x = 0; x < positions.length; x++) {
           if(table.isValidPosition(positions[x][0],positions[x][1])){
                knight.setNewPosition(positions[x][0], positions[x][1]);
                table.setPastPosition(positions[x][0], positions[x][1]);
                if(!backTracking(table, knight)){
                    knight.setNewPosition(initialKnightPos[0], initialKnightPos[1]);
                    table.resetPosition(positions[x][0], positions[x][1]);
                } else {
                    table.setNumberPosition(positions[x][0], positions[x][1]);
                    return true;
                }
            }
        }
        return false;
    }
}
