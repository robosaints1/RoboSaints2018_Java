package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Straight_NOHOMO_Forward_autonomous extends Command {

    public Straight_NOHOMO_Forward_autonomous() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//protected int driveTime; 
    	requires(Robot.driveSystem);
    	//driveTime = 5000;
    	
  
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.driveSystem
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
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
