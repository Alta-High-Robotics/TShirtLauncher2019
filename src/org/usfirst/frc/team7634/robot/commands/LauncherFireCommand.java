package org.usfirst.frc.team7634.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team7634.robot.Robot;
import org.usfirst.frc.team7634.robot.RobotMap;

public class LauncherFireCommand extends Command {
	public LauncherFireCommand() {
		requires(Robot.launcher);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.launcher.fire(true);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.launcher.fire(false);
	}

	@Override
	protected void interrupted() {
		end();
	}

	@Override
	public void setName(String subsystem, String name) {

	}
}
