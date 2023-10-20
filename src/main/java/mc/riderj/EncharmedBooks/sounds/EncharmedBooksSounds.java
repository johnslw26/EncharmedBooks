package mc.riderj.EncharmedBooks.sounds;

import mc.riderj.EncharmedBooks.EncharmedBooks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EncharmedBooksSounds {
    public static final DeferredRegister<SoundEvent> ENCHARMED_BOOKS_SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EncharmedBooks.MODID);

    public static final RegistryObject<SoundEvent> DUCK_QUACK = ENCHARMED_BOOKS_SOUNDS.register("item_duck_toy_duck_quack", () ->
                    SoundEvent.createFixedRangeEvent(new ResourceLocation(EncharmedBooks.MODID,"item_duck_toy_duck_quack"), 1.0F)
            );

    public static void register(IEventBus eventBus){
        ENCHARMED_BOOKS_SOUNDS.register(eventBus);
    }
}
