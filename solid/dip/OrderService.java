package solid.dip;

public class OrderService {
    IOrderRepository repository;
    INotifier notifier;

    public OrderService(IOrderRepository repository, INotifier notifier) {
        this.notifier = notifier;
        this.repository = repository;
    }

    public void serviceMethod() {
        repository.repoMethod();
        notifier.notifierMethod();
    }
}
