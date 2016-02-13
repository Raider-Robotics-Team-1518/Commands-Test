// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest.subsystems;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.commands.*;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc1518.CommandBasedTest.subsystems.Rangefinder;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Encoder;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final static TalonSRX rearLeftDrive = RobotMap.driveTrainRearLeftDrive;
    public final static TalonSRX rearRightDrive = RobotMap.driveTrainRearRightDrive;
    public final static TalonSRX frontLeftDrive = RobotMap.driveTrainFrontLeftDrive;
    public final static TalonSRX frontRightDrive = RobotMap.driveTrainFrontRightDrive;
    public static RobotDrive drive;
    public static Encoder rearLeftEncoder = RobotMap.driveTrainRearLeftEncoder;
   
   
    
    
    public DriveTrain() {
    	super();
    	drive = new RobotDrive(frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive);
    	
    	
    	
    }
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public void drive(double leftJoystick, double rightJoystick) {
    	drive.tankDrive(leftJoystick, rightJoystick);
    	drive.setMaxOutput(1);
    }


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Drive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

