/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7634.robot;

/**
 * RobotMap is used for mapping the individual motors. Advantages are quick swapping of motor IDs.
 */
public class RobotMap {
    public static final int
        XBOX_PORT = 1,

        //drive train
        TALON_RIGHT1 = 0,
        TALON_RIGHT2 = 1,
        VICTOR_LEFT1 = 4,
        VICTOR_LEFT2 = 5,

        //controller axis for drive train
        CONTROLLER_AXIS_LEFT = 1,
        CONTROLLER_AXIS_RIGHT = 5,

        //t-shirt launcher
        LAUNCHER_PNEUMATIC = 0,
        VICTOR_LAUNCHER = 2;
}
