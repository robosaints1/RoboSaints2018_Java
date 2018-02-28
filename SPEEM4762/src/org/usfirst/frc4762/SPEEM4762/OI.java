package org.usfirst.frc4762.SPEEM4762;

import org.usfirst.frc4762.SPEEM4762.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
//import org.usfirst.frc4762.SPEEM4762.subsystems.*;



public class OI {
    
	Joystick Joystick = new Joystick(0);
	Button buttonA = new JoystickButton(Joystick, 1),
			buttonB = new JoystickButton(Joystick, 2),
			buttonX = new JoystickButton(Joystick, 3),
			buttonY = new JoystickButton(Joystick, 4),
			buttonLB = new JoystickButton(Joystick, 5),
			buttonRB = new JoystickButton(Joystick, 6),
			buttonBack = new JoystickButton(Joystick, 7),
			buttonStart = new JoystickButton(Joystick, 8),
			buttonLeftDown = new JoystickButton(Joystick, 9),
			buttonRightDown = new JoystickButton(Joystick, 10);


    public OI() {
        
    	buttonA.whileHeld(new LiftUp());
    	buttonX.whileHeld(new LiftDown());
    	buttonB.whileHeld(new CubeIn());
    	buttonY.whileHeld(new CubeOut());
    	buttonLeftDown.whileHeld(new Boost_de_boost());
    	buttonRB.whileHeld(new CubeRotateRight());
    	buttonLB.whileHeld(new CubeRotateLeft());
    	
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousCommand", new Straight_NOHOMO_Forward_autonomous());
        SmartDashboard.putData("JoystickDrive", new JoystickDrive());
        SmartDashboard.putData("Lift Up", new LiftUp());
        SmartDashboard.putData("Lift Down", new LiftDown());


    }

    public Joystick getDriveJoystick() {
        return Joystick;
    }

}

