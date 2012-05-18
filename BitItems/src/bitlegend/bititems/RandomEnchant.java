package bitlegend.bititems;

import org.bukkit.enchantments.Enchantment;

public class RandomEnchant {
	public static Enchantment getRandomEnchantment() {
		int i = (int)(Math.random() * 21) + 1;
		Enchantment enchant = null;
		
		switch (i) {
			case 1:
				enchant = Enchantment.ARROW_DAMAGE;
				break;
			case 2:
				enchant = Enchantment.ARROW_FIRE;
				break;
			case 3:
				enchant = Enchantment.ARROW_INFINITE;
				break;
			case 4:
				enchant = Enchantment.ARROW_KNOCKBACK;
				break;
			case 5:
				enchant = Enchantment.DAMAGE_ALL;
				break;
			case 6:
				enchant = Enchantment.DAMAGE_ARTHROPODS;
				break;
			case 7:
				enchant = Enchantment.DAMAGE_UNDEAD;
				break;
			case 8:
				enchant = Enchantment.DIG_SPEED;
				break;
			case 9:
				enchant = Enchantment.DURABILITY;
				break;
			case 10:
				enchant = Enchantment.FIRE_ASPECT;
				break;
			case 11:
				enchant = Enchantment.KNOCKBACK;
				break;
			case 12:
				enchant = Enchantment.LOOT_BONUS_BLOCKS;
				break;
			case 13:
				enchant = Enchantment.LOOT_BONUS_MOBS;
				break;
			case 14:
				enchant = Enchantment.OXYGEN;
				break;
			case 15:
				enchant = Enchantment.PROTECTION_ENVIRONMENTAL;
				break;
			case 16:
				enchant = Enchantment.PROTECTION_EXPLOSIONS;
				break;
			case 17:
				enchant = Enchantment.PROTECTION_FALL;
				break;
			case 18:
				enchant = Enchantment.PROTECTION_FIRE;
				break;
			case 19:
				enchant = Enchantment.PROTECTION_PROJECTILE;
				break;
			case 20:
				enchant = Enchantment.SILK_TOUCH;
				break;
			case 21:
				enchant = Enchantment.WATER_WORKER;
				break;
		}
		
		return enchant;
	}

	public static int getRandomEnchantmentLevel(int max) {
		return (int)(Math.random() * max) + 1;
	}
}
