/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Items.Tools.Bedrock;

import net.minecraft.item.ItemStack;
import Reika.DragonAPI.ASM.APIStripper.Strippable;
import Reika.RotaryCraft.Base.ItemRotaryTool;
import codechicken.microblock.Saw;

@Strippable(value = {"codechicken.microblock.Saw"})
public class ItemBedrockSaw extends ItemRotaryTool implements Saw {

	public ItemBedrockSaw(int index) {
		super(index);
		this.setContainerItem(this);
	}

	@Override
	public int getMaxCuttingStrength() {
		return 5;
	}

	public int getCuttingStrength() {
		return this.getMaxCuttingStrength();
	}

	@Override
	public int getCuttingStrength(ItemStack stack) {
		return this.getMaxCuttingStrength();
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack is)
	{
		return false;
	}

}
