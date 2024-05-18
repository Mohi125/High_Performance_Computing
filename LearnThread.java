
class MyThread1 extends Thread{
    
    @Override
    public void run(){
        int i = 0;
        while(i<300){
            System.out.println("Thread 1");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    
    @Override
    public void run(){
        int i = 0;
        while(i<300){
            System.out.println("Thread 2");
            i++;
        }
    }
}


class LearnThread {

    public static void main(String[] args){
         MyThread1 t1 = new MyThread1();
         MyThread2 t2 = new MyThread2();
         t1.start();
         t2.start();
    }
    
}
