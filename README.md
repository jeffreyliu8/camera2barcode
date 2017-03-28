# camera2barcode
A demo app for camera2 api on QR Code, Data Matrix, PDF-417

<p>You can download this app from Play Store:</p>
<a href="https://play.google.com/store/apps/details?id=com.askjeffreyliu.camera2barcode"><img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/apps/en-play-badge-border.png" width="300" /></a>

Requirements
--------------
* Handheld scanner capable of scanning 3 types of barcodes (QR Code, Data Matrix, PDF-417)
* On start, user must be presented with fullscreen camera preview frame
* Must have overlay (reticle) on top of preview frame indicating what type of barcode is expected to be scanned
* On app start, overlay will default to QR code. Swipe left, overlay Data Matrix. Swipe right, overlay PDF-417. See attached image for reference. Swiping between overlays – think snapchat filters.
* Only the type of barcode as indicated on overlay shall be picked up by scanner. (i.e, when in QR overlay mode, only QRs will be scanned while Data Matrix and PDF-417 barcodes will be ignored)
* Must show/draw green borders around barcodes as they are picked up by the scanner
* Must handle multiple barcodes being in the same frame
* Continuous scanning and visualization until application is closed
* Must use camera2 api
* Min SDK – API 25


![Output sample](https://github.com/jeffreyliu8/camera2barcode/blob/master/qr.jpg)
![Output sample](https://github.com/jeffreyliu8/camera2barcode/blob/master/data_matrix.jpg)
![Output sample](https://github.com/jeffreyliu8/camera2barcode/blob/master/pdf.jpg)

Developed By
-------
Jeffrey Liu - <jeffreyliu8@gmail.com>
