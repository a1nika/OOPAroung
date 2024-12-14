package com.oop.mid.aarongfinal;

public class HrHeadArrangeTraining {
    String topic;
    String date;
    String time;


    public HrHeadArrangeTraining(String topic, String time, String date) {
        this.topic = topic;
        this.time = time;
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
