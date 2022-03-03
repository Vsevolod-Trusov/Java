package Students;

import Doors.DoorFirst;
import Doors.DoorSecond;

public class Student extends Thread{
   private final String name;
   private final String age;
   private final String course;

    private DoorFirst doorFirst = DoorFirst.getDoorFirst();
   private DoorSecond doorSecond = DoorSecond.getDoorSecond();

   public Student(String name, String age, String course){
       this.name = name;
       this.age = age;
       this.course = course;
   }
   public synchronized void Wait() throws InterruptedException {
       System.out.println(name+" is waiting");
       Thread.sleep(20);
       System.out.println(name+" end of waiting");
   }
    @Override
    public void run() {
      try{ while (true){
            if(!doorFirst.isOpened())
            {
                doorFirst.DoorFirsOpen(name);
                doorFirst.DoorFirsClose(name);
                break;
            }
            else if(!doorSecond.isOpened()){
                doorSecond.DoorSecondOpen(name);
                doorSecond.DoorSecondClose(name);
                break;
            }
            else
            {
               Wait();
            }
         }
      }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
