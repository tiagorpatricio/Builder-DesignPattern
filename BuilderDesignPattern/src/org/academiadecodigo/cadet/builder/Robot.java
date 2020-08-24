package org.academiadecodigo.cadet.builder;

public class Robot {

    private String name;
    private int arms;
    private int legs;
    private int eyes;


    private final boolean isFlamethrowerEnabled;
    private final boolean isFlyingEnabled;

    public int getArms() {
        return arms;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isFlamethrowerEnabled() {
        return isFlamethrowerEnabled;
    }

    public boolean isFlyingEnabled() {
        return isFlyingEnabled;
    }

    private Robot(RobotBuilder builder) {
        this.name = builder.name;
        this.arms = builder.arms;
        this.eyes = builder.eyes;
        this.legs = builder.legs;
        this.isFlamethrowerEnabled = builder.isFlamethrowerEnabled;
        this.isFlyingEnabled = builder.isFlyingEnabled;

    }

    public static class RobotBuilder {
        private String name;
        private int arms;
        private int legs;
        private int eyes;

        private boolean isFlamethrowerEnabled;
        private boolean isFlyingEnabled;

        public RobotBuilder(String name, int arms, int legs, int eyes) {
            this.name = name;
            this.arms = arms;
            this.legs = legs;
            this.eyes = eyes;

            printRobot();
        }

        public RobotBuilder setFlamethrowerEnabled(boolean isFlamethrowerEnabled) {
            this.isFlamethrowerEnabled = isFlamethrowerEnabled;
            System.out.println(name  + "'s " + "Flamethrower has been set to " + isFlamethrowerEnabled);
            return this;
        }

        public RobotBuilder setFLyingEnabled(boolean isFlyingEnabled) {
            this.isFlyingEnabled = isFlyingEnabled;
            System.out.println(name  + "'s " + "Flying has been set to " + isFlyingEnabled);
            return this;
        }

        public Robot build() {
            return new Robot(this);
        }

        public void printRobot(){
            System.out.println("Robot " + name + " has :" + arms + " arms, " + legs + " legs, " + eyes + " eyes.");
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", arms=" + arms +
                ", legs=" + legs +
                ", eyes=" + eyes +
                ", isFlamethrowerEnabled=" + isFlamethrowerEnabled +
                ", isFlyingEnabled=" + isFlyingEnabled +
                '}';
    }
}

