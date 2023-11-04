public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        try {
            int day = view.getDay();
            int month = view.getMonth();

            int daysPassed = model.getDaysPassed(day, month);

            view.displayResult(daysPassed);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}