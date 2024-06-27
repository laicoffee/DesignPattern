package org.example.decorator;

/**
 * @Author pw7563
 * @Date 2023/12/13 16:35
 * usage
 */
public class MyTest {
    public static void main(String[] args) {
        Coffee mycoffee = new MyCoffee();
        DecoratorCoffee sugar = new takeSuger(mycoffee);
        takeCream takeCream = new takeCream(sugar);
        takeCream.getCoffee();
    }
}

interface Coffee {
    void getCoffee();
}

abstract class DecoratorCoffee implements Coffee {
    Coffee coffee;

    public DecoratorCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void getcoffee() {
        coffee.getCoffee();
    }
}

class MyCoffee implements Coffee {

    public void getCoffee() {
        System.out.println("接咖啡");
    }
}

class takeSuger extends DecoratorCoffee {


    public takeSuger(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getCoffee() {
        System.out.println("加糖");
        super.getcoffee();

    }
}

class takeCream extends DecoratorCoffee {

    public takeCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getCoffee() {
        System.out.println("加奶油");
        super.getcoffee();

    }
}
