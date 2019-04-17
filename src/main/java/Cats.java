import java.util.List;

public interface Cats {

//no implementation of methods and nothing controlled/managed by list of cats
    //just a description of
    List<Cat> getAllCats();
    Cat getCat(int id);
    void addCat(Cat cat);
    void updateCat(Cat cat);
    void humanelyEuthanize(Cat cat);



}
