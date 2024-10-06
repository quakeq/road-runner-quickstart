package org.firstinspires.ftc.teamcode.teleop.programs;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.subsystems.ClawIntake;
import org.firstinspires.ftc.teamcode.subsystems.Drivebase;

@TeleOp(name = "SpicyPillowTeleOp")
public class SpicyPillowTeleOp extends LinearOpMode {

    ClawIntake clawIntake = new ClawIntake();
    Drivebase drivebase = new Drivebase();


    @Override

    public void runOpMode() throws InterruptedException {
        clawIntake.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()){
            clawIntake.openClaw(gamepad2.left_trigger > 0.1);
            clawIntake.closeClaw(gamepad2.right_trigger > 0.1);
        }

    }
}
