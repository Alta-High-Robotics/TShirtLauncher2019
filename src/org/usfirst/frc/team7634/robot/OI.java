/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7634.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	XboxController controller = new XboxController(1);
	
	public void initButton(JoystickButton button, Joystick js, int buttonNum, Command cmd) {
		button = new JoystickButton(js, buttonNum);
		button.whenPressed(cmd);
	}
}

// Joystick stick = new Joystick(port);
// Button button = new JoystickButton(stick, buttonNumber);
// button.whenPressed(new ExampleCommand());
// button.whileHeld(new ExampleCommand());
// button.whenReleased(new ExampleCommand());