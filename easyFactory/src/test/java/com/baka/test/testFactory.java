package com.baka.test;

import com.baka.Factory.ChartFactory;
import com.baka.domain.IChart;

public class testFactory {
    public static void main(String[] args) {
        IChart chart = ChartFactory.getChart();
        chart.draw();
        chart.erase();
    }
}
