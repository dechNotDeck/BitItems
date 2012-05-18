package bitlegend.bititems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Materials {
	private static Material[] armors = {
			Material.LEATHER_BOOTS, Material.LEATHER_CHESTPLATE, Material.LEATHER_HELMET, Material.LEATHER_LEGGINGS,
			Material.IRON_BOOTS, Material.IRON_CHESTPLATE, Material.IRON_HELMET, Material.IRON_LEGGINGS,
			Material.GOLD_BOOTS, Material.GOLD_CHESTPLATE, Material.GOLD_HELMET, Material.GOLD_LEGGINGS,
			Material.DIAMOND_BOOTS, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_HELMET, Material.DIAMOND_LEGGINGS };
	private static Material[] weapons = {
			Material.WOOD_SWORD, Material.STONE_SWORD, Material.IRON_SWORD, Material.GOLD_SWORD, Material.DIAMOND_SWORD,
			Material.BOW };
	private static Material[] tools = {
			Material.WOOD_AXE, Material.WOOD_HOE, Material.WOOD_PICKAXE, Material.WOOD_SPADE,
			Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SPADE,
			Material.IRON_AXE, Material.IRON_HOE, Material.IRON_PICKAXE, Material.IRON_SPADE,
			Material.GOLD_AXE, Material.GOLD_HOE, Material.GOLD_PICKAXE, Material.GOLD_SPADE,
			Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_PICKAXE, Material.DIAMOND_SPADE };
	
	public static List<ItemStack> armorList() {
		List<ItemStack> list = new ArrayList<ItemStack>();
		for (int i = 0; i < armors.length; i++)
			list.add(new ItemStack(armors[i]));
		return list;
	}
	
	public static List<ItemStack> weaponList() {
		List<ItemStack> list = new ArrayList<ItemStack>();
		for (int i = 0; i < weapons.length; i++)
			list.add(new ItemStack(weapons[i]));
		return list;
	}
	
	public static List<ItemStack> toolsList() {
		List<ItemStack> list = new ArrayList<ItemStack>();
		for (int i = 0; i < tools.length; i++)
			list.add(new ItemStack(tools[i]));
		return list;
	}
}
