package com.atguigu02.selfdefine.apply;

import java.util.ArrayList;

/**
 * className: DAO
 * Package : com.atguigu02.selfdefine.apply
 * Description:
 * database acess object. 内部封装了操作数据库相关表的增删改查操作
 *
 * @Author gzzz
 * @Create 2023/10/6 20:51
 * @Version 1.0
 */
public class DAO<T> {
    //增
    public void insert(T bean) {

    }

    //删
    public T deleteById(int id) {
        return null;
    }

    //改
    public void update(int id,T bean) {

    }

    //查
    public T queryForInstance(int id) {
            return null;
    }

    public ArrayList<T> queryForIList(int id) {
        //查询比指定id大的所有记录
        return null;
    }

    //定义泛型方法
    //比如：查询表中的记录数(E:long类型)
    //比如：查询表中最大的id(E：Date类型)
    public <E> E getValue(String sql) {
        return null;
    }
}
