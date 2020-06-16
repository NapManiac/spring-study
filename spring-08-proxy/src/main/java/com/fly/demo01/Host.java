package com.fly.demo01;
//真实角色: 房东，房东要出租房子
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东出租房租！");
    }
}
