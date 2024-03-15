import java.util.ArrayList;
import java.util.List;

class AlarmMediator implements Mediator {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void notify(Component sender, String message) {
        for (Component component : components) {
            if (component != sender) {
                component.receive(message);
            }
        }
    }
}