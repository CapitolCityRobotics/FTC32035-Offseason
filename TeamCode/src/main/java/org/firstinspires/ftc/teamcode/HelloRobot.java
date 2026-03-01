package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class HelloRobot extends OpMode {
    @Override
    public void init() {
        telemetry.addLine("Hello Robot :)");
    }

    @Override
    public void loop() {

    }
}
