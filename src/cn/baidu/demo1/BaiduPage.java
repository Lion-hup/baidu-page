package cn.baidu.demo1;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Scanner;

public class BaiduPage {

    public static void main(String[] args) {
        String s = "y";
        while (s.equals("y")){
            //获取扫描器对象
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入当前页和总页数，中间用空格隔开......");

            //当前页
            int pageCode = sc.nextInt();
            //总页数
            int totalPage = sc.nextInt();

            showPage(pageCode, totalPage);

            System.out.print("是否继续（y/n）：");
            s = sc.next();
        }

        System.out.println("程序退出");


    }

    public static void showPage(int pageCode, int totalPage){

        int begin = 0;
        int end = 0;

        if (totalPage <= 10){
            begin = 1;
            end = totalPage;
        }else {
            begin = pageCode -5;
            end = pageCode + 4;

            if (begin <= 0){
                begin = 1;
                end = 10;
            }

            if (end >= totalPage){
                begin = totalPage -9;
                end = totalPage;
            }

        }

        if (pageCode > 1){

            System.out.print("上一页" + "\t");
        }

        for (int i = begin; i <= end; i++) {

            if (pageCode == i){
                System.err.print(i + "\t");
            }else {

                System.out.print(i + "\t");
            }

        }


        if (pageCode < totalPage) {
            System.out.print("下一页" + "\t");
        }

    }
}
