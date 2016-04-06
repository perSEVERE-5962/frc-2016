package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManualBreakGravityMotors extends Command {

	public ManualBreakGravityMotors() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.inTake);

		setTimeout(.9);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.inTake.stop();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
