package com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl;

import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.Operation;

public class TrainSendOption implements Operation {
    @Override
    public void doOperation(String[][] currentState) {
        currentState[5][4] = " ";
        currentState[5][5] = " ";
        currentState[5][6] = " ";
    }
}
