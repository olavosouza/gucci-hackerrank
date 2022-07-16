package com.picpay.personalcredit.aftersales.api.controller.helper.gucci;

import java.util.Scanner;

public class test {

    static final String SHOW_OPTION = "show";
    static final String RECEIVE_SHIP = "receive_ship";
    static final String UNLOAD = "unload";
    static final String TRAIN_SEND = "train_send";

    public static void main(String[] args) {

        var currentState = initialState();

        String option;
        do {
            option = receive_input();

            OperationSupplier.getOperation(option).doOperation(currentState);

        } while (!option.equals(SHOW_OPTION));

    }

    private static String receive_input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static String[][] initialState() {
        final String EMPTY_SPACE = " ";

        String draw[][] = new String[7][12];

        draw[0][0] = "-";
        draw[0][1] = "^";
        draw[0][2] = "-";
        draw[0][3] = "^";
        draw[0][4] = EMPTY_SPACE;
        draw[0][5] = EMPTY_SPACE;
        draw[0][6] = EMPTY_SPACE;
        draw[0][7] = EMPTY_SPACE;
        draw[0][8] = EMPTY_SPACE;
        draw[0][9] = EMPTY_SPACE;
        draw[0][10] = EMPTY_SPACE;
        draw[0][11] = EMPTY_SPACE;

        draw[1][0] = EMPTY_SPACE;
        draw[1][1] = "|";
        draw[1][2] = EMPTY_SPACE;
        draw[1][3] = "|";
        draw[1][4] = EMPTY_SPACE;
        draw[1][5] = EMPTY_SPACE;
        draw[1][6] = EMPTY_SPACE;
        draw[1][7] = EMPTY_SPACE;
        draw[1][8] = EMPTY_SPACE;
        draw[1][9] = EMPTY_SPACE;
        draw[1][10] = EMPTY_SPACE;
        draw[1][11] = EMPTY_SPACE;

        draw[2][0] = EMPTY_SPACE;
        draw[2][1] = "|";
        draw[2][2] = EMPTY_SPACE;
        draw[2][3] = "|";
        draw[2][4] = EMPTY_SPACE;
        draw[2][5] = EMPTY_SPACE;
        draw[2][6] = EMPTY_SPACE;
        draw[2][7] = EMPTY_SPACE;
        draw[2][8] = EMPTY_SPACE;
        draw[2][9] = EMPTY_SPACE;
        draw[2][10] = EMPTY_SPACE;
        draw[2][11] = EMPTY_SPACE;

        draw[3][0] = EMPTY_SPACE;
        draw[3][1] = "|";
        draw[3][2] = EMPTY_SPACE;
        draw[3][3] = "|";
        draw[3][4] = EMPTY_SPACE;
        draw[3][5] = EMPTY_SPACE;
        draw[3][6] = EMPTY_SPACE;
        draw[3][7] = EMPTY_SPACE;
        draw[3][8] = EMPTY_SPACE;
        draw[3][9] = EMPTY_SPACE;
        draw[3][10] = EMPTY_SPACE;
        draw[3][11] = EMPTY_SPACE;

        draw[4][0] = EMPTY_SPACE;
        draw[4][1] = "|";
        draw[4][2] = EMPTY_SPACE;
        draw[4][3] = "|";
        draw[4][4] = EMPTY_SPACE;
        draw[4][5] = EMPTY_SPACE;
        draw[4][6] = EMPTY_SPACE;
        draw[4][7] = EMPTY_SPACE;
        draw[4][8] = EMPTY_SPACE;
        draw[4][9] = EMPTY_SPACE;
        draw[4][10] = EMPTY_SPACE;
        draw[4][11] = EMPTY_SPACE;

        draw[5][0] = EMPTY_SPACE;
        draw[5][1] = "|";
        draw[5][2] = EMPTY_SPACE;
        draw[5][3] = "|";
        draw[5][4] = EMPTY_SPACE;
        draw[5][5] = EMPTY_SPACE;
        draw[5][6] = EMPTY_SPACE;
        draw[5][7] = EMPTY_SPACE;
        draw[5][8] = EMPTY_SPACE;
        draw[5][9] = "D";
        draw[5][10] = EMPTY_SPACE;
        draw[5][11] = "i";

        draw[6][0] = EMPTY_SPACE;
        draw[6][1] = "A";
        draw[6][2] = "_";
        draw[6][3] = "A";
        draw[6][4] = "-";
        draw[6][5] = "-";
        draw[6][6] = "-";
        draw[6][7] = ":";
        draw[6][8] = ":";
        draw[6][9] = "%";
        draw[6][10] = "%";
        draw[6][11] = "%";

        return draw;
    }
}
