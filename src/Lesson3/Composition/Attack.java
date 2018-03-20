package Lesson3.Composition;

public interface Attack {
    public void move();
    public void attack();
}

class AttackTmp1 implements Attack {
    private  String move;
    private  String attack;

    public AttackTmp1 (String move, String attack) {
        this.move = move;
        this.attack = attack;
    }

    @Override
    public  void  move() {
        System.out.println(move);
    }
    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }
}

class  Insect {
    private int size;
    private  String color;

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }

    class  Bee extends  Insect implements Attack {
        private  Attack attack;

        public Bee (int size, String color, Attack attack) {
            super(size, color);
            this.attack = attack;
        }

        public void move() {
            attack.move();
        }

        public void attack() {
            attack.attack();
        }

        public static void main(String[] args) {
            Bee bee = new Bee(15, "Yellow", new AttackTmp1("Fly", "Sting"));
            System.out.println(bee.attack());
        }

    }
}