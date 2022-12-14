package com.brecht.fac.item.custom;
import com.brecht.fac.entity.projectile.LightningballEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

import net.minecraft.world.item.Item.Properties;

public class LightningTomeItem extends Item {

    public LightningTomeItem(Properties builderIn) {
        super(builderIn);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack heldStack = playerIn.getItemInHand(handIn);
        Random rn = new Random();

        //if (!worldIn.isClientSide) return new InteractionResultHolder<>(InteractionResult.PASS, heldStack);

        float xA = (float) (-Math.sin(playerIn.getYHeadRot() * ((float) Math.PI / 180F)) * Math.cos(playerIn.getXRot() * ((float) Math.PI / 180F)));
        float yA = (float) -Math.sin(playerIn.getXRot() * ((float) Math.PI / 180F));
        float zA = (float) (Math.cos(playerIn.getYHeadRot() * ((float) Math.PI / 180F)) * Math.cos(playerIn.getXRot() * ((float) Math.PI / 180F)));

        LightningballEntity projectile = new LightningballEntity(EntityType.FIREBALL, xA, yA, zA, 0, 0,0,worldIn);
        projectile.setPos(playerIn.getX(), playerIn.getY() + 2.7, playerIn.getZ());
        projectile.shootFromRotation(projectile, playerIn.getXRot(), playerIn.getYHeadRot(), 0, 8F, 0);

        if (!playerIn.isCreative()) heldStack.hurtAndBreak(1, playerIn, (entity) -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));

        worldIn.addFreshEntity(projectile);
        worldIn.playSound(null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), SoundEvents.GLASS_BREAK, SoundSource.PLAYERS, 1.0F, 0.7F / (rn.nextFloat() * 0.4F + 1.2F) + 0.5F);

        playerIn.awardStat(Stats.ITEM_USED.get(this));
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, heldStack);
    }
}
