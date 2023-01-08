package com.shreyas.lld.snakesAndLadder.services;

import com.shreyas.lld.snakesAndLadder.models.Board;
import com.shreyas.lld.snakesAndLadder.models.Ladder;
import com.shreyas.lld.snakesAndLadder.models.Player;
import com.shreyas.lld.snakesAndLadder.models.Snake;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class SnakesAndLadderService {
    Board board;
    Queue<Player> players;
    int initialPlayerCount;
    boolean isGameComplete;

    public SnakesAndLadderService(int boardSize) {
        board = new Board(boardSize);
        players = new LinkedList<>();
        isGameComplete = false;
    }
    public void setSnakes(List<Snake> snakes) {
        board.setSnakes(snakes);
    }
    public void setLadders(List<Ladder> ladders) {
        board.setLadders(ladders);
    }
    public void setPlayers(List<Player> players) {
        for(Player player:players) {
            this.players.offer(player);
            this.board.getPlayerPieces().put(player, 0);
        }
    }
    public int movePerson(int countOnDice, Player player) {
        int oldPosition = board.getPlayerPieces().get(player);
        int newPosition = oldPosition+countOnDice;
        if(newPosition>board.getSize())
            return oldPosition;
        newPosition = positionAfterSnakeAndLadder(newPosition);
        return newPosition;
    }
    public int positionAfterSnakeAndLadder(int newPosition) {
        int oldPosition;

        do {
            oldPosition = newPosition;
            for(Snake snake: board.getSnakes()) {
                if(newPosition==snake.getStart())
                    newPosition = snake.getEnd();
            }
            for(Ladder ladder: board.getLadders())
                if(newPosition==ladder.getStart())
                    newPosition = ladder.getEnd();
        } while(newPosition!=oldPosition);
        System.out.println("here");
        return newPosition;
    }
    public int rollTheDice() {
        return new Random().nextInt(6)+1;
    }
    public boolean isGameOver(int pos) {
        if(pos==board.getSize())
        {
            isGameComplete = true;
            return true;
        }
        return false;
    }
     public void startGame() {
        while(!isGameComplete) {
            Player curPlayer = players.poll();
            int countOnDice = rollTheDice();
            int oldPosition = board.getPlayerPieces().get(curPlayer);
            int newPosition = movePerson(countOnDice, curPlayer);
            System.out.println("Player "+curPlayer.getName()+" moved from "+ oldPosition+" to "+newPosition);
            if(isGameOver(newPosition)) {
                System.out.println("Player " + curPlayer.getName() + " has won the game");
            }
            else {
                board.getPlayerPieces().put(curPlayer, newPosition);
                players.offer(curPlayer);
            }
        }
    }
}
