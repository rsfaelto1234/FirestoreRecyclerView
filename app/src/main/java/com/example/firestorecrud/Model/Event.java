package com.example.firestorecrud.Model;

public class Event {
    private  String Id;
    private  String Name;
    private  String Type;
    private  String Place;
    private  String StartTime;
    private  String EndTime;


    public Event() {
    }

    public Event(String id, String name, String type, String place, String startTime, String endTime) {
        this.Id = id;
        this.Name = name;
        this.Type = type;
        this.Place = place;
        this.StartTime = startTime;
        this.EndTime = endTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
}
