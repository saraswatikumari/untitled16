class  AB extends Thread{
    public  void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello world");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class c {
    public static void main(String[] args) throws InterruptedException {
        AB obj1=new AB();
        obj1.start();
        for(int i=0;i<5;i++){
            System.out.println("Thread2");
            Thread.sleep(3000);
            Thread.yield();
        }

    }

}

