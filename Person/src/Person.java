
public class Person {
        //№1
        String fullName = "Нина";
        int age = 20;
        //№2
        void move (String Person){
            System.out.println("Такой-то " + Person + " говорит");
        }

        void talk (String Person){
            System.out.println("Такой-то " + Person + " говорит");
        }
        //№3
        Person() {
        }

        Person(String fullName, int age){
            this.fullName = fullName;
            this.age = age;
        }

}


