package com.askjeffreyliu.camera2barcode;

import com.google.zxing.Result;

/**
 * Created by jeffreyliu on 3/28/17.
 */

public class MultiResultEvent {
    public Result[] results;

    public MultiResultEvent(Result[] results) {
        this.results = results;
    }
}