package ameaa.mixin;

import astral_mekanism.AMELang;
import astral_mekanism.block.blockentity.astralmachine.BEAstralComposter;
import astral_mekanism.block.blockentity.astralmachine.BEAstralReactionChamber;
import astral_mekanism.block.blockentity.enchantedmachine.BEEnchantedAdsorptionSeparator;
import astral_mekanism.block.blockentity.normalmachine.BEEssentialMetallurgicInfuser;
import astral_mekanism.block.blockentity.normalmachine.BEEssentialReactionChamber;
import astral_mekanism.block.blockentity.normalmachine.BEMekanicalComposter;
import astral_mekanism.block.shape.AMEBlockShapes;
import astral_mekanism.config.AMEConfig;
import astral_mekanism.enums.AMEUpgrade;
import astral_mekanism.registration.BlockTypeMachine;
import astral_mekanism.registration.MachineDeferredRegister;
import astral_mekanism.registration.MachineRegistryObject;
import astral_mekanism.registration.RegistrationInterfaces;
import astral_mekanism.registries.AMEMachines;
import com.jerry.mekanism_extras.api.ExtraUpgrade;
import fixdol.mekanismelements.common.config.MSConfig;
import fixdol.mekanismelements.common.content.blocktype.MSBlockShapes;
import mekanism.api.Upgrade;
import mekanism.api.math.FloatingLong;
import mekanism.common.MekanismLang;
import mekanism.common.config.MekanismConfig;
import mekanism.common.content.blocktype.BlockShapes;
import mekanism.common.registries.MekanismSounds;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.EnumSet;
import java.util.function.UnaryOperator;

import static astral_mekanism.registries.AMEMachines.MACHINES;
import static astral_mekanism.registries.AMEMachines.MAX_SUPPLIER;

