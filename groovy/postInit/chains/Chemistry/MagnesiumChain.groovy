ROASTER = recipemap('roaster')
EBF = recipemap('electric_blast_furnace')
BR = recipemap('batch_reactor')
DISTILLERY = recipemap('distillery')
MIXER = recipemap('mixer')
CRYSTALLIZER = recipemap('crystallizer')

ROASTER.recipeBuilder()
        .inputs(ore('dustMagnesite') * 5)
        .outputs(metaitem('dustMagnesia') * 2)
        .fluidOutputs(fluid('carbon_dioxide') * 1000)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

ROASTER.recipeBuilder()
        .inputs(ore('dustDolomite') * 10)
        .outputs(metaitem('dustMagnesia') * 2)
        .outputs(metaitem('dustQuicklime') * 2)
        .fluidOutputs(fluid('carbon_dioxide') * 2000)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs(metaitem('dustMagnesia') * 4)
        .inputs(metaitem('dustQuicklime') * 4)
        .inputs(metaitem('dustSilicon') * 1)
        .outputs(metaitem('dustCalciumSilicate') * 7)
        .fluidOutputs(fluid('magnesium') * 288)
        .EUt(30)
        .duration(200)
        .blastFurnaceTemp(1370)
        .buildAndRegister()

ROASTER.recipeBuilder()
        .inputs(ore('dustCalciumSilicate') * 7)
        .outputs(metaitem('dustSiliconDioxide') * 3)
        .outputs(metaitem('dustQuicklime') * 4)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

BR.recipeBuilder()
        .inputs(ore('dustMagnesia') * 2)
        .fluidInputs(fluid('water') * 1000)
        .outputs(metaitem('dustMagnesiumHydroxide') * 5)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

BR.recipeBuilder()
        .inputs(ore('dustMagnesiumHydroxide') * 5)
        .fluidInputs(fluid('hydrochloric_acid') * 2000)
        .fluidOutputs(fluid('magnesium_chloride_solution') * 2000)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

DISTILLERY.recipeBuilder()
        .fluidInputs(fluid('magnesium_chloride_solution') * 2000)
        .outputs(metaitem('dustMagnesiumChloride') * 3)
        .fluidOutputs(fluid('water') * 2000)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

ROASTER.recipeBuilder()
        .inputs(metaitem('dustMagnesiumSulfate') * 6)
        .outputs(metaitem('dustMagnesia') * 2)
        .fluidOutputs(fluid('sulfur_trioxide') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()

ROASTER.recipeBuilder()
        .inputs(metaitem('dustKieserite') * 7)
        .outputs(metaitem('dustMagnesiumSulfate') * 6)
        .fluidOutputs(fluid('steam') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs(metaitem('dustLangbeinite') * 24)
        .fluidInputs(fluid('water') * 1000)
        .fluidOutputs(fluid('langbeinite_leach') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()

CRYSTALLIZER.recipeBuilder()
        .fluidInputs(fluid('langbeinite_leach') * 1000)
        .outputs(metaitem('dustMagnesiumSulfate') * 12)
        .fluidOutputs(fluid('potassium_sulfate_solution') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()

DISTILLERY.recipeBuilder()
        .fluidInputs(fluid('potassium_sulfate_solution') * 1000)
        .outputs(metaitem('dustPotassiumSulfate') * 7)
        .fluidOutputs(fluid('water') * 1000)
        .EUt(30)
        .duration(120)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs(metaitem('dustPolyhalite') * 32)
        .fluidInputs(fluid('water') * 1000)
        .outputs(metaitem('dustCalciumSulfate') * 12)
        .fluidOutputs(fluid('polyhalite_leach') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()

CRYSTALLIZER.recipeBuilder()
        .fluidInputs(fluid('polyhalite_leach') * 1000)
        .outputs(metaitem('dustMagnesiumSulfate') * 6)
        .fluidOutputs(fluid('potassium_sulfate_solution') * 1000)
        .EUt(30)
        .duration(160)
        .buildAndRegister()