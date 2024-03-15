abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);

    public abstract void doTask();

    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }
}