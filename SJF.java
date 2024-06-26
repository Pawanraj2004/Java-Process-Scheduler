import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SJF implements SchedulingAlgorithm {
    public void schedule(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        PriorityQueue<Process> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.burstTime));
        int currentTime = 0;
        int completedProcesses = 0;
        while (completedProcesses < processes.size()) {
            for (Process p : processes) {
                if (p.arrivalTime <= currentTime && !pq.contains(p)) {
                    pq.add(p);
                }
            }
            if (!pq.isEmpty()) {
                Process current = pq.poll();
                current.waitingTime = currentTime - current.arrivalTime;
                currentTime += current.burstTime;
                current.turnAroundTime = current.waitingTime + current.burstTime;
                completedProcesses++;
            } else {
                currentTime++;
            }
        }
    }

    public String getAlgorithmName() {
        return "SJF";
    }
}
