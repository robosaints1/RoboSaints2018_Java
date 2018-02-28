package org.usfirst.frc4762.SPEEM4762;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4762.SPEEM4762.commands.*;
import org.usfirst.frc4762.SPEEM4762.subsystems.*;

import edu.wpi.first.wpilibj.CameraServer;

public class Robot extends IterativeRobot {

    Command autonomousCommand;
    SendableChooser autoChooser;

    public static OI oi;
    public static DriveSystem driveSystem;
    public static Lift lift;
    public static CubeInjector cubeInjector;
    public static CubeRotate cubeRotate;
    

    public void robotInit() {
    RobotMap.init();
        driveSystem = new DriveSystem();
        lift = new Lift();
        cubeInjector = new CubeInjector();
        cubeRotate = new CubeRotate();
        CameraServer.getInstance().startAutomaticCapture();
        

        oi = new OI();

        
        autoChooser = new SendableChooser();
        autoChooser.addDefault("Forward+NothingElse", new Straight_NOHOMO_Forward_autonomous());
        autoChooser.addObject("Forward+RightCube", new RightBoxAutoDeliver());
        SmartDashboard.putData("Autonomous mode chooser", autoChooser);
    
	}

	

	public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        
    }

    public void autonomousInit() {
    	autonomousCommand = (Command) autoChooser.getSelected();
    	autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
