/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.comparator;

import java.util.*;

/**
 *
 * @author AbdElHalim
 */
class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        return a.score!=b.score ? b.score - a.score : a.name.compareTo(b.name);
    }
}

public class ComparatorManipulator {

    public static void main(String[] args) {

        String[] players = {"amy", "david", "heraldo", "aakansha", "aleksa"};
        int[] scores = {100, 100, 50, 75, 150};
        Player[] player = new Player[players.length];
        Checker checker = new Checker();

        for (int i = 0; i < player.length; i++) {
            player[i] = new Player(players[i], scores[i]);
        }

        Arrays.sort(player, checker);
        for (Player player1 : player) {
            System.out.printf("%s %s\n", player1.name, player1.score);
        }
    }
}
