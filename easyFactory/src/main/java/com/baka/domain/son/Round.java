package com.baka.domain.son;

import com.baka.domain.IChart;

public class Round implements IChart {
    @Override
    public void draw() {
        System.out.println("画出了圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦去了圆形");
    }
}
