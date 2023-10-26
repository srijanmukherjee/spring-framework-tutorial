package in.srijanmukherjee;

public class Engine {
    private int hp;
    private int cylinders;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine(hp=" + hp + ", cylinders=" + cylinders + ")";
    }
}
