package com.atguigu02.selfdefine;

/**
 * className: SubOrder4
 * Package : com.atguigu02.selfdefine
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 19:47
 * @Version 1.0
 */
public class SubOrder4<E> extends Order<Integer>{
    E e;

    public SubOrder4() {
    }

    public SubOrder4(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public SubOrder4(Integer integer, int orderId, E e) {
        super(integer, orderId);
        this.e = e;
    }
}
