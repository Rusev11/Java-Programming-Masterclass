package Gearbox;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 14.1);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        mcLaren.wheelSpeed(1200);
        mcLaren.changeGear(2);
        mcLaren.wheelSpeed(3000);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        mcLaren.wheelSpeed(6000 );

    }
}
