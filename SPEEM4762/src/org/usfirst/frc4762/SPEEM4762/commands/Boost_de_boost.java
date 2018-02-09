package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Boost_de_boost extends Command {

    public Boost_de_boost() {
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveSystem.robotDrive21.setMaxOutput(0.75);
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
    	Robot.driveSystem.robotDrive21.setMaxOutput(RobotMap.driveSpeed);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveSystem.robotDrive21.setMaxOutput(RobotMap.driveSpeed);
    }
}
