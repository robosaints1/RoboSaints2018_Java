package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class AutoTurnRight extends Command {

    public AutoTurnRight() {
    	requires(Robot.driveSystem);
        
    }
    protected void initialize() {
    	Robot.driveSystem.robotDrive21.curvatureDrive(0.3, 0, true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
