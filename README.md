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

![Screenshot 1](path/to/screenshot1.png)
![Screenshot 2](path/to/screenshot2.png)

## 🌟 Features
Three scheduling algorithms: FCFS, SJF, SRTF
Automatic selection of the best algorithm
Detailed results including waiting time and turnaround time
User-friendly console interface

Happy Coding! ✨

