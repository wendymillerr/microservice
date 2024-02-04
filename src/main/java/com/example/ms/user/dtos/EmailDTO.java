package com.example.ms.user.dtos;

import java.util.UUID;

public class EmailDTO{

    private UUID emailId;
    private String EmailTo;
    private String subject;
    private String text;

    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public String getEmailTo() {
        return EmailTo;
    }

    public void setEmailTo(String emailTo) {
        EmailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
