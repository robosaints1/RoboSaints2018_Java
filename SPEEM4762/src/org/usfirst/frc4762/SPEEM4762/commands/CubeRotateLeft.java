package org.usfirst.frc4762.SPEEM4762.commands;

import org.usfirst.frc4762.SPEEM4762.Robot;
import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.command.Command;


public class CubeRotateLeft extends Command {

    public CubeRotateLeft() {
        requires(Robot.cubeRotate);
    }

    protected void initialize() {
    	RobotMap.cubeInjectorLeftMotor.set(0.6);
    	RobotMap.cubeInjectorRightMotor.set(-0.2);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	RobotMap.cubeInjectorLeftMotor.set(0);
    	RobotMap.cubeInjectorRightMotor.set(0);
    }

    protected void interrupted() {
    	RobotMap.cubeInjectorLeftMotor.set(0);
    	RobotMap.cubeInjectorRightMotor.set(0);
    }
}
