package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        RoundRobin rrLayer = new RoundRobin();
        SRTF srtfLayer = new SRTF();
        boolean stopped = false;

        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; (i < 10 && !stopped); i++) {
            String line = "";
            try {
                if (!((line = br.readLine()) != null)){
                    line.replaceAll("\\s+","");
                    String[] sections = line.split(",");

                    if (sections.length == 4){
                        try {
                            Task t = new Task(
                                    sections[0],
                                    parseInt(sections[1]),
                                    parseInt(sections[2]),
                                    parseInt(sections[3])
                            );

                            tasks.add(t);
                        } catch (Exception e) { }
                    }
                } else { stopped = true; }
            } catch (IOException e) { e.printStackTrace(); }
        }

        boolean done = false;
        for (int i = 0; !done; i++){
            for (Task t : tasks) {
                if (t.getBegin() == i){
                    if (t.getPriority() == 0){
                        srtfLayer.addTask(t);
                    } else if (t.getPriority() == 1){
                        rrLayer.addTask(t);
                    }
                }
            }
        }
    }
}
