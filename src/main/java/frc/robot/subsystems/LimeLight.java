// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.models.TargetPos;

public class LimeLight extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public LimeLight() {}

  public TargetPos getCurrentTargetPos()
  {
      // TODO: Modify to return a TargetPos based on current readings from the limelight.
      // See: https://docs.limelightvision.io/en/latest/getting_started.html#basic-programming
     return new TargetPos(0.0,0.0,0.0);
  }

  public void setVisionProcessing(){
    // TODO: Set the Limelight's camMode to Vision processor.
    // TODO: Set the ledMode to on.
    // See: https://docs.limelightvision.io/en/latest/networktables_api.html
  }

  public void setTeleopDriving() {
    // TODO: Set the Limelight's camMode to 'Driver Camera'.
    // TODO: set the ledMode to off.
    // See: https://docs.limelightvision.io/en/latest/networktables_api.html
  }

  @Override
  public void periodic() {
    // TODO: Use  Vision.CurrentTargetPos(); to get the current position of the target.
    // Display the values on the smart dashboard. See: 
    // https://first.wpi.edu/FRC/roborio/release/docs/java/edu/wpi/first/wpilibj/smartdashboard/SmartDashboard.html

  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
