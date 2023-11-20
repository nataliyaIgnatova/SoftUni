public class Train {
    public static class Person{
        String name;
        String town;
        int age;

        public Person (String) {

        }

        public Person(String nameObj, String townObj, int ageObj) {
            this.name = nameObj;
            this.town = townObj;
            this.age = ageObj;

        }
        public Person(String name) {
            this.name = name;

        }
        public Person(int age){
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person brother = new Person("Lydmil", "Pleven", 25);

        Person sister = new Person("Raya", "Sofia", 12);









    }
}
