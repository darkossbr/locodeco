
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.darkoss.locodeco.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.darkoss.locodeco.LocodecoMod;

public class LocodecoModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LocodecoMod.MODID);
	public static final DeferredItem<Item> WHITEBRASSLOCOMETAL = block(LocodecoModBlocks.WHITEBRASSLOCOMETAL);
	public static final DeferredItem<Item> WHITECOPPERLOCOMETAL = block(LocodecoModBlocks.WHITECOPPERLOCOMETAL);
	public static final DeferredItem<Item> WHITEIRONLOCOMETAL = block(LocodecoModBlocks.WHITEIRONLOCOMETAL);
	public static final DeferredItem<Item> WHITERIVETEDLOCOMETAL = block(LocodecoModBlocks.WHITERIVETEDLOCOMETAL);
	public static final DeferredItem<Item> WHITESLASHEDLOCOMETAL = block(LocodecoModBlocks.WHITESLASHEDLOCOMETAL);
	public static final DeferredItem<Item> REDBRASSLOCOMETAL = block(LocodecoModBlocks.REDBRASSLOCOMETAL);
	public static final DeferredItem<Item> REDCOPPERLOCOMETAL = block(LocodecoModBlocks.REDCOPPERLOCOMETAL);
	public static final DeferredItem<Item> REDIRONLOCOMETAL = block(LocodecoModBlocks.REDIRONLOCOMETAL);
	public static final DeferredItem<Item> REDRIVETEDLOCOMETAL = block(LocodecoModBlocks.REDRIVETEDLOCOMETAL);
	public static final DeferredItem<Item> REDSLASHEDLOCOMETAL = block(LocodecoModBlocks.REDSLASHEDLOCOMETAL);
	public static final DeferredItem<Item> BLACKBRASSLOCOMETAL = block(LocodecoModBlocks.BLACKBRASSLOCOMETAL);
	public static final DeferredItem<Item> BLACKCOPPERLOCOMETAL = block(LocodecoModBlocks.BLACKCOPPERLOCOMETAL);
	public static final DeferredItem<Item> BLACKIRONLOCOMETAL = block(LocodecoModBlocks.BLACKIRONLOCOMETAL);
	public static final DeferredItem<Item> BLACKRIVETEDLOCOMETAL = block(LocodecoModBlocks.BLACKRIVETEDLOCOMETAL);
	public static final DeferredItem<Item> BLACKSLASHEDLOCOMETAL = block(LocodecoModBlocks.BLACKSLASHEDLOCOMETAL);
	public static final DeferredItem<Item> COPPERCLEARGLASS = block(LocodecoModBlocks.COPPERCLEARGLASS);
	public static final DeferredItem<Item> COPPERGLASS = block(LocodecoModBlocks.COPPERGLASS);
	public static final DeferredItem<Item> BRASSGLASS = block(LocodecoModBlocks.BRASSGLASS);
	public static final DeferredItem<Item> BRASSCLEARGLASS = block(LocodecoModBlocks.BRASSCLEARGLASS);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
