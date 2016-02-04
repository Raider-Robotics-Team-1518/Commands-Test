// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Servo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Servo launcherLeftServo;
    public static TalonSRX launcherBottomWheels;
    public static TalonSRX launcherTopWheels;
    public static Servo launcherRightServo;
    public static TalonSRX driveTrainRearLeftDrive;
    public static TalonSRX driveTrainRearRightDrive;
    public static TalonSRX driveTrainFrontLeftDrive;
    public static TalonSRX driveTrainFrontRightDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        launcherLeftServo = new Servo(9);
        LiveWindow.addActuator("Fangs", "Left Servo", launcherLeftServo);
        
        launcherBottomWheels = new TalonSRX(5);
        LiveWindow.addActuator("Launcher", "Bottom Wheels", launcherBottomWheels);
        
        launcherTopWheels = new TalonSRX(4);
        LiveWindow.addActuator("Launcher", "Top Wheels", launcherTopWheels);
        
        launcherRightServo = new Servo(8);
        LiveWindow.addActuator("Fangs", "Right Servo", launcherRightServo);
        
        driveTrainRearLeftDrive = new TalonSRX(0);
        LiveWindow.addActuator("DriveTrain", "Rear Left Drive", driveTrainRearLeftDrive);
        
        driveTrainRearRightDrive = new TalonSRX(1);
        LiveWindow.addActuator("DriveTrain", "Rear Right Drive", driveTrainRearRightDrive);
        
        driveTrainFrontLeftDrive = new TalonSRX(2);
        LiveWindow.addActuator("DriveTrain", "Front Left Drive", driveTrainFrontLeftDrive);
        
        driveTrainFrontRightDrive = new TalonSRX(3);
        LiveWindow.addActuator("DriveTrain", "Front Right Drive", driveTrainFrontRightDrive);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}