package com.rahullokurte;

import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * Handler for requests to Lambda function.
 */

@Component
public class App implements Function<InputNumber, Response> {


    @Override
    public Response apply(InputNumber inputNumber) {
        int add = inputNumber.getNumber1() + inputNumber.getNumber2();
        String response = new String("The total of `" + inputNumber.getNumber1() + "` and `" + inputNumber.getNumber2() + "` is `" + add + "`");
        Response responseObject = new Response();
        responseObject.setBody(response);
        responseObject.setStatusCode(200);
        return responseObject;
    }
}

class Response {
    private int statusCode;
    private Object body;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
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
