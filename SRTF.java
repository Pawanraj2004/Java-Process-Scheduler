import java.util.*;

public class SRTF implements SchedulingAlgorithm {
    public void schedule(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        PriorityQueue<Process> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.remainingTime));
        int currentTime = 0;
        int completedProcesses = 0;
        Process current = null;
        while (completedProcesses < processes.size()) {
            for (Process p : processes) {
                if (p.arrivalTime <= currentTime && !pq.contains(p) && p.remainingTime > 0) {
                    pq.add(p);
                }
            }
            if (current != null && current.remainingTime > 0) {
                pq.add(current);
            }
            if (!pq.isEmpty()) {
                current = pq.poll();
                current.remainingTime--;
                if (current.remainingTime == 0) {
                    current.waitingTime = currentTime - current.arrivalTime - current.burstTime + 1;
                    current.turnAroundTime = current.waitingTime + current.burstTime;
                    completedProcesses++;
                }
            }
            currentTime++;
        }
    }

    public String getAlgorithmName() {
        return "SRTF";
    }
}
