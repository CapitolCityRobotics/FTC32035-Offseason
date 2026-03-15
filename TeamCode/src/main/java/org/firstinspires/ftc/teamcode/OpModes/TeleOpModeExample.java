package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.mechanisms.MekanumDriev;

@TeleOp
public class TeleOpModeExample extends LinearOpMode {

    // create  instance of MekanumDriev object
    MekanumDriev drive = new MekanumDriev();


    @Override
    public void runOpMode() throws InterruptedException {
        drive.init(hardwareMap);

        telemetry.addLine("robotready. press play 2 start");
        telemetry.update();


        waitForStart();






        while (opModeIsActive()) {



            drive.drievrobo(-gamepad1.left_stick_y,gamepad1.left_stick_x, gamepad1.right_stick_x);
        }
    }
}
