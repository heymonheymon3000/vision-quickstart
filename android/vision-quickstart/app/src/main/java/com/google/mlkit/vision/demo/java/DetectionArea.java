package com.google.mlkit.vision.demo.java;

import android.graphics.Rect;

import com.google.mlkit.vision.demo.GraphicOverlay;

public class DetectionArea {

    private final GraphicOverlay overlay;
    private final int detectionAreaHeight;

    public DetectionArea(final GraphicOverlay overlay, final int detectionAreaHeight) {
        this.overlay = overlay;
        this.detectionAreaHeight = detectionAreaHeight;
    }

    public Rect getBoundingBox() {
        int screenHeight = overlay.getImageHeight();
        int left = 0;
        int right = overlay.getWidth();
        int top = (screenHeight/2) - (detectionAreaHeight/2);
        int bottom = (screenHeight/2) + (detectionAreaHeight/2);

        return new Rect(left, top, right, bottom);
    }
}





