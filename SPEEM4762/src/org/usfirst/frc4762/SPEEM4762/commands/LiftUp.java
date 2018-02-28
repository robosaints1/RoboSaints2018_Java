package org.usfirst.frc4762.SPEEM4762.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;


public class LiftUp extends Command {


    public LiftUp() {
requires(Robot.lift);

    }

    protected void initialize() {
    	RobotMap.liftElevator.set(0.6);
    }


    protected void execute() {
    }


    protected boolean isFinished() {
        return false;
    }


    protected void end() {
    	RobotMap.liftElevator.set(0);
    }


    protected void interrupted() {
    	RobotMap.liftElevator.set(0);
    }
}
