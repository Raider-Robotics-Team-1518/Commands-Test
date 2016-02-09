package org.usfirst.frc1518.CommandBasedTest.commands;


import edu.wpi.first.wpilibj.command.*;

public class Autonomous extends CommandGroup {
	public Autonomous() {
		addSequential(new Forward());
	}
}
