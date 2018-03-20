package Lesson3;

public class Insect {
    private  int size;
    private  String color;

    public Insect (int size, String color){
        this.size = size;
        this.color = color;
    }

    public void  move() {
        System.out.println("Move");
    }

    public void attack() {
        move();
        System.out.println("Attack");

    }

    class Bee extends Insect {
        public Bee(int size, String color) {
            super(size, color);
            Bee bee = new Bee(12, "Yellow");
        }

        public void move() {
            System.out.println("Fly");
        }

        public void attack() {
            //move();
            System.out.println("Fly");
            super.attack();
        }

       // public static  void main(String[] args) { Bee(); }


    }

}
