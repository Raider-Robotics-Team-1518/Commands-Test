package org.usfirst.frc1518.CommandBasedTest.subsystems;


import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.Robot;


import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.vision.AxisCamera;
import edu.wpi.first.wpilibj.vision.USBCamera;

public class Optics extends Subsystem {

	public static final Image frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_HSL, 0);
	public static final AxisCamera cam1 = RobotMap.axisCam1;
	public static final USBCamera cam2 = RobotMap.webCam1;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	if (Robot.camSelect2) {
		cam2.getImage(frame); 
	}
	else {
		cam2.getImage(frame);
	}
	CameraServer.getInstance().setImage(frame);
	}

}
