package com.askjeffreyliu.camera2barcode;

import com.google.zxing.Result;

/**
 * Created by jeffreyliu on 3/28/17.
 */

public class MessageEvent {
    public Result[] results;

    public MessageEvent(Result[] results) {
        this.results = results;
    }
}