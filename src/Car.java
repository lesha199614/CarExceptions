import java.util.Random;
public class Car {
    private String model;
    private int speed;
    private int price;
    boolean isEngineTurnedOn;
    Random random = new Random();
    public Car(String model, int speed, int price, boolean isEngineTurnedOn) {
        this.model = model;
        this.speed = speed;
        this.price = price;
        this.isEngineTurnedOn = isEngineTurnedOn;
    }
    public void StartEngine() throws MyException{
        StartEnginePrivate();
    }
    private void StartEnginePrivate() throws MyException{
        int randomNumber = random.nextInt(21);
        if (isEngineTurnedOn) {
            System.out.println("Двигатель уже заведен");
        } else if (randomNumber % 2 == 0 && !isEngineTurnedOn) {
            try {
                throw new MyException("My Own Exception");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Автомобиль " + model + " завелся");
        }
    }
}
