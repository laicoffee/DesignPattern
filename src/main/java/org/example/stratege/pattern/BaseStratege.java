package org.example.stratege.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/12 13:56
 * usage
 */
public interface BaseStratege {
    int compute(int x,int y);
}

class Add implements BaseStratege {

    @Override
    public int compute(int x, int y) {
        return x+y;
    }
}

class Sub implements BaseStratege {

    @Override
    public int compute(int x, int y) {
        return x-y;
    }
}
