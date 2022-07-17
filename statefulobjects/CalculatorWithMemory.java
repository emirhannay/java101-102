package com.company.statefulobjects;

public class CalculatorWithMemory {

    //It stores the history of the last 10 operations made
    CalculateHistory[] memory = new CalculateHistory[10];

    int counter;
    int firstArgument;
    int secondArgument;
    double result;
    char operation;

    // That's the engine that does calculations.
    Calculator calculator = new Calculator();



    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int newFirstArgument) {
        firstArgument = newFirstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int newSecondArgument) {
        secondArgument = newSecondArgument;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char newOperation) {
        operation = newOperation;
    }

    public double getResult() {
        switch(operation){
            case '+':	result = calculator.add(firstArgument, secondArgument); break;
            case '-':	result = calculator.subtract(firstArgument, secondArgument); break;
            case '*':	result = calculator.multiply(firstArgument, secondArgument); break;
            case '/':	result = calculator.divide(firstArgument, secondArgument); break;
        }
        saveToMemory();
        return result;
    }
    public void saveToMemory() {
                    CalculateHistory history = new CalculateHistory();
                    history.firstArgument = this.firstArgument;
                    history.operation = this.operation;
                    history.result = this.result;
                    history.secondArgument = this.secondArgument;
                    memory[counter] = history;
                    if(counter == 9){
                        counter = 0;
                    }
                    else {
                        counter++;
                    }
    }

    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();

        int a = 12;
        int b = 27;

        calculator.setFirstArgument(a);
        calculator.setSecondArgument(b);
        calculator.setOperation('*');
        double result = calculator.getResult();
        double result2 = calculator.getResult();
        double result3= calculator.getResult();
        double result4 = calculator.getResult();
        double result5 = calculator.getResult();
        double result6 = calculator.getResult();
        double result7 = calculator.getResult();
        double result8 = calculator.getResult();
        double result9 = calculator.getResult();
        double result99 = calculator.getResult();


        System.out.println("Result: " + result);
        System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
        System.out.println("************");
        System.out.println(calculator.memory[0]);
        calculator.setFirstArgument(17);
        calculator.setSecondArgument(92);
        calculator.setOperation('/');
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();
        result = calculator.getResult();

        calculator.setFirstArgument(54);
        calculator.setSecondArgument(72);
        calculator.setOperation('/');
        calculator.getResult();
        calculator.getResult();
        calculator.getResult();
        calculator.getResult();
        System.out.println("Result: " + result);
        System.out.println(calculator.getFirstArgument() + " " + calculator.getOperation() + " " + calculator.getSecondArgument() + " = " + result);
    }

    public class CalculateHistory{
        int firstArgument;
        int secondArgument;
        double result;
        char operation;
    }
}
