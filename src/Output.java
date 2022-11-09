import controller.OrderController;
import dataSource.BookDataSource;

public class Output {

    private final OrderController bookController;

    public Output(OrderController bookController) {
        this.bookController = bookController;
    }

    public void printTotalPrice() {
        String message = String.format("Total price of all orders: %.2f", bookController.calculateTotalPrice());
        System.out.println(message);
    }
}
