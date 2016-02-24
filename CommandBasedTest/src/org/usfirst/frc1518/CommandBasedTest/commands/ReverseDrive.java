// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest.commands;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

/**
 *
 */
public class ReverseDrive extends Command {
	   // DriveTrain.drive.getInvertedMotor(RobotDrive.MotorType.kRearLeft);
	boolean isCompleted;


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public ReverseDrive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.isReversed == true) {
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
    		//DriveTrain.drive.tankDrive(Robot.oi.leftJoystick.getY(), Robot.oi.rightJoystick.getY());
    		Robot.isReversed = false;
    		isCompleted = true;
    		
    	}
    	else if(Robot.isReversed == false) {
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    		DriveTrain.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true); 
    		//DriveTrain.drive.tankDrive(Robot.oi.rightJoystick.getY(), Robot.oi.leftJoystick.getY());
    		Robot.isReversed = true;
    		isCompleted = true;
    		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isCompleted;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
