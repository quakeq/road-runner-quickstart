package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.util.SerialNumber;

import java.net.InetAddress;

public class Vision {
    private SerialNumber serial;
    private InetAddress ip;
    private Limelight3A limelight3A = new Limelight3A(serial, "Looky", ip);
    public Vision() {}
    public void detectAprilTag(){

    }


}
