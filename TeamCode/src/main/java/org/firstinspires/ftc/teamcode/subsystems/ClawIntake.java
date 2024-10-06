package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawIntake {
    private Servo AXONMINI_CLAW;
    private Servo AXONMINI_ARM;
    private Servo AXONMINI_ROTATION;


    public ClawIntake(){}
    //init method
    public void init(HardwareMap hwMap){
        AXONMINI_CLAW = hwMap.get(Servo.class, "AxonClaw");
        AXONMINI_CLAW.setPosition(0.2);
        AXONMINI_CLAW.setDirection(Servo.Direction.FORWARD);
        AXONMINI_ARM = hwMap.get(Servo.class, "AxonArm");
        AXONMINI_ROTATION = hwMap.get(Servo.class, "AxonRotation");
    }

    //Utilizes Limelight to pickup stuff
    public void pickupSpecimen(){


    }

    public void openClaw(boolean clicked){
        if (clicked){
            AXONMINI_CLAW.setPosition(0.9);
        }
    }
    public void closeClaw(boolean clicked){
        if (clicked && AXONMINI_CLAW.getPosition() != 0.2){
            AXONMINI_CLAW.setPosition(0.2);
        }
    }


}
