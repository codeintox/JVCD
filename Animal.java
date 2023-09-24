abstract class Animal{
    abstract public void walk(); 
    Animal(){
        System.out.println("THe Animal Kindom");
    }
        
        public void eat() {
            System.out.println("Animal eats");
        }
    
        public static class Horse extends Animal{
            Horse(){
                System.out.println("in this world");
            }
            public void walk(){
                System.out.println("Horse walks in 4 legs");
                
            }
        }
        class Chicken extends Animal{
            public void walk() {
             System.out.println("Chickens can fly"); 
            }
        }
        public static void main(String[] args) {
            Horse hr = new Horse();
            hr.walk();
            hr.eat();
            //Animal an = new Animal();
            //an.walk();
        }
    }
