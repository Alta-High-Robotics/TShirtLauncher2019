package org.usfirst.frc.team7634.robot.commands;

import org.usfirst.frc.team7634.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team7634.robot.RobotMap;

public class DriveCommand extends Command {

	public DriveCommand() {
		requires(Robot.driveTrain);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.driveTrain.left_axis = Robot.oi.controller.getRawAxis(RobotMap.CONTROLLER_AXIS_LEFT);
		Robot.driveTrain.right_axis = Robot.oi.controller.getRawAxis(RobotMap.CONTROLLER_AXIS_RIGHT);
		Robot.driveTrain.drive();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}