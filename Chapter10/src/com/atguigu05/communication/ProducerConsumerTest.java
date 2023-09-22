package com.atguigu05.communication;

/**
 * className: ProducerConsumerTest
 * Package : com.atguigu05.communication
 * Description:
 *生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 * @Author gzzz
 * @Create 2023/9/22 21:55
 * @Version 1.0
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Thread t1 = new Thread(p,"生产者");
        Thread t2 = new Thread(c1,"消费者1");
        Thread t3 = new Thread(c1,"消费者2");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Clerk {
    private int goods = 0;

    public synchronized void produceGoods() {//监视器是this->cleark
        if (goods == 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            goods++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + goods + "个产品");
            notifyAll();
        }
    }

    public synchronized void consumeGoods(){//监视器是this->cleark
        if (goods == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {//重新判断，防止多个消费者同时执行导致产品小于零
            System.out.println(Thread.currentThread().getName()+"消费了第"+goods+"个产品");
            goods--;
            notifyAll();
        }
    }
}

class Producer implements Runnable{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("开始生产产品.....");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.produceGoods();
        }
    }
}

class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("开始消费产品....");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.consumeGoods();
        }
    }
}