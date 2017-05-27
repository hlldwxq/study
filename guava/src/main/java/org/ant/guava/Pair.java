package org.ant.guava;

/**
 * Created by zhiboliu2 on 2017/5/27.
 */
public class Pair<T> {
    private T min;
    private T max;

    public Pair(T min, T max){
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }
}
