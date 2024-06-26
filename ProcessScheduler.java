import java.util.*;

class Process {
    int pid; // Process ID
    int arrivalTime; // Arrival Time
    int burstTime; // Burst Time
    int waitingTime; // Waiting Time
    int turnAroundTime; // Turnaround Time
    int remainingTime; // Remaining Time (for SRTF)
    
    Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

public class ProcessScheduler {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Process> processes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            inputProcesses();
            System.out.println("Choose Scheduling Algorithm: 1. FCFS 2. SJF 3. SRTF 4. Best");
            int choice = scanner.nextInt();
            SchedulingAlgorithm algorithm = null;
            switch (choice) {
                case 1: 
                    algorithm = new FCFS();
                    break;
                case 2:
                    algorithm = new SJF();
                    break;
                case 3:
                    algorithm = new SRTF();
                    break;
                case 4:
                    findBestAlgorithm();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            if (algorithm != null) {
                List<Process> processList = new ArrayList<>(processes);
                algorithm.schedule(processList);
                printResults(processList, algorithm.getAlgorithmName());
            }
            System.out.println("Do you want to continue? (yes/no)");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    private static void inputProcesses() {
        processes.clear();
        System.out.println("Enter the number of processes:");
        int numberOfProcesses = scanner.nextInt();
        for (int i = 0; i < numberOfProcesses; i++) {
            System.out.println("Enter arrival time and burst time for process " + (i + 1) + ":");
            int arrivalTime = scanner.nextInt();
            int burstTime = scanner.nextInt();
            processes.add(new Process(i + 1, arrivalTime, burstTime));
        }
    }

    private static void findBestAlgorithm() {
        SchedulingAlgorithm[] algorithms = {new FCFS(), new SJF(), new SRTF()};
        SchedulingAlgorithm bestAlgorithm = null;
        double minAvgWait = Double.MAX_VALUE;

        for (SchedulingAlgorithm algorithm : algorithms) {
            List<Process> processList = new ArrayList<>(processes);
            algorithm.schedule(processList);
            double avgWait = getAverageWaitingTime(processList);
            if (avgWait < minAvgWait) {
                minAvgWait = avgWait;
                bestAlgorithm = algorithm;
            }
        }

        if (bestAlgorithm != null) {
            List<Process> processList = new ArrayList<>(processes);
            bestAlgorithm.schedule(processList);
            System.out.println("Best Algorithm: " + bestAlgorithm.getAlgorithmName());
            printResults(processList, bestAlgorithm.getAlgorithmName());
        }
    }

    private static void printResults(List<Process> processList, String algorithm) {
        System.out.println(algorithm + " Scheduling");
        System.out.println("PID\tArrival\tBurst\tWaiting\tTurnaround");
        for (Process p : processList) {
            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.waitingTime + "\t" + p.turnAroundTime);
        }
        System.out.printf("Average Waiting Time: %.2f\n", getAverageWaitingTime(processList));
        System.out.printf("Average Turnaround Time: %.2f\n", getAverageTurnAroundTime(processList));
    }

    private static double getAverageWaitingTime(List<Process> processList) {
        int totalWaitingTime = 0;
        for (Process p : processList) {
            totalWaitingTime += p.waitingTime;
        }
        return (double) totalWaitingTime / processList.size();
    }

    private static double getAverageTurnAroundTime(List<Process> processList) {
        int totalTurnAroundTime = 0;
        for (Process p : processList) {
            totalTurnAroundTime += p.turnAroundTime;
        }
        return (double) totalTurnAroundTime / processList.size();
    }
}
