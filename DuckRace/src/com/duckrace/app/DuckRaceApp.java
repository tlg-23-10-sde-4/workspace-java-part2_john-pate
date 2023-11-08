package com.duckrace.app;
import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;

/*
 * Application "controller"
 * It directs the overall flow/sequence of the application,
 * and does all user prompting
 */
public class DuckRaceApp {
    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard() {

    }

    private Reward promptForReward() {
        Reward reward = null;

        return reward;
    }

    private int promptForId() {
        int id = 0;

        return id;
    }

    private void showBoard() {
    }

    private void welcome() {
        System.out.println("- - - - - - -  - -  - - -  - - - -  - - - -  - - - - - - - - - - -");
        System.out.println("W E L C O M E  T O  T H E  D U C K  R A C E  A P P L I C A T I O N");
        System.out.println("- - - - - - -  - -  - - -  - - - -  - - - -  - - - - - - - - - - -");
    }
}