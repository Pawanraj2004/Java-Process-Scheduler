# Java-Process-Scheduler
This project demonstrates three common process scheduling algorithms: First-Come, First-Served (FCFS), Shortest Job First (SJF), and Shortest Remaining Time First (SRTF). The program also includes a feature to determine the best scheduling algorithm based on average waiting time.

## 📂 Project Structure
### ProcessScheduler<br>
├── ProcessScheduler.java<br>
├── SchedulingAlgorithm.java<br>
├── FCFS.java<br>
├── SJF.java<br>
└── SRTF.java


- **ProcessScheduler.java**: The main class that handles user input and delegates scheduling tasks.
- **SchedulingAlgorithm.java**: An interface that all scheduling algorithms implement.
- **FCFS.java**: The FCFS scheduling algorithm implementation.
- **SJF.java**: The SJF scheduling algorithm implementation.
- **SRTF.java**: The SRTF scheduling algorithm implementation.

## 🚀 Getting Started

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Pawanraj2004/Java-Process-Scheduler.git
    cd Java-Process-Scheduler
    ```

2. **Compile the Java files**:
    ```bash
    javac Java-Process-Scheduler/*.java
    ```

3. **Run the program**:
    ```bash
    java Java-Process-Scheduler.ProcessScheduler
    ```

## 📋 Usage

1. **Input the number of processes**.
2. **Enter the arrival time and burst time for each process**.
3. **Choose a scheduling algorithm**:
    - `1`: FCFS
    - `2`: SJF
    - `3`: SRTF
    - `4`: Best (determines the best algorithm based on average waiting time)
4. **View the results**:
    - PID, Arrival Time, Burst Time, Waiting Time, Turnaround Time
    - Average Waiting Time and Average Turnaround Time

5. **Option to continue or exit the program**.

## 🖼️ Screenshots

Add screenshots here to demonstrate the usage and output of the program.
 **3 processes provided as input with their arrival and burst time and FCFS Scheduling method is chosen**
![Screenshot 2024-06-27 175002](https://github.com/Shreya123Sahu/Java-Process-Scheduler/assets/132187076/fdd15534-001e-46d0-8065-3d72de3387cc)
**5 processes provided as input with their arrival and burst time and SRTF Scheduling method is chosen !**

![Screenshot 2024-06-27 175119](https://github.com/Shreya123Sahu/Java-Process-Scheduler/assets/132187076/fe818015-be46-408e-9062-6cbbd0c17079)
**5 processes provided as input with their arrival and burst time and Best is chosen !**

![Screenshot 2024-06-27 175201](https://github.com/Shreya123Sahu/Java-Process-Scheduler/assets/132187076/5448e982-606c-4702-a2bc-395f7667db79)

## 🌟 Feature

Three scheduling algorithms: FCFS, SJF, SRTF
Automatic selection of the best algorithm
Detailed results including waiting time and turnaround time
User-friendly console interface

Happy Coding! ✨

