package com.spartronics4915.atlas.commands;

import com.spartronics4915.atlas.Logger;
import com.spartronics4915.atlas.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This command is to keep motors safety happy, and is also an example of the
 * boilerplate/logger type code you need for a command.
 */
public class StopCommand extends Command
{

    private Drivetrain mDrivetrain;

    public StopCommand()
    {
        mDrivetrain = Drivetrain.getInstance();
        requires(mDrivetrain);
    }

    @Override
    protected void initialize()
    {
        Logger.info("StopCommand initialized");
    }

    @Override
    protected void execute()
    {
        mDrivetrain.stop();
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    @Override
    protected void end()
    {
        Logger.info("StopCommand ended");
    }

    @Override
    protected void interrupted()
    {
        Logger.info("StopCommand interrupted");
    }
}
