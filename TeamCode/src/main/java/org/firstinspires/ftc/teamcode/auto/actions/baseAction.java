package org.firstinspires.ftc.teamcode.auto.actions;

public interface baseAction {
    default void start(){}
    default void update(){}
    default void done(){}
    default boolean isFinished() { return true;}


}
