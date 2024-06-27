package org.example.decorator;

import org.example.decorator.fault.Shape;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:43
 * usage
 */
public class ConcreteComponent extends Component{
    @Override
    public void operation(Shape shape) {
        System.out.println(shape.drawing());
    }
}
