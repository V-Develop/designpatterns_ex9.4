class Sprinkler extends Component {
    public Sprinkler(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
    }

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        endAlarm("Sprinkler");
    }
}