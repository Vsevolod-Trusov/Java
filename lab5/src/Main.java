import Cars.Car;
import Roads.Road;
import Students.Student;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

//         Student Vsevolod = new Student("Vsevolod", "19", "2-1");
//         Student Annie = new Student("Annie", "19", "2-2");
//         Student Artem = new Student("Artem", "19", "2-3");
//         Student Gleb = new Student("Gleb", "19", "2-1");
//         Student Sasha = new Student("Sasha", "19", "2-4");
//         Student Lesha = new Student("Lesha", "19", "2-5");
//         Student Misha = new Student("Misha", "19", "2-3");
//         Student Dasha = new Student("Dasha", "19", "2-1");
//         Student Pasha = new Student("Pasha", "19", "2-6");
//         Thread stud1 = new Thread((Vsevolod));
//         Thread stud2 = new Thread((Annie));
//         Thread stud3 = new Thread((Artem));
//         Thread stud4 = new Thread((Gleb));
//         Thread stud5 = new Thread((Sasha));
//         Thread stud6 = new Thread((Lesha));
//         Thread stud7 = new Thread((Misha));
//         Thread stud8 = new Thread((Dasha));
//         Thread stud9 = new Thread((Pasha));
//
//         stud1.start();
//         stud2.start();
//         stud3.start();
//         stud4.start();
//         stud5.start();
//         stud6.start();
//         stud7.start();
//         stud8.start();
//         stud9.start();

         ReentrantLock Loker = new ReentrantLock();
         Road road = new Road("on work", 3, Loker);
         Car audi = new Car("audi", "on work", road);
         Car opel = new Car("opel", "on work", road);
         Car mazda = new Car("mazda", "on work", road);
         Car tayota = new Car("tayota", "from work", road);
         Car lada = new Car("lada", "from work", road);
         Car reno = new Car("reno", "from work", road);


         audi.start();
         opel.start();
         mazda.start();
         tayota.start();
         lada.start();
         reno.start();




    }
}
