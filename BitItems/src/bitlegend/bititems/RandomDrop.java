package bitlegend.bititems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class RandomDrop {
	private int[] globalDrops = { 263, 50, 287, 288, 295, 260, 318, 338, 360, 374, 382 };
	private int[] woodDrops = { 268, 269, 270, 271, 280, 290 };
	private int[] leatherDrops = { 298, 299, 300, 301, 334 };
	private int[] stoneDrops = { 272, 273, 274, 275, 291 };
	private int[] ironDrops = { 265, 256, 257, 258, 259, 267, 306, 307, 308, 309, 292, 325 };
	private int[] goldDrops = { 266, 314, 315, 316, 317, 283, 284, 285, 286, 294, 322, 348 };
	private int[] diamondDrops = { 264, 276, 277, 278, 279, 310, 311, 312, 313 };

	public RandomDrop() {
		
	}
	
	public int getDrop() {
		int r = -1;
		List<ItemStack> drops = new ArrayList<ItemStack>();
		if (((int) (Math.random() * 1000) + 1) % 2 == 0) { // Global drops; 33%
			for (int i = 0; i < globalDrops.length; i++)
				drops.add(new ItemStack(globalDrops[i]));
			if (((int) (Math.random() * 1000) + 1) % 6 == 0) { // Tier 1 drops: wood, leather; 16%
				for (int i = 0; i < woodDrops.length; i++)
					drops.add(new ItemStack(woodDrops[i]));
				for (int i = 0; i < leatherDrops.length; i++)
					drops.add(new ItemStack(stoneDrops[i]));
			}
			if (((int) (Math.random() * 1000) + 1) % 14 == 0) // Tier 2 drops: stone; 7%
				for (int i = 0; i < globalDrops.length; i++)
					drops.add(new ItemStack(globalDrops[i]));
			if (((int) (Math.random() * 1000) + 1) % 42 == 0) // Tier 3 drops: iron; 2.38%
				for (int i = 0; i < ironDrops.length; i++)
					drops.add(new ItemStack(ironDrops[i]));
			if (((int) (Math.random() * 1000) + 1) % 78 == 0) { // Tier 4 drops: gold, diamond; 1.28%
				for (int i = 0; i < goldDrops.length; i++)
					drops.add(new ItemStack(goldDrops[i]));
				for (int i = 0; i < diamondDrops.length; i++)
					drops.add(new ItemStack(diamondDrops[i]));
			}
		}
		
		if (drops.size() > 0) {
			r = ((int)(Math.random() * drops.size() - 1) + 1);
			r = drops.get(r).getTypeId();
		}
		return r;
	}
	
	public int getCount(ItemStack item) {
		int count = 1;
		if (item.getData().getItemType().getMaxStackSize() > 1)
			count = (int)(Math.random() * 4) + 1;
		return count;
	}
}
