// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4762.SPEEM4762;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveSystemLeftDrive;
    public static WPI_TalonSRX driveSystemRightDrive;
    public static DifferentialDrive driveSystemRobotDrive21;
    public static WPI_TalonSRX liftElevator;
    public static WPI_TalonSRX liftElevator2;
    public static SpeedController cubeInjectorLeftMotor;
    public static SpeedController cubeInjectorRightMotor;
    public static double driveSpeed = 0.5; 
    public static double driveSpeedBoost = .8;
    
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	WPI_TalonSRX driveSystemLeftDrive = new WPI_TalonSRX(1);
        driveSystemLeftDrive.set(0.5);
        LiveWindow.addActuator("DriveSystem", "Left Drive", driveSystemLeftDrive);
        
        WPI_TalonSRX driveSystemRightDrive = new WPI_TalonSRX(2);
        driveSystemRightDrive.set(0.5);
        LiveWindow.addActuator("DriveSystem", "Right Drive", driveSystemRightDrive);
        
        driveSystemRobotDrive21 = new DifferentialDrive(driveSystemLeftDrive, driveSystemRightDrive);
        
        driveSystemRobotDrive21.setSafetyEnabled(true);
        driveSystemRobotDrive21.setExpiration(0.1);
        //driveSystemRobotDrive21.setSensitivity(0.5);
        driveSystemRobotDrive21.setMaxOutput(0.5);
        
       //driveSystemRobotDrive21.setInvertedMotor(DifferentialDrive.MotorType.kRearLeft, true);
        
        liftElevator = new WPI_TalonSRX(3);
        liftElevator.set(0.5);
        LiveWindow.addActuator("Lift", "Elevator", (WPI_TalonSRX) liftElevator);
        
        liftElevator2 = new WPI_TalonSRX(4);
        liftElevator2.set(0.5);
        LiveWindow.addActuator("Lift", "Elevator", (WPI_TalonSRX) liftElevator);
        
        cubeInjectorLeftMotor = new Talon(5);
        LiveWindow.addActuator("Cube Injector", "Left Motor", (Talon) cubeInjectorLeftMotor);
        
        cubeInjectorRightMotor = new Talon(6);
        LiveWindow.addActuator("Cube Injector", "Right Motor", (Talon) cubeInjectorRightMotor);
        
        //drive.

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
