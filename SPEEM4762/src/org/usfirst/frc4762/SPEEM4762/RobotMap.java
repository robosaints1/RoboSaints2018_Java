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
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

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
    public static CANTalon driveSystemLeftDrive;
    public static CANTalon driveSystemRightDrive;
    public static RobotDrive driveSystemRobotDrive21;
    public static SpeedController liftElevator;
    public static SpeedController cubeInjectorLeftMotor;
    public static SpeedController cubeInjectorRightMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystemLeftDrive = new CANTalon(0);
        LiveWindow.addActuator("DriveSystem", "Left Drive", driveSystemLeftDrive);
        
        driveSystemRightDrive = new CANTalon(2);
        LiveWindow.addActuator("DriveSystem", "Right Drive", driveSystemRightDrive);
        
        driveSystemRobotDrive21 = new RobotDrive(driveSystemLeftDrive, driveSystemRightDrive);
        
        driveSystemRobotDrive21.setSafetyEnabled(true);
        driveSystemRobotDrive21.setExpiration(0.1);
        driveSystemRobotDrive21.setSensitivity(0.5);
        driveSystemRobotDrive21.setMaxOutput(1.0);
        driveSystemRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        liftElevator = new Spark(2);
        LiveWindow.addActuator("Lift", "Elevator", (Spark) liftElevator);
        
        cubeInjectorLeftMotor = new Talon(3);
        LiveWindow.addActuator("Cube Injector", "Left Motor", (Talon) cubeInjectorLeftMotor);
        
        cubeInjectorRightMotor = new Talon(4);
        LiveWindow.addActuator("Cube Injector", "Right Motor", (Talon) cubeInjectorRightMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}