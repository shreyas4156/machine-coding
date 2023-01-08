package com.shreyas.lld.snakesAndLadder.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    List<Snake> snakes;
    List<Ladder> ladders;
    int size;
    Map<Player, Integer> playerPieces;

    public Board(int size) {
        this.size = size;
        playerPieces = new HashMap<>();
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Player, Integer> getPlayerPieces() {
        return playerPieces;
    }

    public void setPlayerPieces(Map<Player, Integer> playerPieces) {
        this.playerPieces = playerPieces;
    }
}
