package me.zacklukem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class RedDevPlugin extends JavaPlugin {
	
	public String serverName;
	
	public boolean isEnabled = false;
	
	//executes on enable
	@Override
	public void onEnable() {
		isEnabled = true;
		new PlayerListener(this);
	}
	
	//executes on disable
	@Override
	public void onDisable() {
		isEnabled = false;
	}
	
	//executes on command typed
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender; //makes a player form of sender
		//checks if command is /reddevtest and the sender is a player.
		if (cmd.getName().equalsIgnoreCase("reddevtest") && sender instanceof Player) {
			if (isEnabled == true) {
				player.sendMessage("Red Dev Plugin Is Enabled!");
			}else {
				player.sendMessage("Red Dev Plugin Is Not Enabled");
			}
			return true;
		} else if (cmd.getName().equalsIgnoreCase("server-name")) {
			player.sendMessage("Server name is now set to " + args[0] + ".");
			return true;
		} else if (cmd.getName().equalsIgnoreCase("trade")) {
			if (player.getInventory().contains(Material.DIAMOND)) {
				player.getInventory().remove(Material.DIAMOND);
				player.getInventory().addItem(new ItemStack(Material.EMERALD, 1));
				player.sendMessage(ChatColor.GREEN + "Nice Trading With You!");
			} else {
				player.sendMessage(ChatColor.RED + "You Dont Have Enough Diamonds!");
			}
			return true;
		}
		
		return false;
	}
}

