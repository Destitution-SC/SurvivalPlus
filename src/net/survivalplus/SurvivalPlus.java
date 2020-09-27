package net.survivalplus;

import net.survivalplus.commands.Commanddisposal;
import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalPlus extends JavaPlugin {

    private static SurvivalPlus instance;

    @Override
    public void onEnable() {

        instance = this;
        registerCommands(); // Loads commands, when the plugin starts.

    }

    @Override
    public void onDisable() {

        instance = null;
        // This is a test for the GitHub API.
        // OK LETS SEE IF
        // IT WILL WORK
        // OK

    }

    /**
     * Registers commands.
     */
    private void registerCommands() {

        getCommand("disposal").setExecutor(new Commanddisposal());

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
