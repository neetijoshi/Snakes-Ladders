package com.example.snakesladders1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javafx.util.Pair;
public class Board {
    ArrayList<Pair<Integer,Integer>> positionCoordinates;
    public Board(){
        positionCoordinates=new ArrayList<>();
        findPositionCoordinates();
    }
    private void findPositionCoordinates(){
        positionCoordinates.add(new Pair<>(0,0));
        for (int i = 0; i < SnakesLadders.height; i++) {
            for (int j = 0; j < SnakesLadders.width; j++) {
                //x coordinates
                int xCord=0;
                if(i%2==0){
                    xCord=j*SnakesLadders.tileSize+SnakesLadders.tileSize/2;
                }
                else{
                    xCord=SnakesLadders.tileSize*SnakesLadders.height-(j*SnakesLadders.tileSize)-SnakesLadders.tileSize/2;
                }
                //y coordinates
                int yCord=SnakesLadders.tileSize*SnakesLadders.height-(i*SnakesLadders.tileSize)-SnakesLadders.tileSize/2;
                positionCoordinates.add(new Pair<>(xCord,yCord));
            }
        }
    }

    public static void main(String[] args) {
        Board board=new Board();
        for (int i = 0; i < board.positionCoordinates.size(); i++) {
            System.out.println(i+" $ x :"+board.positionCoordinates.get(i).getKey()+
                    "  y:"+board.positionCoordinates.get(i).getValue()
                    );

        }
    }
}
