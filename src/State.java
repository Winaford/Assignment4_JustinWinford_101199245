public abstract class State {
    protected StateMachine stateMachine;

    public State(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public abstract void timeout();
    public abstract void pedestrianWaiting();
}