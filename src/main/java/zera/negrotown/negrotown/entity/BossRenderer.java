package zera.negrotown.negrotown.entity;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BossRenderer extends HumanoidMobRenderer<BossEntity, HumanoidModel<BossEntity>> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.withDefaultNamespace("textures/entity/zombie/zombie.png");

    public BossRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.ZOMBIE)), 1.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(BossEntity entity) {
        return TEXTURE;
    }
}
