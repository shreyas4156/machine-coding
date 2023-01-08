package com.shreyas.lld.snakesAndLadder.driver;

import com.shreyas.lld.snakesAndLadder.models.Ladder;
import com.shreyas.lld.snakesAndLadder.models.Player;
import com.shreyas.lld.snakesAndLadder.models.Snake;
import com.shreyas.lld.snakesAndLadder.services.SnakesAndLadderService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SnakeAndLadderGame {
    ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boardSize = sc.nextInt();
        int snakeSize = sc.nextInt();
        List<Snake> snakes = new LinkedList<>();
        for(int i=0;i<snakeSize;i++)
            snakes.add(new Snake(sc.nextInt(), sc.nextInt()));
        List<Ladder> ladders = new LinkedList<>();
        int ladderSize = sc.nextInt();

        for(int i=0;i<ladderSize;i++)
            ladders.add(new Ladder(sc.nextInt(), sc.nextInt()));
        int players = sc.nextInt();
        List<Player> players1 = new LinkedList<>();
        for(int i=0;i<players;i++) {
            players1.add(new Player(sc.next()));
        }
        SnakesAndLadderService service = new SnakesAndLadderService(boardSize);
        service.setLadders(ladders);
        service.setSnakes(snakes);
        service.setPlayers(players1);
        service.startGame();
    }
}
