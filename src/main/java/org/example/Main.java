package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
//        System.out.println("Task 2");
//        Balance balance = new Balance();
//        balance.addRight(5);
//        balance.result();
//        System.out.println("Task 3");
//        Bell b = new Bell();
//        b.sound();
//        b.sound();
//        b.sound();
//        System.out.println("Task 4");
//        OddEvenSeparator OES = new OddEvenSeparator();
//        OES.addNumber(5);
//        OES.addNumber(7);
//        OES.addNumber(4);OES.addNumber(1);
//        OES.addNumber(2);
//        OES.addNumber(5);
//        OES.even();
//        System.out.println("-----");
//        OES.odd();
//        System.out.println("Task 5");
//        Table table = new Table(6,4);
//        table.setValue(0,0,5);
//        table.setValue(2,3,7);
//        //table.getValue(1,2);
//        System.out.println(table.cols());
//        System.out.println(table.toString());
//        System.out.println(table.average());
        System.out.println("Task 1");
        Button1 but = new Button1();
    }
}
class Button1 {
    int clickCount = 0;
    Button button = new Button("click");

    Button1() {
        Frame frame = new Frame();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                click();
            }});
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    void click() {
        clickCount++;
        //System.out.println(clickCount);
        button.setLabel("Button was clicked "+clickCount+" times");
    }
}
class Balance{

    int a=0;
    int b=0;

    void addRight(int i){
        a=a+i;
    }
    void addLeft(int i){
        b=b+i;
    }
    void result(){
        if(a>b){System.out.println("R");} else
        if (a<b) {
            System.out.println("L");
        }else{System.out.println("=");}
    }
}
class Bell{
    boolean a=true;
    void sound(){
        if(a){
            System.out.println("ding");
            a=false;}
        else{
            System.out.println("dong");
            a=true;
        }
    }
}
class OddEvenSeparator{
    List<Integer> list= new ArrayList<>();
    void addNumber(int a){
        list.add(a);
    }
    void even(){
        for(int i: list){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    void odd(){
        for(int i: list){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
class Table{
    int rows;
    int cols;
    int[][] Arr;
    Table(int a,int b){
        rows=a;
        cols=b;
        Arr=new int[rows][cols];
    }
    int getValue(int row,int col){
        return (Arr[row][col]);
    }
    void setValue(int row, int col, int value){
        Arr[row][col]=value;
    }
    int rows(){
        return(Arr.length);
    }
    int cols(){
        return(Arr[0].length);
    }
    public String toString(){
        return Arrays.deepToString(Arr);
    }
    float average(){
//        IntStream stream =  (Arrays.stream(Arr)).flatMapToInt(Arrays::stream);
//        System.out.println(stream.average());
        float sum=0;
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[0].length;j++){
                sum=sum+Arr[i][j];
            }
        }
        return sum/(Arr.length*Arr[0].length);
    }
}