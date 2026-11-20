public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped("red", 25, 0, 11);
        slowRide.display();

        System.out.println("--------------");
        Car toyota=new Car("White", 5, 0, 7);
        toyota.display();

        SemiTruck semiTruck=new SemiTruck("Grey", 5, 0, 5);

        System.out.println("--------------");
        SemiTruck semitruck =new SemiTruck("Blue", 8, 15, 20);
        semiTruck.display();

        System.out.println("--------------");
        Hovercraft hcraft =new Hovercraft("Pink", 20, 89, 25);
        hcraft.display();





    }


}
