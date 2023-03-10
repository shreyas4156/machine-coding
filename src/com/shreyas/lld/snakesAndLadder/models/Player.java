package com.shreyas.lld.snakesAndLadder.models;

import java.util.Objects;
import java.util.UUID;

public class Player {
    private String name;
    private String id;

    public Player(String name) {
        this.name = name;
        this.id = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
