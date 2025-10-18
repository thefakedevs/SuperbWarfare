package com.atsuishio.superbwarfare.event;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "superbwarfare")
public class ExplosionEventHandler {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onExplosionDetonate(ExplosionEvent.Detonate event) {
        event.getAffectedEntities().removeIf(entity -> {
            if (entity instanceof ItemEntity) {
                return event.getLevel().getRandom().nextFloat() < 0.5f;
            }
            return false;
        });
    }
}
