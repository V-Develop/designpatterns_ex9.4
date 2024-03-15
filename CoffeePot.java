class CoffeePot extends Component {
    public CoffeePot(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
    }

    @Override
    public void doTask() {
        System.out.println("I am coffee pot,... doing my task");
        endAlarm("Coffee Pot");
    }
}