@Mixin(value = AMEMachines.class, remap = false)
public class AMEMachinesMixin {
    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 28))
    private static MachineRegistryObject<BEAstralComposter, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEAstralComposter, BlockTypeMachine<BEAstralComposter>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEAstralComposter>, mekanism.common.item.block.machine.ItemBlockMachine> ac(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEAstralComposter, BlockTypeMachine<BEAstralComposter>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEAstralComposter, BlockTypeMachine<BEAstralComposter>>> beConstructor, Class<BEAstralComposter> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEAstralComposter>, BEAstralComposter>> operator) {
        return MACHINES.registerSimple("astral_composter", BEAstralComposter::new, BEAstralComposter.class, AMELang.DESCRIPTION_ASTRAL_MACHINE, (builder) -> (BlockTypeMachine.BlockMachineBuilder)builder.changeAttributeUpgrade(EnumSet.of(AMEUpgrade.COBBLESTONE_SUPPLY.getValue())));
    }

    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 97))
    private static MachineRegistryObject<BEMekanicalComposter, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEMekanicalComposter, BlockTypeMachine<BEMekanicalComposter>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEMekanicalComposter>, mekanism.common.item.block.machine.ItemBlockMachine> mc(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEMekanicalComposter, BlockTypeMachine<BEMekanicalComposter>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEMekanicalComposter, BlockTypeMachine<BEMekanicalComposter>>> beConstructor, Class<BEMekanicalComposter> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEMekanicalComposter>, BEMekanicalComposter>> operator) {
        return MACHINES.registerSimple("mekanical_composter", BEMekanicalComposter::new, BEMekanicalComposter.class, AMELang.DESCRIPTION_MEKANICAL_COMPOSTER, (builder) -> (BlockTypeMachine.BlockMachineBuilder)builder.changeAttributeUpgrade(EnumSet.of(Upgrade.SPEED, AMEUpgrade.COBBLESTONE_SUPPLY.getValue())));
    }

    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 45))
    private static MachineRegistryObject<BEAstralReactionChamber, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEAstralReactionChamber, BlockTypeMachine<BEAstralReactionChamber>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEAstralReactionChamber>, mekanism.common.item.block.machine.ItemBlockMachine> ar(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEAstralReactionChamber, BlockTypeMachine<BEAstralReactionChamber>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEAstralReactionChamber, BlockTypeMachine<BEAstralReactionChamber>>> beConstructor, Class<BEAstralReactionChamber> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEAstralReactionChamber>, BEAstralReactionChamber>> operator) {
        return MACHINES.registerSimple("astral_reaction_chamber", BEAstralReactionChamber::new, BEAstralReactionChamber.class, AMELang.DESCRIPTION_ASTRAL_MACHINE, (builder) -> (BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)builder.withEnergyConfig(AMEConfig.usage.aaeReactionChamber, MAX_SUPPLIER))).changeAttributeUpgrade(EnumSet.of(Upgrade.MUFFLING, Upgrade.ENERGY, AMEUpgrade.COBBLESTONE_SUPPLY.getValue(), AMEUpgrade.WATER_SUPPLY.getValue())).withSound(MekanismSounds.PRECISION_SAWMILL));
    }

    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 86))
    private static MachineRegistryObject<BEEssentialReactionChamber, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEssentialReactionChamber, BlockTypeMachine<BEEssentialReactionChamber>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEEssentialReactionChamber>, mekanism.common.item.block.machine.ItemBlockMachine> er(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEEssentialReactionChamber, BlockTypeMachine<BEEssentialReactionChamber>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEssentialReactionChamber, BlockTypeMachine<BEEssentialReactionChamber>>> beConstructor, Class<BEEssentialReactionChamber> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEEssentialReactionChamber>, BEEssentialReactionChamber>> operator) {
        return MACHINES.registerSimple("essential_reaction_chamber", BEEssentialReactionChamber::new, BEEssentialReactionChamber.class, AMELang.DESCRIPTION_ESSENTIAL_REACTION_CHAMBER, (builder) -> (BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)builder.withEnergyConfig(AMEConfig.usage.aaeReactionChamber, AMEConfig.storage.aaeReactionChamber))).changeAttributeUpgrade(EnumSet.of(Upgrade.SPEED, Upgrade.ENERGY, Upgrade.MUFFLING, ExtraUpgrade.STACK, AMEUpgrade.COBBLESTONE_SUPPLY.getValue(), AMEUpgrade.WATER_SUPPLY.getValue())).withSound(MekanismSounds.OSMIUM_COMPRESSOR));
    }

    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 56))
    private static MachineRegistryObject<BEEnchantedAdsorptionSeparator, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEnchantedAdsorptionSeparator, BlockTypeMachine<BEEnchantedAdsorptionSeparator>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEEnchantedAdsorptionSeparator>, mekanism.common.item.block.machine.ItemBlockMachine> ea(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEEnchantedAdsorptionSeparator, BlockTypeMachine<BEEnchantedAdsorptionSeparator>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEnchantedAdsorptionSeparator, BlockTypeMachine<BEEnchantedAdsorptionSeparator>>> beConstructor, Class<BEEnchantedAdsorptionSeparator> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEEnchantedAdsorptionSeparator>, BEEnchantedAdsorptionSeparator>> operator) {
        return MACHINES.registerSimple("enchanted_adsorption_separator", BEEnchantedAdsorptionSeparator::new, BEEnchantedAdsorptionSeparator.class, AMELang.DESCRIPTION_ENCHANTED_MACHINE, (builder) -> ((BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)builder.withEnergyConfig(() -> ((FloatingLong)MSConfig.usageConfig.adsorptionSeparator.get()).multiply(200L), () -> ((FloatingLong)MSConfig.storageConfig.adsorptionSeparator.get()).multiply(12800L))).withSound(MekanismSounds.CHEMICAL_INFUSER))).changeAttributeUpgrade(EnumSet.of(Upgrade.MUFFLING, Upgrade.SPEED, Upgrade.ENERGY, AMEUpgrade.RADIOACTIVE_SEALING.getValue(), ExtraUpgrade.STACK)));
    }

    @Redirect(method = "<clinit>",at = @At(value = "INVOKE", target = "Lastral_mekanism/registration/MachineDeferredRegister;registerSimple(Ljava/lang/String;Lastral_mekanism/registration/RegistrationInterfaces$BlockEntityConstructor;Ljava/lang/Class;Lmekanism/api/text/ILangEntry;Ljava/util/function/UnaryOperator;)Lastral_mekanism/registration/MachineRegistryObject;",ordinal = 84))
    private static MachineRegistryObject<BEEssentialMetallurgicInfuser, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEssentialMetallurgicInfuser, BlockTypeMachine<BEEssentialMetallurgicInfuser>>, mekanism.common.inventory.container.tile.MekanismTileContainer<BEEssentialMetallurgicInfuser>, mekanism.common.item.block.machine.ItemBlockMachine> em(MachineDeferredRegister instance, String name, RegistrationInterfaces.BlockEntityConstructor<BEEssentialMetallurgicInfuser, BlockTypeMachine<BEEssentialMetallurgicInfuser>, mekanism.common.block.prefab.BlockTile.BlockTileModel<BEEssentialMetallurgicInfuser, BlockTypeMachine<BEEssentialMetallurgicInfuser>>> beConstructor, Class<BEEssentialMetallurgicInfuser> beClass, mekanism.api.text.ILangEntry entry, UnaryOperator<BlockTypeMachine.BlockMachineBuilder<BlockTypeMachine<BEEssentialMetallurgicInfuser>, BEEssentialMetallurgicInfuser>> operator) {
        return MACHINES.registerSimple("essential_metallurgic_infuser", BEEssentialMetallurgicInfuser::new, BEEssentialMetallurgicInfuser.class, MekanismLang.DESCRIPTION_METALLURGIC_INFUSER, (builder) -> (BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)((BlockTypeMachine.BlockMachineBuilder)builder.withEnergyConfig(MekanismConfig.usage.metallurgicInfuser, MekanismConfig.storage.metallurgicInfuser)).changeAttributeUpgrade(EnumSet.of(Upgrade.SPEED, Upgrade.ENERGY, ExtraUpgrade.STACK, AMEUpgrade.COBBLESTONE_SUPPLY.getValue(), AMEUpgrade.RADIOACTIVE_SEALING.getValue()))));
    }

}
