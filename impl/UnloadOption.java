package com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl;

import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.Operation;

public class UnloadOption implements Operation {
    @Override
    public void doOperation(String[][] currentState) {
        moveToTrain(currentState);

        moveToContainerStorage(currentState);

        moveToTrain(currentState);
    }

    private void moveToTrain(String[][] currentState) {
        for (int i = 1; i < 6; i++) {
            if (currentState[i][2].equals("X")) {
                var checkEmptySpaceInTrain = getSpaceInTrain(currentState);
                if (verifyIfHasEmptySpace(checkEmptySpaceInTrain)) {
                    return;
                }

                currentState[5][checkEmptySpaceInTrain] = "X";
                currentState[i][2] = " ";
            }
        }
    }

    private boolean verifyIfHasEmptySpace(int emptySpaceInTrain) {
        return emptySpaceInTrain == -1;
    }

    private int getSpaceInTrain(String[][] currentState) {
        for (int i = 4; i < 7; i++) {
            if (currentState[5][i].equals(" ")) {
                return i;
            }
        }
        return -1;
    }

    private int getSpaceInStorage(String[][] currentState) {
        for (int i = 5; i > 0; i--) {
            if (currentState[i][2].equals(" ")) {
                return i;
            }
        }
        return -1;
    }

    private void moveToContainerStorage(String[][] currentState) {
        for (int i = 2; i < 6; i++) {
            if (currentState[i][0].equals("X")) {
                var checkEmptySpaceStorage = getSpaceInStorage(currentState);
                if (verifyIfHasEmptySpace(checkEmptySpaceStorage)) {
                    return;
                }

                currentState[checkEmptySpaceStorage][2] = "X";
                currentState[i][0] = " ";
            }
        }
    }

}
