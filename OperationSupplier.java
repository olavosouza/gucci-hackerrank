package com.picpay.personalcredit.aftersales.api.controller.helper.gucci;

import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl.ReceiveShipOption;
import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl.ShowOption;
import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl.TrainSendOption;
import com.picpay.personalcredit.aftersales.api.controller.helper.gucci.impl.UnloadOption;

import static com.picpay.personalcredit.aftersales.api.controller.helper.gucci.test.RECEIVE_SHIP;
import static com.picpay.personalcredit.aftersales.api.controller.helper.gucci.test.SHOW_OPTION;
import static com.picpay.personalcredit.aftersales.api.controller.helper.gucci.test.TRAIN_SEND;
import static com.picpay.personalcredit.aftersales.api.controller.helper.gucci.test.UNLOAD;

public class OperationSupplier {

    public static Operation getOperation(String operation) {
        switch (operation) {
            case SHOW_OPTION:
                return new ShowOption();
            case RECEIVE_SHIP:
                return new ReceiveShipOption();
            case UNLOAD:
                return new UnloadOption();
            case TRAIN_SEND:
                return new TrainSendOption();
            default:
                return null;
        }
    }

}
