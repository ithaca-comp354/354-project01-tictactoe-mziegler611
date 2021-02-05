package edu.ithaca.dragon.games.tictactoe.player;


import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import java.util.Random; 

public class RandomMovePlayer implements TicTacToePlayer {
    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
       Random rand = new Random();
       while (true){
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            if (curBoard.isSquareOpen(new Pair<>(x,y))){
                return new Pair<>(x,y);
            }
        }
    }
}
