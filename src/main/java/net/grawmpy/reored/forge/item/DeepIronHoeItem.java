
package net.grawmpy.reored.forge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.grawmpy.reored.forge.init.ReoredforgeModItems;

public class DeepIronHoeItem extends HoeItem {
	public DeepIronHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredforgeModItems.DEEP_IRON_INGOT.get()));
			}
		}, 0, -0.5f, new Item.Properties());
	}
}
