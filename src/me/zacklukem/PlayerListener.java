package me.zacklukem;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

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
	public void onPlayerLogin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		if (player.hasPlayedBefore() == false) {
			e.setJoinMessage(ChatColor.AQUA + "Welcome, " + player.getName() + " to the server!");
		}
	}
	 
	
}
