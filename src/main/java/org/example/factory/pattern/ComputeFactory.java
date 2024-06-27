package org.example.factory.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/9 21:51
 * usage
 */


/**
 * 将可能需要变化的地方抽象成接口的形式，每一种变换实现一次接口，最后通过一个工厂来提供对应的实现类
 */
public class ComputeFactory {

    public BaseCompute getComputeFactory(String operation){
        BaseCompute compute;
        if (operation.equals("+")) {
            compute = new AddCompute();
        } else if (operation.equals("-")) {
            compute = new SubCompute();
        } else if (operation.equals("*")) {
            compute = new MultiCompute();
        } else if (operation.equals("/")) {
            compute = new DivCompute();
        } else {
            compute = null;
        }
        return compute;
    }

}
