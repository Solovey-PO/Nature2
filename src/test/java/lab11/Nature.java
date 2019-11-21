package lab11;

public class Nature {

    public static void main(String[] args) {
        Animals cat1 = new Cats();
        Animals cat2 = new Cats();
        Animals dog1 = new Dogs();
        Dogs dog2 = new Dogs();

        cat1.setName("Foton");
        cat2.setName("Gendalf");
        System.out.println("Первого кота зовут - " + cat1.getName());
        System.out.println("Второго кота зовут - " + cat2.getName());
        cat1.eat();
        cat2.sleep(2200);
        cat1.walk();

        //приведение ссылки на объект к её действительному типу
        Cats cat3 = (Cats) cat2;
        System.out.println(cat3.getName());
        cat3.meow();


        dog1.setName("Slon");
        dog2.setName("Moska");
        System.out.println("Собака по кличке - " + dog1.getName());
        System.out.println("Собака по кличке - " + dog2.getName());
        dog1.walk();
        dog2.sleep(1900);
        dog2.bark();

        //ClassCastException
        if (dog1 instanceof Dogs) {
            Dogs dog3 = (Dogs) dog1;
            System.out.println(dog3.getName());
            dog3.bark();
        }
    }
}
