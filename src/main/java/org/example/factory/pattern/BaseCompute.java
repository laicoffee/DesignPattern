package org.example.factory.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pw7563
 * @Date 2023/11/9 21:46
 * usage
 */
public abstract class BaseCompute {
    private Integer Number1;

    public Integer getNumber1() {
        return Number1;
    }

    public void setNumber1(Integer number1) {
        Number1 = number1;
    }

    public Integer getNumber2() {
        return Number2;
    }

    public void setNumber2(Integer number2) {
        Number2 = number2;
    }

    private Integer Number2;

    public abstract Double compute(Integer number1, Integer number2);


}

class AddCompute  extends BaseCompute{
    @Override
    public Double compute(Integer number1, Integer number2) {
        return (double) (number2+number1);
    }
}

class SubCompute  extends BaseCompute{
    public SubCompute() {

    }

    @Override
    public Double compute(Integer number1, Integer number2) {
        return (double) (number1-number2);
    }
}

class MultiCompute  extends BaseCompute{
    @Override
    public Double compute(Integer number1, Integer number2) {
        return (double) (number1*number2);
    }
}

class DivCompute  extends BaseCompute{
    @Override
    public Double compute(Integer number1, Integer number2) {
        return (double) (number1/number2);
    }
}