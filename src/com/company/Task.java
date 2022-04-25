package com.company;

public class Task {
    private String id;
    private int priority, begin, burst;

    Task(String iden, int pri, int beg, int bur) throws Exception {
        id = iden;
        if (pri == 0 || pri == 1)
            priority = pri;
        else
            throw(new Exception());
        if (beg >= 0)
            begin = beg;
        else
            throw(new Exception());
        if (bur >= 1)
            burst = bur;
        else
            throw(new Exception());
    }

    public int getBegin() { return begin; }
    public int getPriority() { return priority; }
}
