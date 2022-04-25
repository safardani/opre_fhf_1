package com.company;

import java.util.ArrayList;

public class RoundRobin {
    private int timeSlice;
    private ArrayList<Task> tasks;

    RoundRobin(){
        tasks = new ArrayList<>();
    }

    void addTask(Task t){
        tasks.add(t);
    }
}
