#  Queue Algorithms Practice

Welcome to my small **Queue Algorithms Practice** project!  
In this project, I explore the power and flexibility of **queues** in solving various algorithmic problems. Queues are one of the core data structures in computer science, with broad applications from system design to competitive programming.

Here’s a breakdown of how **basic**, **intermediate**, and **advanced** types of **queue-related concepts and techniques** are used in this project.

---

##  Introduction: What is a Queue?

A **Queue** is a fundamental data structure that operates on the **FIFO** principle:

> **First In, First Out**  
The element that is inserted **first** will be the one that is **removed first** — just like people lining up in a queueOperation at a bakery.

---

##  Why Learn Queue?

Queues are **crucial** to understanding ordered processing and are used in:

- Managing tasks and events in real-time systems
- Scheduling jobs in operating systems
- Processing data streams
- Traversing graphs using **BFS**
- Simulating real-world systems like ticketing and customer service

> **Mastering queues = mastering flow control and task processing!**

---

##  Where Are Queues Used? (Real-World Examples)

| **Real-World Scenario**                | **How Queue Helps**                                                                 |
|----------------------------------------|-------------------------------------------------------------------------------------|
| **Printer Queue**                      | Documents are printed in the order they are submitted                              |
| **Customer Support System**            | Requests are handled in order of arrival                                           |
| **Task Scheduling (OS)**               | Jobs are executed based on the order they were added                              |
| **Graph Traversal (BFS)**              | Nodes are visited level-by-level using a queueOperation                                    |
| **Messaging Systems (Kafka, RabbitMQ)**| Messages are queued and processed in order                                        |
| **Web Server Request Handling**        | Requests are queued and handled one-by-one (or by worker pools)                   |
| **Traffic Control Systems**            | Cars are processed based on arrival (e.g. at toll booths or lights)               |
| **Buffering in Video Streaming**       | Video chunks are queued and played in order                                       |

> In short:  
Whenever you need to **process items in arrival order**, **distribute tasks**, or **traverse level-wise**, you probably need a **Queue**!

---

##  Types of Queues

| **Type**               | **Description**                                                                                          | **Real-World Use Case**                                             |
|------------------------|----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
|  **Simple Queue**       | A basic FIFO queue: insert at the **rear**, remove from the **front**.                                  | Task scheduling, handling print jobs, customer support queues.       |
|  **Circular Queue**     | A queue that wraps around: once it reaches the end, it reuses freed-up space at the front.               | Fixed-size memory buffers, round-robin CPU scheduling.               |
|  **Priority Queue (Heap)** | Items are served based on **priority**, not arrival order. Implemented using a **Min-Heap or Max-Heap**. | Task execution by urgency (e.g., OS processes, pathfinding with A*). |
|  **Deque (Double-Ended)** | A queue where insertion and deletion are possible from **both ends**.                                   | Solving sliding window problems, LRU caching, palindrome checks.     |
|  **Monotonic Queue**     | A specialized deque that keeps elements in **increasing or decreasing** order.                          | Efficiently finding sliding window maximums/minimums in O(n) time.   |

---
