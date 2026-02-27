package de.andreashiller.ahdecraft.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ConversionBall extends Item {
    public ConversionBall(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        if(stack.getMaxDamage() <= 0) {
            return ItemStack.EMPTY;
        }

        ItemStack remainder = stack.copy();
        remainder.setDamage(remainder.getDamage() + 1);

        if(remainder.getDamage() >= remainder.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return remainder;
    }
}
