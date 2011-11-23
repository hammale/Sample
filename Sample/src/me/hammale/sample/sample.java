package me.hammale.sample;

import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class sample extends JavaPlugin {

	  private final SamplePlayerListener playerListener = new SamplePlayerListener(this);
	  
	  Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {

		PluginDescriptionFile pdfFile = this.getDescription();
		
		log.info("Sample Plugin Version: " + pdfFile.getVersion() + " Enabled!");
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener, Priority.Normal, this);
		
	}
	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		
		log.info("Sample Plugin Version: " + pdfFile.getVersion() + " Disabled!");
		
	}

}