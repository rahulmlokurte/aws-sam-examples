package com.rahullokurte;

import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * Handler for requests to Lambda function.
 */

@Component
public class App implements Function<InputNumber, String> {


    @Override
    public String apply(InputNumber inputNumber) {
        int add = inputNumber.getNumber1() + inputNumber.getNumber2();
        return "The total of `" + inputNumber.getNumber1() + "` and `" + inputNumber.getNumber2() + "` is `" + add + "`";
    }
}

class InputNumber {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
