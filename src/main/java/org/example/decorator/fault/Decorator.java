package org.example.decorator.fault;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:33
 * usage
 */
public interface Decorator {
    void docoretor(Shape shape);
}

class DecoratorA implements  Decorator{

    @Override
    public void docoretor(Shape shape) {
        System.out.println("日志记录A");
        System.out.println(shape.drawing());
        System.out.println("日志记录A结束");
    }
}

class DecoratorB implements Decorator{

    @Override
    public void docoretor(Shape shape) {
        System.out.println("日志记录B");
        System.out.println(shape.drawing());
        System.out.println("日志记录B结束");
    }
}
