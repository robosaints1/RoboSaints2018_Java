package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Straight_NOHOMO_Forward_autonomous extends Command {
	protected int driveTime;
    public Straight_NOHOMO_Forward_autonomous() { 
    	requires(Robot.driveSystem);
    	driveTime = 2500;
  
    }

    protected void initialize() {
    	Robot.driveSystem.robotDrive21.arcadeDrive(-5, 0);
    	RobotMap.driveSystemRobotDrive21.setMaxOutput(.5);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
		return (this.timeSinceInitialized() > (driveTime / 1000));
        
    }

    protected void end() {
    	Robot.driveSystem.robotDrive21.stopMotor();
    }

    protected void interrupted() {
    	Robot.driveSystem.robotDrive21.stopMotor();
    }
}
