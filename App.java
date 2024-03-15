public class App {
    public static void main(String[] args) {
        AlarmMediator mediator = new AlarmMediator();
        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);

        mediator.addComponent(sprinkler);
        mediator.addComponent(coffeePot);

        System.out.println("Alarm is sending event to all...");
        sprinkler.doTask();
        coffeePot.doTask();
    }
}
