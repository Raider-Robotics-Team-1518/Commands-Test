package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.vision.AxisCamera;

public class Optics extends Subsystem {

	public static final Image frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_HSL, 0);
	public static final AxisCamera cam1 = RobotMap.axisCam1;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	
cam1.getImage(frame);
CameraServer.getInstance().setImage(frame);
		
	}

}
