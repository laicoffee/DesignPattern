package org.example.decorator;

import org.example.decorator.fault.Shape;

/**
 * @Author pw7563
 * @Date 2023/11/13 16:44
 * usage
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation(Shape shape) {
        if(component != null){
            component.operation(shape);
        }
    }
}

class ConcreteDecoratorA extends Decorator{
    private String addedState;

    @Override
    public void operation(Shape shape) {
        super.operation(shape);
        System.out.println("decoratorA 日志记录");
    }
}

class ConcreteDecoratorB extends Decorator{
    private String addedState;

    @Override
    public void operation(Shape shape) {
        super.operation(shape);
        System.out.println("decoratorB 日志记录");
    }
}