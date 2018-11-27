/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7634.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team7634.robot.commands.LauncherFireCommand;
import org.usfirst.frc.team7634.robot.commands.LauncherLowerCommand;
import org.usfirst.frc.team7634.robot.commands.LauncherRaiseCommand;
import org.usfirst.frc.team7634.robot.controller.XboxButton;

public class OI {
	int port = RobotMap.XBOX_PORT;
	XboxController controller = new XboxController(port);

	/* change buttons with second parameter [param2] in XboxButton(param1, param2)*/
	public OI() {
		Button raise = new XboxButton(controller, XboxButton.Button.Y);
		Button lower = new XboxButton(controller, XboxButton.Button.B);
		Button launch = new XboxButton(controller, XboxButton.Button.A);

		//begin assigning buttons to actions
		raise.whileHeld(new LauncherRaiseCommand());
		lower.whileHeld(new LauncherLowerCommand());
		launch.whileHeld(new LauncherFireCommand());
	}

	public XboxController getController() {
		return controller;
	}
}
