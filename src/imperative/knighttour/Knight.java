package src.imperative.knighttour;

import java.util.ArrayList;
import java.util.List;

public class Knight {

    private Table table;
    private int posX;
    private int posY;

    public Knight(Table table, int posX, int posY){
        this.table = table;
        this.posX = posX;
        this.posY = posY;
        this.table.setPastPosition(this.posX, this.posY);
        this.table.setStartNumberPosition(this.posX, this.posY);
    }

    public int[][] getValidPosition(){
        List<int[]> list = new ArrayList<int[]>();  
        int[][] positions = {{this.posX - 2, this.posY - 1},
                             {this.posX - 1, this.posY - 2},
                            
                             {this.posX + 1, this.posY - 2},
                             {this.posX + 2, this.posY - 1},

                             {this.posX + 2, this.posY + 1},
                             {this.posX + 1, this.posY + 2},

                             {this.posX - 1, this.posY + 2},
                             {this.posX - 2, this.posY + 1},};

        for(int x = 0; x < positions.length; x++){
            if( positions[x][0] >= 0 &&
                positions[x][1] >= 0 &&
                positions[x][0] < 8 &&
                positions[x][1] < 8 ){
                list.add(positions[x]);
            }
        }
        int[][] validPosition = list.toArray(new int[list.size()][2]);
        return validPosition;
    }

    public void setNewPosition(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int[] getPosition(){
        int[] position = {this.posX, this.posY};
        return position;
    }
}
