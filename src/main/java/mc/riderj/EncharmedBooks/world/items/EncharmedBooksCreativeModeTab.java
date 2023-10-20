package mc.riderj.EncharmedBooks.world.items;

import mc.riderj.EncharmedBooks.EncharmedBooks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class EncharmedBooksCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,EncharmedBooks.MODID);

    public static final RegistryObject<CreativeModeTab> ENCHARMEDBOOKS_TAB = CREATIVE_MODE_TAB.register("enchantedbooks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.DUCK_TOY.get()))
                    .title(Component.translatable("creativetab.encharmedbooks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModdedItems.TEST_ITEM.get());
                        pOutput.accept(ModdedItems.DUCK_TOY.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
