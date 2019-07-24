package com.qzj.C1_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.*;

public class E34 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        switch (num) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                int k = Integer.parseInt(args[1]);
                task3(k);
                break;
            case 4:
                task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            default:
                System.out.println("任务一：可以过滤\n" +
                        "任务二：不可以过滤\n" +
                        "任务三：可以过滤\n" +
                        "任务四：可以过滤\n" +
                        "任务五：可以过滤\n" +
                        "任务六：不可以过滤\n" +
                        "任务七：不可以过滤\n" +
                        "任务八：不可以过滤");
        }
    }

    public static void task1() {
        double min = 1.0;
        double max = 0.0;
        double now = 0.0;
        while (StdIn.hasNextLine()) {
            now = Double.parseDouble(StdIn.readLine());
            if (min > now)
                min = now;
            if (max < now)
                max = now;
        }
        System.out.printf("最大的数：%f\n最小的数：%f", max, min);
    }

    public static void task2() {
        double[] d = StdIn.readAllDoubles();
        Arrays.sort(d);
        int l = d.length;
        if (l % 2 != 0)
            System.out.println("中位数：" + d[l / 2]);
        else
            System.out.println("中位数：" + (d[l / 2 - 1] + d[l / 2]) / 2);
    }

    public static void task3(int k) {
        double[] list = new double[k];
        int i = 0;
        double now = 0.0;
        while (StdIn.hasNextLine()) {
            now = Double.parseDouble(StdIn.readLine());
            if (i < k) {
                list[i] = now;
                i++;
                continue;
            }
            Arrays.sort(list);
            if (list[k - 1] > now) {
                list[k - 1] = now;
            }
        }
        Arrays.sort(list);
        System.out.println("第" + k + "小的数：" + list[k - 1]);
    }

    public static void task4() {
        double res = 0.0;
        while (StdIn.hasNextLine())
            res += Math.pow(Double.parseDouble(StdIn.readLine()), 2);
        System.out.println("所有数的平方和：" + res);
    }

    public static void task5() {
        double res = 0.0;
        int N = 0;
        while (StdIn.hasNextLine()) {
            res += Double.parseDouble(StdIn.readLine());
            N++;
        }
        System.out.println("平均值：" + res / (double) N);
    }

    public static void task6() {
        double[] input = StdIn.readAllDoubles();
        double ave = 0.0;
        for (double d : input)
            ave += d;
        ave /= input.length;
        int n = 0;
        for (double d : input)
            if (d > ave)
                n++;
        System.out.println("大于平均值的数的百分比："
                + (double)n / (double) input.length * 100 + "%");
    }
    public static void task7() {
        double[] input = StdIn.readAllDoubles();
        Arrays.sort(input);
        for (double d : input)
            System.out.println(d);
    }
    public static void task8() {
        double[] input = StdIn.readAllDoubles();
        ArrayList<Double> list = new ArrayList<>();
        for (double d: input) {
            list.add(d);
        }
        Collections.shuffle(list);//    洗牌
        Iterator it = list.iterator();// 列表迭代器
        while (it.hasNext())
            System.out.println(it.next());
    }
}
