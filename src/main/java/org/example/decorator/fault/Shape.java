package org.example.decorator.fault;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:30
 * usage
 */
public interface Shape {

    String drawing();

}

class rectangle implements Shape{

    @Override
    public String drawing() {
        return "drawing a rectangle shape";
    }
}