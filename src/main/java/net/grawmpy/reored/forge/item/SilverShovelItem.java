
package net.grawmpy.reored.forge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.grawmpy.reored.forge.init.ReoredforgeModItems;

public class SilverShovelItem extends ShovelItem {
	public SilverShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 550;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredforgeModItems.SILVER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
