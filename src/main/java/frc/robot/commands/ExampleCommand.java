package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ExampleCommand extends Command {
  public ExampleCommand() {
    requires(Robot.m_subsystem);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
