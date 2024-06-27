package org.example.decorator.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/13 17:20
 * usage
 */
public class Father {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        if(name != null)
            System.out.println("father:"+name);
    }
}

class Child extends Father{

    @Override
    public void print() {
        super.print();
        System.out.println("child:"+name);
    }
}

class MainT1{
    public static void main(String[] args) {
        Father child = new Child();
        child.setName("CHILD");
        child.print();

    }
}