package Doors;

public class DoorSecond {
    private static DoorSecond doorSecond = new DoorSecond() ;
    private boolean isOpened = false;
    private DoorSecond(){

    }
    public boolean isOpened(){
        return isOpened;
    }
    public static DoorSecond getDoorSecond(){
        return doorSecond;
    }

    public synchronized void DoorSecondOpen(String name) throws InterruptedException {
        isOpened = true;
        System.out.println("Door2 is opened by "+name);
        Thread.sleep(5);
    }

    public synchronized void DoorSecondClose(String name) throws InterruptedException {
        isOpened = false;
        System.out.println("Door2 is closed by "+name);
        Thread.sleep(5);
    }
}
