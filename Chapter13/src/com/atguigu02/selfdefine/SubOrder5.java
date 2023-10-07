package com.atguigu02.selfdefine;

/**
 * className: SubOrder5
 * Package : com.atguigu02.selfdefine
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 19:51
 * @Version 1.0
 */
public class SubOrder5<E,T> extends Order<T> {
    E e;

    public SubOrder5(E e) {
        this.e = e;
    }

    public SubOrder5(T t, int orderId, E e) {
        super(t, orderId);
        this.e = e;
    }

    public SubOrder5() {
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
