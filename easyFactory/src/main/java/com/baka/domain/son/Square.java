package com.baka.domain.son;

import com.baka.domain.IChart;

public class Square implements IChart {
    @Override
    public void draw() {
        System.out.println("画出了方形");
    }

    @Override
    public void erase() {
        System.out.println("擦去了方形");
    }
}
