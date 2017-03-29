package com.askjeffreyliu.camera2barcode;

import com.google.zxing.Result;

/**
 * Created by jeffreyliu on 3/28/17.
 */

public class MultiResultEvent {
    public Result[] results;
    public int width;
    public int height;

    public MultiResultEvent(Result[] results, int width, int height) {
        this.results = results;
        this.width = width;
        this.height = height;
    }
}