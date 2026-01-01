package com.example.translate.common.dto;

public class TextTranslationResponse {
    private String translatedText;
    private String detectedSourceLang;
    private double confidence;
    private String engine;
    private long processingTimeMs;

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    public String getDetectedSourceLang() {
        return detectedSourceLang;
    }

    public void setDetectedSourceLang(String detectedSourceLang) {
        this.detectedSourceLang = detectedSourceLang;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public long getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(long processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }
}
