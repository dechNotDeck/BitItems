package bitlegend.bititems;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import bitlegend.bititems.listeners.BIEntityListener;
import bitlegend.bititems.listeners.BIPlayerListener;

public class BitItems extends JavaPlugin {
	private final BIEntityListener entityListener = new BIEntityListener(this);
	private final BIPlayerListener playerListener = new BIPlayerListener(this);
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onEnable() {
		// Create variables
		PluginManager pm = getServer().getPluginManager();
		
		// Register events
		pm.registerEvents(this.entityListener, this);
		pm.registerEvents(this.playerListener, this);
	}
}
