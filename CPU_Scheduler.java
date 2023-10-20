import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Process {
    int id;
    int arrivalTime;
    int burstTime;
    int priority;

    Process(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

public class CPU_Scheduler {
    public static void main(String[] args) {
        ArrayList<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 0, 5, 2));
        processes.add(new Process(2, 2, 3, 1));
        processes.add(new Process(3, 4, 2, 3));
        processes.add(new Process(4, 6, 4, 4));

        System.out.println("FCFS Schedule:");
        FCFS(processes);

        System.out.println("\nSJF Schedule:");
        SJF(processes);

        System.out.println("\nPriority Schedule:");
        Priority(processes);

        System.out.println("\nRound Robin Schedule:");
        RR(processes, 2);
    }

    public static void FCFS(ArrayList<Process> processes) {
        Collections.sort(processes, (a, b) -> a.arrivalTime - b.arrivalTime);
        int time = 0;
        for (Process process : processes) {
            System.out.println("Process " + process.id + " starts at time " + time);
            time += process.burstTime;
            System.out.println("Process " + process.id + " finishes at time " + time);
        }
    }

    public static void SJF(ArrayList<Process> processes) {
        Collections.sort(processes, (a, b) -> {
            if (a.arrivalTime == b.arrivalTime) {
                return a.burstTime - b.burstTime;
            }
            return a.arrivalTime - b.arrivalTime;
        });

        int time = 0;
        for (Process process : processes) {
            System.out.println("Process " + process.id + " starts at time " + time);
            time += process.burstTime;
            System.out.println("Process " + process.id + " finishes at time " + time);
        }
    }

    public static void Priority(ArrayList<Process> processes) {
        Collections.sort(processes, (a, b) -> a.priority - b.priority);
        int time = 0;
        for (Process process : processes) {
            System.out.println("Process " + process.id + " starts at time " + time);
            time += process.burstTime;
            System.out.println("Process " + process.id + " finishes at time " + time);
        }
    }

    public static void RR(ArrayList<Process> processes, int timeQuantum) {
        Queue<Process> queue = new LinkedList<>(processes);
        int time = 0;
        while (!queue.isEmpty()) {
            Process process = queue.poll();
            if (process.burstTime <= timeQuantum) {
                System.out.println("Process " + process.id + " starts at time " + time);
                time += process.burstTime;
                System.out.println("Process " + process.id + " finishes at time " + time);
            } else {
                System.out.println("Process " + process.id + " starts at time " + time);
                time += timeQuantum;
                process.burstTime -= timeQuantum;
                System.out.println("Process " + process.id + " is preempted at time " + time);
                queue.add(process);
            }
        }
    }
}
