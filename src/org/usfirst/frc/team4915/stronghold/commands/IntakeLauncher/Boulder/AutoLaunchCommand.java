package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher.Boulder;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoLaunchCommand extends CommandGroup {
    
    public  AutoLaunchCommand() {
        addSequential(new LaunchBallForAutoCommand());
        addSequential(new WaitCommand(.5));
        addSequential(new RetractLauncherServosCommand());
        addSequential(new StopWheelsCommand());
    }
}
