package me.zacklukem;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerListener implements Listener {
	
	public PlayerListener(RedDevPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	/*@EventHandler
	public void onEggThrow(PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "DO NOT THROW EGGS!");
		
	}  Removed-Keep For Reference*/
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent e) {
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.GREEN + "Welcome to The Red Creeper!");
	}
	
}
