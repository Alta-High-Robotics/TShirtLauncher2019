package org.usfirst.frc.team7634.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team7634.robot.RobotMap;
import org.usfirst.frc.team7634.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubsystem extends Subsystem {
	
	Victor left1 = new Victor(RobotMap.VICTOR_LEFT1);
	Victor left2 = new Victor(RobotMap.VICTOR_LEFT2);
	Talon right1 = new Talon(RobotMap.TALON_RIGHT1);
	Talon right2 = new Talon(RobotMap.TALON_RIGHT2);

	//groups both motors as one drive, both motors required for movement
	public SpeedControllerGroup leftSideDrive = new SpeedControllerGroup(left1, left2);
	public SpeedControllerGroup rightSideDrive = new SpeedControllerGroup(right1, right2);
	public DifferentialDrive drive = new DifferentialDrive(leftSideDrive, rightSideDrive);

	public double left_axis = 0.0, right_axis = 0.0;

	public void drive() {
		drive.tankDrive(left_axis, right_axis);
	}
	
	@Override
	public void initDefaultCommand() {
		this.setDefaultCommand(new DriveCommand());
	}
}
