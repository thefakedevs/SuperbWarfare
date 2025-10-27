package com.atsuishio.superbwarfare.client.model.armor;

import com.atsuishio.superbwarfare.Mod;
import com.atsuishio.superbwarfare.item.armor.UnHelmetPress;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UnHelmetPressModel extends GeoModel<UnHelmetPress> {

    @Override
    public ResourceLocation getAnimationResource(UnHelmetPress object) {
        return null;
    }

    @Override
    public ResourceLocation getModelResource(UnHelmetPress object) {
        return Mod.loc("geo/un_helmet_press.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(UnHelmetPress object) {
        return Mod.loc("textures/armor/un_helmet_press.png");
    }
}
