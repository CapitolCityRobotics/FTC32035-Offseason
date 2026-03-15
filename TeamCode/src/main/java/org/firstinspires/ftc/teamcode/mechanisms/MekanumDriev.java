package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.hardware.HardwareMap;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
public class MekanumDriev {

    DcMotor frontLeftDrive, frontRightDrive, backLeftDrive, backRightDrive;
    public void init(HardwareMap hardMap) {
         frontLeftDrive  = hardMap.get(DcMotor.class, "front_left_drive");
         backLeftDrive  = hardMap.get(DcMotor.class, "back_left_drive");
         frontRightDrive  = hardMap.get(DcMotor.class, "front_left_drive");
         backRightDrive  = hardMap.get(DcMotor.class, "front_left_drive");

        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
    }
    public void drievrobo(double forward, double strafe, double turn) {
    // comment
        // more comment
            //youtuber??? wierd os

        double scalefactor = Math.max(Math.abs(forward) + Math.abs(strafe) + Math.abs(turn), 1.0);

        double frontLeftPower = ((forward + strafe + turn) / scalefactor);
        double backLeftPower = ((forward - strafe + turn) / scalefactor);
        double frontRightPower = ((forward - strafe - turn) / scalefactor);
        double backRightPower = ((forward + strafe - turn) / scalefactor);

        frontRightDrive.setPower(frontRightPower);
        frontLeftDrive.setPower(frontLeftPower);
        backRightDrive.setPower(backRightPower);
        backLeftDrive.setPower(backLeftPower);
    }
}
