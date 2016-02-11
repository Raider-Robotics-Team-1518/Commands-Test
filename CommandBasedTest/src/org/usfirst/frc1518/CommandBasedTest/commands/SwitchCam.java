package org.usfirst.frc1518.CommandBasedTest.commands;

import edu.wpi.first.wpilibj.command.Command;

public class SwitchCam extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (Optics.camSelect2) {
			Optics.camSelect2 = false;
		}
		else {
		Optics.camSelect2 = true;
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
