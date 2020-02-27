package sample;

public class Calculator {
    private static Calculator instance = null;
    private int firstNumber = 0;
    private int secondNumber = 0;

    private Calculator() {

    }

    public static Calculator getInstance() {
        if(instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber;
    }

    public int divide() {
        return firstNumber / secondNumber;
    }
}


