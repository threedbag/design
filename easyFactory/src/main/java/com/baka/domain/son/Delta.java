package com.baka.domain.son;

import com.baka.domain.IChart;

public class Delta implements IChart {
    @Override
    public void draw() {
        System.out.println("画出了三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦去了三角形");
    }
}
