package com.atsuishio.superbwarfare.client.renderer.armor;

import com.atsuishio.superbwarfare.client.model.armor.UnHelmetPressModel;
import com.atsuishio.superbwarfare.item.armor.UnHelmetPress;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UnHelmetPressArmorRenderer extends GeoArmorRenderer<UnHelmetPress> {
	public UnHelmetPressArmorRenderer() {
		super(new UnHelmetPressModel());
		this.head = new GeoBone(null, "", false, (double) 0, false, false);
	}

	@Override
	public RenderType getRenderType(UnHelmetPress animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
