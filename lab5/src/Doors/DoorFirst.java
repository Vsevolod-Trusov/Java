package Doors;

public class DoorFirst {
    private static DoorFirst doorOne = new DoorFirst() ;
    private boolean isOpened = false;
    private DoorFirst(){

    }
    public static DoorFirst getDoorFirst(){
        return doorOne;
    }

    public boolean isOpened(){
        return isOpened;
    }
    public synchronized void DoorFirsOpen(String name) throws InterruptedException {
        isOpened = true;
        System.out.println("Door1 is opened by "+name);
        Thread.sleep(5);
    }

    public synchronized void DoorFirsClose(String name) throws InterruptedException {
        isOpened = false;
        System.out.println("Door1 is closed by "+ name);
        Thread.sleep(5);
    }

}
