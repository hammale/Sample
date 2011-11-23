package me.hammale.sample;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class SamplePlayerListener extends PlayerListener {
    
    public final sample plugin;
	
	        public SamplePlayerListener(sample plugin)
	        {
	          this.plugin = plugin;
	        }
	        
	        public void onPlayerJoin(PlayerJoinEvent event){
	        	Player player = event.getPlayer();
	        	event.setJoinMessage(ChatColor.YELLOW + "Welcome to the server " + player.getName() + "!");
	        }      
}