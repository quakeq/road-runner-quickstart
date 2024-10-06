package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Drivebase {
    private DcMotorEx BILDA_FR, BILDA_FL, BILDA_BR, BILDA_BL;

    public Drivebase(){}

    public void init(HardwareMap hwMap) {
        BILDA_FR = hwMap.get(DcMotorEx.class, "frontright");
        BILDA_FR.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        BILDA_FR.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        BILDA_FR.setZeroPowerBehavior((DcMotorEx.ZeroPowerBehavior.BRAKE));

        BILDA_FL = hwMap.get(DcMotorEx.class, "frontleft");
        BILDA_FL.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        BILDA_FL.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        BILDA_FL.setZeroPowerBehavior((DcMotorEx.ZeroPowerBehavior.BRAKE));

        BILDA_BR = hwMap.get(DcMotorEx.class, "backright");
        BILDA_BR.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        BILDA_BR.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        BILDA_BR.setZeroPowerBehavior((DcMotorEx.ZeroPowerBehavior.BRAKE));

        BILDA_BL = hwMap.get(DcMotorEx.class, "backleft");
        BILDA_BL.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        BILDA_BL.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        BILDA_BL.setZeroPowerBehavior((DcMotorEx.ZeroPowerBehavior.BRAKE));
    }
    //drive method sets power to the motors (used in both auto and teleop)
    public void drive(double fl, double fr, double bl, double br){
        BILDA_FL.setPower(fl);
        BILDA_FR.setPower(fr);
        BILDA_BL.setPower(bl);
        BILDA_BR.setPower(br);
    }
    public void odometry(){

    }


}
