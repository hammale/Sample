package me.hammale.sample;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class sample extends JavaPlugin {

	  Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {

		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("Sample Version: " + pdfFile.getVersion() + " Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		
		
	}

}
