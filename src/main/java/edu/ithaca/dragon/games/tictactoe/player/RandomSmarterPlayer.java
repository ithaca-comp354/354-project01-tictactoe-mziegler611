package edu.ithaca.dragon.games.tictactoe.player;
import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import java.util.Random; 
import org.javatuples.Pair;


public class RandomSmarterPlayer implements TicTacToePlayer{
    //NOT WORKING YET
    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
       Random rand = new Random();
       int count  = 0;
       int lastempty = 0;
       //vertical
       for (int y=0; y<3; y++){
           count = 0;
        for(int x=0; x<3;x++){
            if (curBoard.getSquares()[x][y] == yourSymbol){
                count += 1;
            }
            else{
                lastempty = x;
            }
            if (count == 2){
                return new Pair<>(lastempty,y);
            }
        }
    }

    //horizontal
    for (int y=0; y<3; y++){
        count = 0;
     for(int x=0; x<3;x++){
         if (curBoard.getSquares()[y][x] == yourSymbol){
             count += 1;
         }
         else{
             lastempty = y;
         }
         if (count == 2){
             return new Pair<>(y,lastempty);
         }
     }
    }
        //diagonal
        count = 0;
        for(int x=0; x<3;x++){
            if (curBoard.getSquares()[x][x] == yourSymbol){
                count += 1;
            }
            else{
                lastempty = x;
            }
            if (count == 2){
                return new Pair<>(lastempty,lastempty);
            }
        }

        count = 0;
        int lastemptyy = 0;
        if (curBoard.getSquares()[0][2] == yourSymbol){
            count+=1;
        }
        else{
            lastempty = 0;
            lastemptyy = 2;
        }
        if (curBoard.getSquares()[1][1] == yourSymbol){
            count+=1;
        }
        else{
            lastempty = 1;
            lastemptyy = 1;
        }
        if (curBoard.getSquares()[2][0] == yourSymbol){
            count+=1;
        }
        else{
            lastempty = 2;
            lastemptyy = 0;
        }
        if (count == 2){
            return new Pair<>(lastempty,lastemptyy);
        }

        
       while (true){
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            if (curBoard.isSquareOpen(new Pair<>(x,y))){
                return new Pair<>(x,y);
            }
        }
    }
}



