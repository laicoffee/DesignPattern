package org.example.拦截器模式.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pengwu
 * @Date 2026/3/2 14:58
 * usage
 */
public class InterceptorChain {

    private List<Interceptor> interceptors = new ArrayList<Interceptor>();

    private Runnable target;

    private int index = 0;

    public InterceptorChain(Runnable target) {
        this.target = target;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void proceed(String request){
        if(index < interceptors.size()){
            Interceptor interceptor = interceptors.get(index++);
            interceptor.before(request);
            proceed(request);
            interceptor.after(request);
        }else{
            target.run();
        }
    }

}
