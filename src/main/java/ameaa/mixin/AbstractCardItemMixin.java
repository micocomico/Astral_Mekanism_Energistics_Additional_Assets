package ameaa.mixin;

import appeng.items.AEBaseItem;
import astral_mekanism.item.recipecard.AbstractCardItem;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = AbstractCardItem.class)
public abstract class AbstractCardItemMixin extends AEBaseItem {
    public AbstractCardItemMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "appendHoverText",at = @At("HEAD"), cancellable = true)
    public void Text(ItemStack stack, Level level, @NotNull List<Component> lines, @NotNull TooltipFlag adv, CallbackInfo ci) {
        lines.add(Component.literal(Minecraft.getInstance().getLanguageManager().getSelected().equals("ja_jp") ? "セルワークベンチで情報を設定してください。" : "Set Information on Cell Workbench."));
        ci.cancel();
    }
}
