package com.company;

import java.util.ArrayList;

public class SRTF {
    private ArrayList<Task> tasks;

    SRTF(){
        tasks = new ArrayList<>();
    }

    void addTask(Task t){
        tasks.add(t);
    }
}
