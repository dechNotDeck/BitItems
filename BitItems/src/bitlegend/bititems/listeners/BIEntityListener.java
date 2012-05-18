package bitlegend.bititems.listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import bitlegend.bititems.*;

public class BIEntityListener implements Listener {
	@SuppressWarnings("unused")
	private BitItems plugin;
	
	public BIEntityListener(BitItems plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {
		RandomDrop rd = new RandomDrop();
		int itemCode = rd.getDrop();
		if (itemCode != -1) {
			ItemStack item = new ItemStack(itemCode);
			item.setAmount(rd.getCount(item));
			
			// Check item against lists to see if it can be enchanted
			if (Materials.armorList().contains(item.getData().getItemType()) ||
				Materials.weaponList().contains(item.getData().getItemType()) ||
				Materials.toolsList().contains(item.getData().getItemType())) {
				
				if (((int)(Math.random() * 1000) + 1) % 22 == 0) { // 4.5% chance of enchant
					try {
						Enchantment enchant = RandomEnchant.getRandomEnchantment();
						item.addEnchantment(enchant, RandomEnchant.getRandomEnchantmentLevel(enchant.getMaxLevel()));
					} catch (Exception e) {
						// Improper enchantment applied, ignored
					}
				}
			}
			
			// Very, very low chance (1.6%) for MONSTERS to drop an egg of their type
			if (Entities.isMonster(event.getEntity()))
				if (((int)(Math.random() * 1000) + 1) % 62 == 0) {
					Monster monster = (Monster)event.getEntity();
					event.getDrops().add(Entities.getEgg(monster));
				}
			
			event.getDrops().add(item);
		}
	}
}
