import static globals.Globals.*

FLOTATION = recipemap('froth_flotation')
ROASTER = recipemap('roaster')
BR = recipemap('batch_reactor')
BCR = recipemap('bubble_column_reactor')
DISTILLERY = recipemap('distillery')
MIXER = recipemap('mixer')
CLARIFIER = recipemap('clarifier')
CENTRIFUGE = recipemap('centrifuge')

//OPTIONAL FLOTATION

MIXER.recipeBuilder()
    .inputs(metaitem('dustImpureBarite') * 8)
    .fluidInputs(fluid('distilled_water') * 2000)
    .fluidOutputs(fluid('impure_barite_slurry') * 2000)
    .EUt(Globals.voltAmps[3])
    .duration(80)
    .buildAndRegister()
    
FLOTATION.recipeBuilder()
    .fluidInputs(fluid('impure_barite_slurry') * 2000)
    .notConsumable(fluid('methyl_isobutyl_carbinol') * 100)
    .notConsumable(fluid('lauric_acid') * 100)
    .fluidOutputs(fluid('barite_slurry') * 1000)
    .fluidOutputs(fluid('granite_tailing_slurry') * 1000)
    .EUt(Globals.voltAmps[3])
    .duration(80)
    .buildAndRegister()

CLARIFIER.recipeBuilder()
    .fluidInputs(fluid('barite_slurry') * 1000)
    .outputs(metaitem('dustBarite') * 16)
    .fluidOutputs(fluid('wastewater') * 1000)
    .EUt(Globals.voltAmps[1])
    .duration(20)
    .buildAndRegister()

CENTRIFUGE.recipeBuilder()
    .fluidInputs(fluid('granite_tailing_slurry') * 1000)
    .outputs(metaitem('dustGraniteTailings') * 2)
    .fluidOutputs(fluid('wastewater') * 1000)
    .EUt(Globals.voltAmps[1])
    .duration(20)
    .buildAndRegister()

ROASTER.recipeBuilder()
    .inputs(metaitem('dustBarite') * 6)
    .inputs(metaitem('dustCarbon') * 4)
    .outputs(metaitem('dustBariumSulfide') * 2)
    .fluidOutputs(fluid('carbon_monoxide') * 4000)
    .EUt(Globals.voltAmps[1])
    .duration(100)
    .buildAndRegister()

BR.recipeBuilder()
    .inputs(metaitem('dustBariumSulfide') * 2)
    .inputs(metaitem('dustSodaAsh') * 6)
    .fluidInputs(fluid('distilled_water') * 4000)
    .outputs(metaitem('dustBariumCarbonate') * 5)
    .fluidOutputs(fluid('hydrogen_sulfide') * 1000)
    .fluidOutputs(fluid('sodium_hydroxide_solution') * 2000)
    .EUt(Globals.voltAmps[1])
    .duration(100)
    .buildAndRegister()

BR.recipeBuilder()
    .inputs(metaitem('dustBariumSulfide') * 2)
    .fluidInputs(fluid('carbon_dioxide') * 1000)
    .fluidInputs(fluid('distilled_water') * 2000)
    .outputs(metaitem('dustBariumCarbonate') * 5)
    .fluidOutputs(fluid('hydrogen_sulfide') * 1000)
    .fluidOutputs(fluid('wastewater') * 1000)
    .EUt(Globals.voltAmps[1])
    .duration(100)
    .buildAndRegister()

BR.recipeBuilder()
    .inputs(metaitem('dustBariumCarbonate') * 5)
    .fluidInputs(fluid('hydrochloric_acid') * 2000)
    .fluidOutputs(fluid('barium_chloride_solution') * 1000)
    .fluidOutputs(fluid('carbon_dioxide') * 1000)
    .EUt(Globals.voltAmps[1])
    .duration(100)
    .buildAndRegister()

DISTILLERY.recipeBuilder()
    .fluidInputs(fluid('barium_chloride_solution') * 1000)
    .outputs(metaitem('dustBariumChloride') * 3)
    .fluidOutputs(fluid('water') * 2000)
    .EUt(Globals.voltAmps[1])
    .duration(100)
    .buildAndRegister()



