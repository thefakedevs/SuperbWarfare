package com.atsuishio.superbwarfare.client.model.armor;

import com.atsuishio.superbwarfare.Mod;
import com.atsuishio.superbwarfare.item.armor.UnChestPress;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UnChestPressModel extends GeoModel<UnChestPress> {

    @Override
    public ResourceLocation getAnimationResource(UnChestPress object) {
        return null;
    }

    @Override
    public ResourceLocation getModelResource(UnChestPress object) {
        return Mod.loc("geo/un_chest_press.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UnChestPress object) {
        return Mod.loc("textures/armor/un_chest_press.png");
    }
}
