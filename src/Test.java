public class Test {
    public static void main(String[] args) {
        Movable mp = new MovablePoint(10, 50, 2, 3);
        Movable mc = new MovableCircle(100, 200, 30, 5, 8);
        Movable mr = new MovableRectangle(50, 70, 200, 220, 10, 12);

        mc.moveLeft();
        mp.moveUp();
        mr.moveDown();

        System.out.println(mp);
        System.out.println(mc);
        System.out.println(mr);

    }
}