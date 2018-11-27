package org.usfirst.frc.team7634.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team7634.robot.RobotMap;

public class LauncherSubsystem extends Subsystem {

	Victor position = new Victor(RobotMap.VICTOR_LAUNCHER); //raise and lower mechanism
	Solenoid launcher = new Solenoid(RobotMap.LAUNCHER_PNEUMATIC); //air launcher

	/**
	 * Launch the pnuematic solenoid (for the t-shirts)
	 * @param launching to release the pnuematic (on/off)
	 *
	 * */
	public void fire(boolean launching) {
		launcher.set(launching);
	}

	public void raise() {
		position.set(0.2);
	}

	public void lower() {
		position.set(-0.2);
	}

	public void resetPos() {
		position.set(0);
	}

	@Override
	protected void initDefaultCommand() {

	}
}
