import java.util.ArrayList;
import java.util.List;

public class ListDogsDao implements Dogs {

    private List<Dog> dogs;

    public List<Dog> all(){
        if(dogs==null){
            dogs = generateDogs();
        }
        return dogs;
    }

    public List<Dog> generateDogs(){
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1,
                20,
                23,
                "brown",
                "Sid"
        ));
        dogs.add(new Dog(3,
                80,
                40,
                "black",
                "Gandalf"
        ));
        dogs.add(new Dog(10,
                35,
                30,
                "brown and white",
                "Molly"
        ));
        dogs.add(new Dog(9,
                35,
                30,
                "black and white",
                "Bella"
        ));
        dogs.add(new Dog(9,
                25,
                20,
                "grey",
                "Bug"
        ));
        return dogs;
    }
}
