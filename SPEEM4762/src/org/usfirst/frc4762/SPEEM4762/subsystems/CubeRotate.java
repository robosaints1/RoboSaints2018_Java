package org.usfirst.frc4762.SPEEM4762.subsystems;

import org.usfirst.frc4762.SPEEM4762.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CubeRotate extends Subsystem {

	public final Talon leftMotor = RobotMap.cubeInjectorLeftMotor;
    public final Talon rightMotor = RobotMap.cubeInjectorRightMotor;

    public void initDefaultCommand() {

    }
}

