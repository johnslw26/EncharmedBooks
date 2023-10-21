package mc.riderj.EncharmedBooks.world.items;

import mc.riderj.EncharmedBooks.EncharmedBooks;
import mc.riderj.EncharmedBooks.sounds.EncharmedBooksSounds;
import net.minecraft.core.Holder;
import net.minecraft.data.tags.InstrumentTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.Instruments;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EncharmedBooks.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUCK_TOY = ITEMS.register("duck_toy", () -> new DuckyToyInstrumentItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
