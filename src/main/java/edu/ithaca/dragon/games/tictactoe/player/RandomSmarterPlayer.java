package edu.ithaca.dragon.games.tictactoe.player;
import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import java.util.Random; 
import org.javatuples.Pair;


public class RandomSmarterPlayer implements TicTacToePlayer{
    //Works Now
    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
       Random rand = new Random();
       //vertical
       for(int x=0; x<3; x++){
            if (curBoard.getSquares()[x][0] == yourSymbol && curBoard.getSquares()[x][1] == yourSymbol && curBoard.isSquareOpen(new Pair<>(x,2)) ){
                return new Pair<>(x,2);
        
            }
            if (curBoard.getSquares()[x][0] == yourSymbol  && curBoard.getSquares()[x][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(x,1)) ){
                return new Pair<>(x,1);
            }
            if ( curBoard.getSquares()[x][1] == yourSymbol && curBoard.getSquares()[x][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(x,0)) ){
                return new Pair<>(x,0);
            }
       }

       
        //horizontal
        for(int y=0; y<3; y++){
            if (curBoard.getSquares()[0][y] == yourSymbol && curBoard.getSquares()[1][y] == yourSymbol && curBoard.isSquareOpen(new Pair<>(2,y)) ){
                return new Pair<>(2,y);
            }
            if (curBoard.getSquares()[0][y] == yourSymbol  && curBoard.getSquares()[2][y] == yourSymbol && curBoard.isSquareOpen(new Pair<>(1,y))){
                return new Pair<>(1,y);
            }
            if ( curBoard.getSquares()[1][y] == yourSymbol && curBoard.getSquares()[2][y] == yourSymbol && curBoard.isSquareOpen(new Pair<>(0,y))){
                return new Pair<>(0,y);
            }
        }

        //diagonal 
        if (curBoard.getSquares()[0][0] == yourSymbol && curBoard.getSquares()[1][1] == yourSymbol  && curBoard.isSquareOpen(new Pair<>(2,2))){
            return new Pair<>(2,2);
        }
        if (curBoard.getSquares()[0][0] == yourSymbol  && curBoard.getSquares()[2][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(1,1))){
            return new Pair<>(1,1);
        }
        if ( curBoard.getSquares()[1][1] == yourSymbol && curBoard.getSquares()[2][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(0,0))){
            return new Pair<>(0,0);
        }

        if (curBoard.getSquares()[2][0] == yourSymbol && curBoard.getSquares()[1][1] == yourSymbol  && curBoard.isSquareOpen(new Pair<>(0,2))){
            return new Pair<>(0,2);
        }
        if (curBoard.getSquares()[2][0] == yourSymbol  && curBoard.getSquares()[0][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(1,1))){
            return new Pair<>(1,1);
        }
        if ( curBoard.getSquares()[1][1] == yourSymbol && curBoard.getSquares()[0][2] == yourSymbol && curBoard.isSquareOpen(new Pair<>(2,0))){
            return new Pair<>(2,0);
        }
    
        //vertical opponent block
       for(int x=0; x<3; x++){
        if ((curBoard.getSquares()[x][0] != yourSymbol) && curBoard.getSquares()[x][0] != ' ' && curBoard.getSquares()[x][1] != yourSymbol && curBoard.getSquares()[x][1] != ' ' && curBoard.isSquareOpen(new Pair<>(x,2)) ){
            return new Pair<>(x,2);
        }
        if (curBoard.getSquares()[x][0] != yourSymbol  && curBoard.getSquares()[x][0] != ' ' && curBoard.getSquares()[x][2] != yourSymbol &&  curBoard.isSquareOpen(new Pair<>(x,1)) && curBoard.getSquares()[x][2] != ' '){
            return new Pair<>(x,1);
        }
        if ( curBoard.getSquares()[x][1] != yourSymbol && curBoard.getSquares()[x][1] != ' ' && curBoard.getSquares()[x][2] != yourSymbol && curBoard.isSquareOpen(new Pair<>(x,0)) && curBoard.getSquares()[x][2] != ' ' ){
            return new Pair<>(x,0);
        }
   }
   //horizontal opponent block
   for(int x=0; x<3; x++){
    if ((curBoard.getSquares()[0][x] != yourSymbol) && curBoard.getSquares()[0][x] != ' ' && curBoard.getSquares()[1][x] != yourSymbol && curBoard.getSquares()[1][x] != ' ' && curBoard.isSquareOpen(new Pair<>(2,x)) ){
        return new Pair<>(2,x);
    }
    if (curBoard.getSquares()[0][x] != yourSymbol  && curBoard.getSquares()[0][x] != ' ' && curBoard.getSquares()[2][x] != yourSymbol &&  curBoard.isSquareOpen(new Pair<>(1,x)) && curBoard.getSquares()[2][x] != ' '){
        return new Pair<>(1,x);
    }
    if ( curBoard.getSquares()[1][x] != yourSymbol && curBoard.getSquares()[1][x] != ' ' && curBoard.getSquares()[2][x] != yourSymbol && curBoard.isSquareOpen(new Pair<>(0,x)) && curBoard.getSquares()[2][x] != ' ' ){
        return new Pair<>(0,x);
    }
}

    //diagonal opponent block
    if (curBoard.getSquares()[0][0] != yourSymbol && curBoard.getSquares()[0][0] == curBoard.getSquares()[1][1] && curBoard.isSquareOpen(new Pair<>(2,2))){
        return new Pair<>(2,2);
    }
    if (curBoard.getSquares()[0][0] != yourSymbol  && curBoard.getSquares()[2][2] == curBoard.getSquares()[0][0]  && curBoard.isSquareOpen(new Pair<>(1,1))){
        return new Pair<>(1,1);
    }
    if ( curBoard.getSquares()[1][1] != yourSymbol && curBoard.getSquares()[2][2] ==  curBoard.getSquares()[1][1] && curBoard.isSquareOpen(new Pair<>(0,0))){
        return new Pair<>(0,0);
    }

    if (curBoard.getSquares()[2][0] != yourSymbol && curBoard.getSquares()[1][1] == curBoard.getSquares()[2][0]  && curBoard.isSquareOpen(new Pair<>(0,2))){
        return new Pair<>(0,2);
    }
    if (curBoard.getSquares()[2][0] != yourSymbol  && curBoard.getSquares()[0][2] == curBoard.getSquares()[2][0] && curBoard.isSquareOpen(new Pair<>(1,1))){
        return new Pair<>(1,1);
    }
    if ( curBoard.getSquares()[1][1] != yourSymbol && curBoard.getSquares()[0][2] == curBoard.getSquares()[1][1] && curBoard.isSquareOpen(new Pair<>(2,0))){
        return new Pair<>(2,0);
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



