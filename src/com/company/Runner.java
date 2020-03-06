package com.company;

public class Runner extends Thread {
    private int ss=1;

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    public void run() {


        if (getSs() - 1 == 5) {
            System.out.println(getName() + " берет палку");
            System.out.println(" Runner 5 идет к финишу ");
            System.out.println(getName() + " бежит к Runner 4");
        } else if (getSs() == 0) {
            System.out.println(getName() + " бежит к Runner " + getSs());
            System.out.println(" Runner " + getSs() + " берет палку");
        } else {
            System.out.println(getName() + " берет палку");
            System.out.println(getName() + " бежит к Runner " + getSs());
        }


          try{  sleep(000);
        } catch (InterruptedException rt) {
        }finally {
              if(getSs()==1){
                  System.out.println("Runner 1 берет паlку");
              }
          }


    }
}
















