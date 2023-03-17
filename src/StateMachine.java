public class StateMachine implements Context {
    private State currentState;
    private int pedestrianFlashCtr = 0;

    public StateMachine() {
        currentState = new VehiclesGreenState(this);
    }

    public void setState(State state) {
        currentState = state;
    }

    public void timeout() {
        currentState.timeout();
    }

    public void pedestrianWaiting() {
        currentState.pedestrianWaiting();
    }

    public void incrementPedestrianFlashCtr() {
        pedestrianFlashCtr++;
    }

    public int getPedestrianFlashCtr() {
        return pedestrianFlashCtr;
    }
}