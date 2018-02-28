package org.usfirst.frc4762.SPEEM4762;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//\import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotMap {

    public static WPI_TalonSRX driveSystemLeftDrive;
    public static WPI_TalonSRX driveSystemRightDrive;
    public static DifferentialDrive driveSystemRobotDrive21;
    public static WPI_TalonSRX liftElevator;
    public static WPI_TalonSRX liftElevator2;
    public static Talon cubeInjectorLeftMotor;
    public static Talon cubeInjectorRightMotor;
    public static double driveSpeed = 0.5; 
    public static double driveSpeedBoost = .8;
    
    


    public static void init() {
    	
    	WPI_TalonSRX driveSystemLeftDrive = new WPI_TalonSRX(1);
        driveSystemLeftDrive.set(0.5);
        
        WPI_TalonSRX driveSystemRightDrive = new WPI_TalonSRX(2);
        driveSystemRightDrive.set(0.5);
        
        driveSystemRobotDrive21 = new DifferentialDrive(driveSystemLeftDrive, driveSystemRightDrive);
        
        driveSystemRobotDrive21.setSafetyEnabled(true);
        driveSystemRobotDrive21.setExpiration(0.1);
        //driveSystemRobotDrive21.setSensitivity(0.5);
        driveSystemRobotDrive21.setMaxOutput(0.5);
        
       //driveSystemRobotDrive21.setInvertedMotor(DifferentialDrive.MotorType.kRearLeft, true);
        
        liftElevator = new WPI_TalonSRX(4);
        liftElevator.set(0.5);
        liftElevator.setSafetyEnabled(true);
        liftElevator.setExpiration(40);
        
        liftElevator2 = new WPI_TalonSRX(3);
        liftElevator2.set(0.5);
        
        cubeInjectorLeftMotor = new Talon(0);
        
        cubeInjectorRightMotor = new Talon(1);
        

    }
}
