public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Dolby",10, 55);

        if(theatre.reservedSeat("H11")){
            System.out.println("PLease pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reservedSeat("H11")){
            System.out.println("PLease pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
