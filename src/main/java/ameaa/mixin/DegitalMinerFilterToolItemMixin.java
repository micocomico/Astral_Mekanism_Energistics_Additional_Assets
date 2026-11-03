package ameaa.mixin;

import astral_mekanism.item.DegitalMinerFilterToolItem;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = DegitalMinerFilterToolItem.class)
public class DegitalMinerFilterToolItemMixin extends Item {
    public DegitalMinerFilterToolItemMixin(Properties p_41383_) {
        super(p_41383_);
    }

    @Inject(method = "appendHoverText",at = @At("HEAD"), cancellable = true)
    public void Text(ItemStack stack, Level level, @NotNull List<Component> lines, @NotNull TooltipFlag adv, CallbackInfo ci) {
        lines.add(Component.literal(Minecraft.getInstance().getLanguageManager().getSelected().equals("ja_jp") ? "セルワークベンチで情報を設定してください。" : "Set Information on Cell Workbench."));
        lines.add(Component.literal(Minecraft.getInstance().getLanguageManager().getSelected().equals("ja_jp") ? "デジタルマイナーにアイテムスタックフィルターを追加します (Shift + 右クリック)。" : "Add Itemstack Filters to DegitalMiner (Shift + RightClick)."));
        ci.cancel();
    }
}
