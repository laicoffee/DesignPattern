package org.example.观察者模式;

import javax.security.auth.callback.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

/**
 * @Author pw7563
 * @Date 2023/12/19 15:39
 * usage
 * In spite of the way
 * You were mocking me
 * Acting like I was
 * Part of your property
 * Remembering all the
 * Times you fought with me
 * I'm surprised it got so （far）
 * Things aren't the way
 * They were before
 * You wouldn't even
 * Recognise me anymore
 */
public class MyTestDemo implements Callback{
    public static void main(String[] args) {
        Publisher publisher = new ConcretePublisher();
        Subcriber subcriber1 = new ConcreteSubcriber();
        Subcriber subcriber2 = new ConcreteSubcriber();
        publisher.add(subcriber1);
        publisher.add(subcriber2);
        publisher.notifyAllSubscriber();
    }
}
interface Publisher{
    public List<Subcriber> get();

    public void add(Subcriber subcriber);

    public void notifyAllSubscriber();
}
class ConcretePublisher implements Publisher{

    List<Subcriber> lists = new ArrayList<>();
    @Override
    public List<Subcriber> get() {
        return this.lists;
    }


    @Override
    public void add(Subcriber subcriber) {
        lists.add(subcriber);
    }

    @Override
    public void notifyAllSubscriber() {
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i).update();
        }
    }
}

interface Subcriber{
    public void update();
}

class ConcreteSubcriber implements Subcriber{

    @Override
    public void update() {
        System.out.println("事件通知");
    }
}
