package net.survivalplus.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Represent the /disposal command.
 *
 * Removes stuff from your inventory forever.
 */
public class Commanddisposal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // Checks if the sender is the console.
        if(!(sender instanceof Player)) sender.sendMessage("§cError: §6You must be a player to use this command.");
        else { // sender is player.
            Player player = (Player) sender; // gets the player from the sender.
            if(!player.hasPermission("SurvivalPlus.disposal")) {
                Inventory inv = Bukkit.createInventory(null, 54, Component.text("§4Disposal")); // creates the inventory.
                player.sendMessage("§cWarning: §6Everything you put in here will disappear forever!"); // warn the player with a message.
                player.openInventory(inv); // opens the inventory for the player.
            } else player.sendMessage("§cYou do not have access to that command.");
        }
        return true;
    }
}