package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ForwardABit extends Command {
	protected int driveTime;
    public ForwardABit() {
        requires(Robot.driveSystem);
        driveTime = 2000;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.driveSystemRobotDrive21.setMaxOutput(.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (this.timeSinceInitialized() > (driveTime / 1000));
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSystem.robotDrive21.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveSystem.robotDrive21.stopMotor();
    }
}
