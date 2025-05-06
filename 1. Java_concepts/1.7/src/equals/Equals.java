public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("Harsh", 31, "001");
        Person person2 = new Person("Harsh", 30, "001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }
    }
}
