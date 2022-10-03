package LabExcercise.Lab1_oops;
import java.util.* ;
public class hotelRoom {
    static int c101 = 1;
    static int c102 = 1;
    static int c103 = 1;
    static int c201 = 1;
    static int c202 = 1;
    static int c203 = 1;
    static int c204 = 1;
    public static String roomPrice(String room){

        String Room = "";
        String s1 = "Single Occupancy";
        String s2 ="Double Occupancy";
        String s3 ="Triple Occupancy";

    /// SINGLE OCCUPANCY ROOMS _________________________________________________________-
        if(room.contains(s1) && room.contains("AC")) {
            if (room.contains("First Floor")) {
                if (c101 == 1) {
                    Room = "Room number: 101, first floor, air conditioned, single occupancy estimated: Rs. 3000 / day \n";
                    c101--;
                } else {
                    Room = "Single occupancy AC room not available at first floor!!!";
                }
            } else if (room.contains("Second Floor")) {
                if (c201 == 1) {
                    Room = "Room number: 201, second floor, air conditioned, single occupancy, estimated: Rs. 3000 / day";
                    c201--;
                } else {
                    Room = "Single occupancy AC room not available at Second floor!!!";
                }
            } else if (room.contains(s1) && room.contains("Non-AC")) {
                if (c202 == 1) {
                    Room = "Room number: 202, second floor, non-air conditioned, single occupancy, estimated: Rs. 2000 / day";
                    c202--;
                } else
                    Room = "Single occupancy Non-AC room not available at Second floor!!!";
            }
        }
        /// Double OCCUPANCY ROOMS _________________________________________________________-
        else if(room.contains(s2) && room.contains("AC")) {
            if (room.contains("First Floor")) {
                if (c102 == 1) {
                    Room = "Room number: 102, first floor, air conditioned, Double occupancy, estimated: Rs. 4000 / day ";
                    c102--;

                } else
                    Room = "Double occupancy AC room not available at First floor!!!";
            } else if (room.contains("Second Floor"))
                if (c203 == 1) {
                    Room = "Room number: 203, second floor, air conditioned, Double occupancy, estimated: Rs. 4000 / day ";
                    c203--;
                } else {
                    Room = "Double occupancy AC room not available at Second floor!!!";
                }

            else if (room.contains(s2) && room.contains("Non-AC")) {
                if (c103 == 1) {
                    Room = "Room number: 103, second floor, Non-air conditioned, Double occupancy, estimated: Rs. 3000 / day ";
                } else {
                    Room = "Double occupancy Non-AC room not available at Second floor!!!";
                }

            }
        }
        /// TRIPLE OCCUPANCY ROOMS _________________________________________________________-
        else if(room.contains(s3) ) {
            if (c204 == 1) {
                Room = "Room number: 204, second floor, air conditioned, Triple occupancy, estimated: Rs. 4000 / day ";
                c204-- ;
            }
            else {
                Room = "Triple occupancy room not available !!!";
            }
        }
        else
            Room = "Room NOT AVAILABLE";

    return Room;
    }

    public static void main(String[] args) {
        String room;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter : 'Single/Double/ Triple' Occupancy 'AC/Non-AC' 'First/Second' Floor or 'bye' to exit :::::::");
            room = sc.nextLine();
            if (room.matches("bye")) {
                break;
            }
            else {
                String res = roomPrice(room);
                System.out.println("result : " + res);

            }
        }
    }

}
