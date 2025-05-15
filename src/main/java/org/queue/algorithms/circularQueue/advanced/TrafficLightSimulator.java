package org.queue.algorithms.circularQueue.advanced;

class TrafficLightSimulator {
    private String[] signals = {"Red", "Green", "Yellow"};
    private int current = 0;

    public void nextSignal() {
        current = (current + 1) % signals.length;
        System.out.println("Current Signal: " + signals[current]);
    }

    public void simulate(int times) {
        for (int i = 0; i < times; i++) {
            nextSignal();
            try {
                Thread.sleep(1000); // Simulate time delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator();
        simulator.simulate(6); // Cycles through Red → Green → Yellow repeatedly
    }

}

