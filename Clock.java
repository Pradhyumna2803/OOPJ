package OOPJ;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.*;


interface demoInter
{
    void getClock(String s);
    void getDelayedClock();
}

class myexception extends Exception
{
    public myexception(String s)
    {
        super(s);
    }

    myexception retObj()
    {
        System.out.println("Returning the object of myexception type ");
        myexception obj=new myexception("Demo");
        return obj;
    }
}

class demoCall implements demoInter
{
    int a,b;
    demoCall()
    {

    }
    demoCall(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void getDelayedClock(){
//        System.out.println("THANK YOU FOR WAITING");
        new Clock();
        System.out.println("THE CLOCK IS IN THE TASKBAR,MAXIMIZE IT!");
        return;
    }
    public void getClock(String st)
    {
        if(st.equalsIgnoreCase("yes"))
        {
            System.out.println("CALLING THE CLOCK");
            System.out.println("THE CLOCK WILL BE IN THE TASK BAR, MAXIMIZE IT!");
            new Clock();
        }
        if(st.equalsIgnoreCase("wait"))
        {
            new newThread();
            getDelayedClock();

        }
        if(st.equalsIgnoreCase("no")){
            System.out.println("Please rerun program and call the clock once again");
            return ;
        }
        if(!st.equalsIgnoreCase("yes") || !st.equalsIgnoreCase("no") || !st.equalsIgnoreCase("wait"))
        {
            System.out.println("INVALID OPTION");
            return;
        }
    }
    void display()
    {
        System.out.println("a   "+this.a);
        System.out.println("b   "+this.b);
    }
    demoCall retObj()
    {
        demoCall obj=new demoCall();
        return obj;
    }
    void takeInput()
    {
        String st,name;
        Scanner sc=new Scanner(System.in);
        System.out.println("HELLO,THIS IS MY DIGITAL CLOCK!!!!");
        System.out.println("PLEASE ENTER YOUR NAME");
        name=sc.nextLine();
        System.out.println("WELCOME "+name+" SIR,PLEASE CHOOSE AN OPTION ");
        System.out.println("1.PRESS YES TO RUN THE CLOCK");
        System.out.println("2.PRESS WAIT TO RUN THE CLOCK AFTER 5 SEC");
        System.out.println("3.PRESS NO TO STOP");
        st= sc.nextLine();
        getClock(st);
    }
}

class demoCall1 extends demoCall
{
    int c;
    demoCall1(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
    }
    void display()
    {
        System.out.println("a   "+super.a);
        System.out.println("b   "+super.b);
        System.out.println("c   "+this.c);
    }
}

class newThread extends Thread{
    Thread t;
    newThread(){
        System.out.println("PLEASE WAIT");
        start();
    }
    public void run(){
        int i;
        try{
            for(i=5;i>0;i--)
            {
                System.out.println("Clock appearing in   "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("");
        }
        //System.out.println("");
    }
}

public class Clock extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    Clock()
    {           //Constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat=new SimpleDateFormat("EEEE");
        dateFormat=new SimpleDateFormat("dd MMMMM, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 59));
        timeLabel.setBackground(Color.black);
        timeLabel.setForeground(Color.white);
        timeLabel.setOpaque(true);
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.BOLD,35));

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTimer();
    }

    public void setTimer()
    {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);    //this sets the time in

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try
            {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        demoCall ob=new demoCall();
        //new newThread();
        //ob.getClock();
        ob.takeInput();
//        new newThread();
        //new Clock();
    }
}

