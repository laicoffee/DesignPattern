package org.example.stratege.pattern;

/**
 * @Author pw7563
 * @Date 2023/11/12 13:58
 * usage
 */
public class Context {

    private BaseStratege stratege;

    public Context(BaseStratege stratege) {
        this.stratege = stratege;
    }

    public int compute(int x,int y){
        return stratege.compute(x,y);
    }

    public BaseStratege getStratege() {
        return stratege;
    }

    public void setStratege(BaseStratege stratege) {
        this.stratege = stratege;
    }
}
