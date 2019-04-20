public class Dog {

    private int age;
    private int weightInLbs;
    private int heightInInches;
    private String color;
    private String name;

    public Dog(){}

    public Dog(int age, int weightInLbs, int heightInInches, String color, String name){
        this.age = age;
        this.weightInLbs = weightInLbs;
        this.heightInInches = heightInInches;
        this.color = color;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getWeightInLbs(){
        return weightInLbs;
    }

    public void setWeightInLbs(int weightInLbs) {
        this.weightInLbs = weightInLbs;
    }

    public int getHeightInInches(){
        return heightInInches;
    }
    public void setHeightInInches(int heightInInches){
        this.heightInInches = heightInInches;
    }

    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
