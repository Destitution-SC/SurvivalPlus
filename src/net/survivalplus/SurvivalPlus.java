package net.survivalplus;

import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalPlus extends JavaPlugin {

    private static SurvivalPlus instance;

    @Override
    public void onEnable() {

        instance = this;

    }

    @Override
    public void onDisable() {

        instance = null;

    }

    /**
     * Used in other classes to access the {@link SurvivalPlus} class.
     *
     * @return instance
     */
    public static SurvivalPlus getInstance() {
        return instance;
    }
}