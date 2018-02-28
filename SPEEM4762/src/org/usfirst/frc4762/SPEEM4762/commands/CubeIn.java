package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.command.Command;


public class CubeIn extends Command {

    public CubeIn() {
        requires(Robot.cubeInjector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.cubeInjectorLeftMotor.set(0.28);
    	RobotMap.cubeInjectorRightMotor.set(-0.28);
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
    	RobotMap.cubeInjectorLeftMotor.set(0);
    	RobotMap.cubeInjectorRightMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.cubeInjectorLeftMotor.set(0);
    	RobotMap.cubeInjectorRightMotor.set(0);
    }
}
