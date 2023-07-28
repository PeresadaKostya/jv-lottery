package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(Colors randomColor, int i) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " ball with number: " + number;
    }
}
