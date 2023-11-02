package com.example.demo;

import javafx.scene.control.TextField;

public class Event {
    private String eventName;
    private String eventType;
    private String time;
    private String loca;



    public String toString() {
        return eventName + "," + eventType + "," + time + "," + loca ;
    }

    public Event() {
    }

    public Event(String eventName, String eventType, String time, String loca) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.time = time;
        this.loca = loca;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }
}
