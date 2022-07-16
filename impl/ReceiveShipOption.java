package com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl;

import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.Operation;

    public class ReceiveShipOption implements Operation {
        @Override
        public void doOperation(String[][] currentState) {
            currentState[2][0] = "X";
            currentState[3][0] = "X";
            currentState[4][0] = "X";
            currentState[5][0] = "X";
            currentState[6][0] = "V";
        }
    }
