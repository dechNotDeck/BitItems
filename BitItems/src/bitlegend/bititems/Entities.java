package bitlegend.bititems;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

public class Entities {
	public static boolean isMonster(Entity entity) {
		boolean r = false;
		
		if (entity instanceof Monster)
			r = true;
		
		return r;
	}
	
	public static ItemStack getEgg(Monster monster) {
		ItemStack egg = null;
		
		if (isMonster(monster))
			egg = new ItemStack(Material.MONSTER_EGG, 1, monster.getType().getTypeId());
		
		return egg;
	}
}
