package org.example.decorator.coffee;

/**
 * @Author pw7563
 * @Date 2023/12/12 19:45
 * usage
 */
// 基础咖啡类
interface Coffee {
    double getCost();
}

// 基础咖啡实现
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }
}

// 牛奶装饰器
class MilkDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    public MilkDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5; // 牛奶价格为0.5
    }
}

// 糖浆装饰器
class SyrupDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    public SyrupDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2; // 糖浆价格为0.2
    }
}

// 客户端代码
class CoffeeShop {
    public static void main(String[] args) {
        // 基础咖啡
        Coffee coffee = new SimpleCoffee();

        // 加牛奶
        coffee = new MilkDecorator(coffee);

        // 再加糖浆
        coffee = new SyrupDecorator(coffee);

        // 输出最终价格
        System.out.println("Cost: $" + coffee.getCost());
    }
}

