package com.predic8.scooter.model;

import java.time.LocalDateTime;

public class RueckgabeDTO {

    String fahrtId;
    String scooterId;
    String userId;
    LocalDateTime rueckgabe;

    public RueckgabeDTO() {
    }

    public String getScooterId() {
        return scooterId;
    }

    public void setScooterId(String scooterId) {
        this.scooterId = scooterId;
    }

    public LocalDateTime getRueckgabe() {
        return rueckgabe;
    }

    public void setRueckgabe(LocalDateTime rueckgabe) {
        this.rueckgabe = rueckgabe;
    }

    public String getFahrtId() {
        return fahrtId;
    }

    public void setFahrtId(String fahrtId) {
        this.fahrtId = fahrtId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
