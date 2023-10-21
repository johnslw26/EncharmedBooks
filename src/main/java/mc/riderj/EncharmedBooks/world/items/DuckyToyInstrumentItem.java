package mc.riderj.EncharmedBooks.world.items;


import mc.riderj.EncharmedBooks.sounds.EncharmedBooksSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class DuckyToyInstrumentItem extends Item {


    public DuckyToyInstrumentItem(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        if (!pPlayer.getCooldowns().isOnCooldown(this)) {
            pLevel.playSound(
                    null,
                    pPlayer.getOnPos(),
                    EncharmedBooksSounds.DUCK_QUACK.get(),
                    SoundSource.BLOCKS,
                    1.0F,
                    new Random().nextFloat(-0.1F,0.25F) + 1.0F
                    );

            pPlayer.getCooldowns().addCooldown(this, 30);
        }
        return InteractionResultHolder.pass(itemstack);
    }
}
