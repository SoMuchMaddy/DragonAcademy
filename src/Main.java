public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Ruideinn", "Daggertail", "Orange", 85, true);

        System.out.println("Name: " + dragon.getName());
        System.out.println("Breed: " + dragon.getBreed());
        System.out.println("Color: " + dragon.getColor());
        System.out.println("Age: " + dragon.getAge());
        System.out.println("Bonded: " + dragon.isBonded());
    }
}