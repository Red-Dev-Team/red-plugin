package me.zacklukem;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class PlayerListener implements Listener {
	
	public PlayerListener(RedDevPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onEggThrow(PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "DO NOT THROW EGGS!");
		
	}
	
	@EventHandler
	public void onBucketFill(PlayerBucketFillEvent e) {
		e.setCancelled(true);
	}
	
}
