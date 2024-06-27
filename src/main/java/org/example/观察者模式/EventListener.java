package org.example.观察者模式;

/**
 * @Author pw7563
 * @Date 2023/12/18 15:20
 * usage
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}