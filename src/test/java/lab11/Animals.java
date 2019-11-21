package lab11;

public class Animals {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void walk(){
        System.out.println("It's time to go walk!");
    }

    public void sleep(int time){
        System.out.println(time + " - It's time to go sleep");
    }

    public void eat(){
        System.out.println("It's time to eat");
    }
}
