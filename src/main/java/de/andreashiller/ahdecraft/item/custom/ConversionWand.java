package de.andreashiller.ahdecraft.item.custom;

import de.andreashiller.ahdecraft.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ConversionWand extends Item {

    private Block selBlock;
    private int workingGrid;

    private static final Map<Block, Block> WAND_MAP =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.GRASS_BLOCK, Blocks.DIRT,
                    Blocks.OAK_LOG, ModBlocks.PERIDOT_BLOCK,
                    Blocks.GOLD_BLOCK, Blocks.NETHERITE_BLOCK

            );

    public ConversionWand(Settings settings) {

        super(settings);
        selBlock = Blocks.AIR;
        workingGrid = 0;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        PlayerEntity player = context.getPlayer();

       //if(WAND_MAP.containsKey(clickedBlock)) {
            if(!world.isClient() && !player.isSneaking()) {
                // CHANGE THE BLOCK YOU CLICKED ON
                world.setBlockState(context.getBlockPos(), getSelBlock().getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

            }

            else if(!world.isClient() && player.isSneaking()) {
                setSelBlock(world.getBlockState(context.getBlockPos()).getBlock());
            }

            else {
                //doo Nothing
            }
        //}

        return ActionResult.SUCCESS;
    }

    public Block getSelBlock() {
        return selBlock;
    }

    public int getWorkingGrid() {
        return workingGrid;
    }

    public void setWorkingGrid(int workingGrid) {
        this.workingGrid = workingGrid;
    }

    public void setSelBlock(Block selBlock) {
        this.selBlock = selBlock;
    }

}
