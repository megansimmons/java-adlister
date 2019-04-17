import java.util.ArrayList;
import java.util.List;

public class CatHerder implements Cats{

    static List<Cat> cats;

    public CatHerder(){
        if (cats == null)
            cats = new ArrayList<>();
        init();
    }



    public Cat getCat(int id){
        return cats.get(id);
    }

/*    public Cat getCat(String name){

    }*/

    public List<Cat> getAllCats(){
        return cats;
    }

    public void addCat(Cat cat){
        cats.add(cat);
    }


    public void updateCat( Cat cat){
        cats.set(cat.getId(), cat);
    }
    public void humanelyEuthanize(int id){
        cats.remove(this.getCat(id));
    }

    @Override
    public void humanelyEuthanize(Cat cat) {
        humanelyEuthanize(cat.getId());
    }

    private void init(){
        this.addCat(new Cat("Mace", 3, "https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        this.addCat(new Cat("Biscuit", 1, "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        this.addCat(new Cat("Stella", 21, "https://images.pexels.com/photos/730896/pexels-photo-730896.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
    }
}
