ASSEMBLER = recipemap('assembler')
PSA = recipemap('pressure_swing_adsorption')
AUTOCLAVE = recipemap('autoclave')
DRYER = recipemap('dryer')

ASSEMBLER.recipeBuilder()
        .inputs(metaitem('wireFineAluminium') * 8)
        .circuitMeta(8)
        .outputs(metaitem('zeolite_membrane_support') * 1)
        .duration(180)
        .EUt(30)
        .buildAndRegister()

AUTOCLAVE.recipeBuilder()
        .fluidInputs(fluid('raw_molecular_sieve') * 4000)
        .inputs(ore('dustClay') * 8)
        .fluidOutputs(fluid('zeolite_x_solution') * 4000)
        .duration(180)
        .EUt(30)
        .buildAndRegister()

DRYER.recipeBuilder()
        .fluidInputs(fluid('zeolite_x_solution') * 4000)
        .outputs(metaitem('dustZeoliteX') * 8)
        .duration(180)
        .EUt(30)
        .buildAndRegister()

AUTOCLAVE.recipeBuilder()
        .fluidInputs(fluid('distilled_water') * 1000)
        .inputs(ore('dustZeoliteX') * 4)
        .inputs(metaitem('zeolite_membrane_support') * 1)
        .outputs(metaitem('zeolite_membrane') * 1)
        .duration(180)
        .EUt(30)
        .buildAndRegister()

PSA.recipeBuilder()
        .fluidInputs(fluid('air') * 10000)
        .notConsumable(metaitem('zeolite_membrane') * 1)
        .fluidOutputs(fluid('nitrogen') * 7800)
        .fluidOutputs(fluid('oxygen') * 2200)
        .duration(100)
        .EUt(64)
        .buildAndRegister()