package com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl;

import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.Operation;

public class ShowOption implements Operation {
    @Override
    public void doOperation(String[][] currentState) {
        for (int i = 0; i < currentState.length; i++) {
            for (int j = 0; j < currentState[0].length; j++) {
                System.out.print(currentState[i][j]);
            }
            System.out.println();
        }

    }
}
