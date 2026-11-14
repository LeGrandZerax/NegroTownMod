package zera.negrotown.negrotown.entity;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import zera.negrotown.negrotown.NegroTownMod;

@EventBusSubscriber(modid = NegroTownMod.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntity.BOSS.get(), BossEntity.createAttributes().build());
    }
}
