

    interface Animal {
        void sound();  // Method in the interface
        void eat();    // Another method in the interface
    }

    class Dog implements Animal {
        public void sound() {
            System.out.println("Woof");
        }

        public void eat() {
            System.out.println("Dog is eating");
        }

        // Additional method that is not part of the interface
        public void fetch() {
            System.out.println("Dog is fetching");
        }
    }

    public class InterfaceExample {
        public static void main(String[] args) {
            Animal myDog = new Dog();  // Interface reference pointing to a child object

            myDog.sound();  // Valid, as sound() is part of the Animal interface
            myDog.eat();    // Valid, as eat() is part of the Animal interface

//             myDog.fetch();  // Error! fetch() is not defined in the Animal interface
        }
    }


