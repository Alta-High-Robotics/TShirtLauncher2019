
package org.usfirst.frc.team7634.robot.subsystems;

import org.usfirst.frc.team7634.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubsystem extends Subsystem {
	
	Talon right1 = new Talon(0);
	Talon right2 = new Talon(1);
	Victor left1 = new Victor(4);
	Victor left2 = new Victor(5);
	
	//groups both motors as one drive, both motors required for movement
	public static SpeedControllerGroup rightSideDrive = new SpeedControllerGroup(right1, right2);
	public static SpeedControllerGroup leftSideDrive = new SpeedControllerGroup(left1, left2);
	
	public void drive() {
		
	}
	
	@Override
	public void initDefaultCommand() {
		this.setDefaultCommand(new DriveCommand());
	}
}
