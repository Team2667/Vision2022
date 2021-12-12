package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LimeLight;

public class LLVisionCamera extends CommandBase{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final LimeLight limeLight;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public LLVisionCamera(LimeLight subsystem) {
      limeLight = subsystem;
      addRequirements(subsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      //TODO: Set the camera for Vision Processing
      //TODO: Set the smart dashboard camMode to "Vision"
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        //TODO: Get the current target position and display x, y and area in the smart dashboard.
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
