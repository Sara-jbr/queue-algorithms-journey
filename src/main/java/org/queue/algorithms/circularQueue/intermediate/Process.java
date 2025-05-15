package org.queue.algorithms.circularQueue.intermediate;

import java.util.LinkedList;
import java.util.Queue;

class Process {
    String name;
    int remainingTime;

    public Process(String name, int time) {
        this.name = name;
        this.remainingTime = time;
    }
}

class RoundRobinScheduler {
    private Queue<Process> queue = new LinkedList<>();
    private int timeSlice;

    public RoundRobinScheduler(int timeSlice) {
        this.timeSlice = timeSlice;
    }

    public void addProcess(Process p) {
        queue.add(p);
    }

    public void execute() {
        while (!queue.isEmpty()) {
            Process current = queue.poll();
            int runTime = Math.min(timeSlice, current.remainingTime);
            System.out.println("Running " + current.name + " for " + runTime + " units");
            current.remainingTime -= runTime;

            if (current.remainingTime > 0) {
                queue.add(current);
            } else {
                System.out.println(current.name + " finished.");
            }
        }
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);

        scheduler.addProcess(new Process("P1", 10));
        scheduler.addProcess(new Process("P2", 6));
        scheduler.addProcess(new Process("P3", 8));

        scheduler.execute();
    }

}

