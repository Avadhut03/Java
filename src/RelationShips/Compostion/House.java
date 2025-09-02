package RelationShips.Compostion;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Rooms> rooms;
    class Rooms{
        private String name;
        Rooms(String name){
            this.name= name;

        }
        public String getName(){
            return name;
        }
    }
    House(){
        rooms= new ArrayList<>();
        rooms.add( new Rooms("Bedroom"));
        rooms.add( new Rooms("Living"));
        rooms.add( new Rooms("Kitchen"));
    }
    public void showRooms(){
        for(Rooms room:rooms){
            System.out.println(room.getName());
        }
    }
}
