import java.util.Comparator;
import java.util.List;

public class FCFS implements SchedulingAlgorithm {
    public void schedule(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;
        for (Process p : processes) {
            if (currentTime < p.arrivalTime) {
                currentTime = p.arrivalTime;
            }
            p.waitingTime = currentTime - p.arrivalTime;
            currentTime += p.burstTime;
            p.turnAroundTime = p.waitingTime + p.burstTime;
        }
    }

    public String getAlgorithmName() {
        return "FCFS";
    }
}
