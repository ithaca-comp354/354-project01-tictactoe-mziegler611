package edu.ithaca.dragon.games.tictactoe;

import edu.ithaca.dragon.games.tictactoe.player.BrainDeadPlayer;
import edu.ithaca.dragon.games.tictactoe.player.HumanPlayer;
import edu.ithaca.dragon.games.tictactoe.player.RandomMovePlayer;
import edu.ithaca.dragon.games.tictactoe.player.RandomSmarterPlayer;
import edu.ithaca.dragon.games.tictactoe.player.RuleBasedAgent;
import edu.ithaca.dragon.games.tictactoe.player.SmartPlayer;

public class TicTacToeMain {
    public static void main (String[] args){
        //new TicTacToeGame( new HumanPlayer(), new BrainDeadPlayer()).play();
        new TicTacToeGame( new HumanPlayer(), new SmartPlayer()).play();
    }
    
}
