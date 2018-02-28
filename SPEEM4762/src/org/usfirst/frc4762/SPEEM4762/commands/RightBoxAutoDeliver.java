package org.usfirst.frc4762.SPEEM4762.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightBoxAutoDeliver extends CommandGroup {

    public RightBoxAutoDeliver() {
        // Logan's Guide: Using this Command Group it puts commands in an order in which to
    	// do them... here we first call our command to go straight, turn... lift up and move
    	// move forward and put the cube in
    	addSequential(new Straight_NOHOMO_Forward_autonomous());
    	addSequential(new AutoTurnRight());
    	addSequential(new ForwardABit());
    	
    	
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
