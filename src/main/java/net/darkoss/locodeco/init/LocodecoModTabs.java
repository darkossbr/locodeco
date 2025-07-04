
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.darkoss.locodeco.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.darkoss.locodeco.LocodecoMod;

public class LocodecoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LocodecoMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOCO_DECO = REGISTRY.register("loco_deco",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.locodeco.loco_deco")).icon(() -> new ItemStack(LocodecoModBlocks.BLACKBRASSLOCOMETAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LocodecoModBlocks.WHITEBRASSLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.WHITECOPPERLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.WHITEIRONLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.WHITERIVETEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.WHITESLASHEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.REDBRASSLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.REDCOPPERLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.REDIRONLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.REDRIVETEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.REDSLASHEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.BLACKBRASSLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.BLACKCOPPERLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.BLACKIRONLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.BLACKRIVETEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.BLACKSLASHEDLOCOMETAL.get().asItem());
				tabData.accept(LocodecoModBlocks.COPPERCLEARGLASS.get().asItem());
				tabData.accept(LocodecoModBlocks.COPPERGLASS.get().asItem());
				tabData.accept(LocodecoModBlocks.BRASSGLASS.get().asItem());
				tabData.accept(LocodecoModBlocks.BRASSCLEARGLASS.get().asItem());
			}).withSearchBar().build());
}
