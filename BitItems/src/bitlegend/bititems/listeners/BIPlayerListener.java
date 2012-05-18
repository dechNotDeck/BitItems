package bitlegend.bititems.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import bitlegend.bititems.BitItems;

public class BIPlayerListener implements Listener {
	@SuppressWarnings("unused")
	private BitItems plugin;
	
	public BIPlayerListener(BitItems plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
	}
}
