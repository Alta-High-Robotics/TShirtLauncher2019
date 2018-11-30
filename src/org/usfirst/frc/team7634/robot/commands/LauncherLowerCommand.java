package org.usfirst.frc.team7634.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team7634.robot.Robot;
import org.usfirst.frc.team7634.robot.RobotMap;

public class LauncherLowerCommand extends Command {
	public LauncherLowerCommand() {
		requires(Robot.launcher);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.launcher.lower();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.launcher.stopMovement();
	}

	@Override
	protected void interrupted() {
		end();
	}

	@Override
	public void setName(String subsystem, String name) {

	}
}
