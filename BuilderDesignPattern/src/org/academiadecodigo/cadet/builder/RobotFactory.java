package org.academiadecodigo.cadet.builder;

public class RobotFactory {
    public static void main(String[] args) {
        Robot apex21 = new Robot.RobotBuilder("Apex21",2,1,3).setFlamethrowerEnabled(true).setFLyingEnabled(true).build();
        Robot apex23 = new Robot.RobotBuilder("Apex23",5,2,4).setFlamethrowerEnabled(true).build();
        Robot modelX23 = new Robot.RobotBuilder("Model-X23",10,5,2).build();
    }
}
