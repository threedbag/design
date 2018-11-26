package com.baka.Factory;

import com.baka.domain.IChart;
import com.baka.domain.son.Delta;
import com.baka.domain.son.Round;
import com.baka.domain.son.Square;
import com.baka.exception.UnSupportedShapeException;
import javafx.scene.chart.Chart;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ChartFactory {
    public static IChart getChart(){
        Properties pro = new Properties();
        try {
        InputStream is = ChartFactory.class.getClassLoader().getResourceAsStream("ChartConfig.properties");
        pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String chartType = pro.getProperty("chartType");
        IChart chart=null;
        try {
            if ("delta".equalsIgnoreCase(chartType)) {
                chart = new Delta();
                System.out.println("初始化三角形");
            } else if ("round".equalsIgnoreCase(chartType)) {
                chart = new Round();
                System.out.println("初始化圆形");
            } else if ("Square".equalsIgnoreCase(chartType)) {
                chart = new Square();
                System.out.println("初始化方形");
            }
        }catch (UnSupportedShapeException e){
            e.printStackTrace();
        }
        return chart;
    }
}
