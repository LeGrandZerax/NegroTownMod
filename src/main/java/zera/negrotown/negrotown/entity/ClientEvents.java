package zera.negrotown.negrotown.entity;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import zera.negrotown.negrotown.NegroTownMod;

@EventBusSubscriber(modid = NegroTownMod.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRenderer(EntityRenderersEvent.RegisterRenderers event ) {
        event.registerEntityRenderer(ModEntity.BOSS.get(), BossRenderer::new);
    }
}
