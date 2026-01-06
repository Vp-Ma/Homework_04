package ru.otus.cars

interface Tank {
    fun getFuelCurrAmount(): Int
    fun fuelFillUp(liters: Int)
    fun getTankTankMouthType():Int
    fun getTankCapacity():Int
}

enum class TankMouthType{
    FOR_UNNOWN_FUEL,
    FOR_PETROL_FUEl,
    FOR_GAZ_FUEL
}


class FuelTank (val tankVolume: Int, val tankMouthType:TankMouthType ): Tank {

    private var realFuelAmnt = 0
    private var mouthType = tankMouthType

    override fun getFuelCurrAmount(): Int{
        return realFuelAmnt
    }

    override fun fuelFillUp(liters: Int) {

        val possibleVol = tankVolume -  realFuelAmnt
        if( possibleVol > liters ) {
            realFuelAmnt += liters
            println( "Запралено топлива ${liters} литров" )
        }
        else if( possibleVol <= liters ){
            realFuelAmnt += possibleVol
            println( "Запрашиваемый объем слишком большой. Запралено топлива ${possibleVol} литров" )
        }
        else if( possibleVol == 0){
            realFuelAmnt = tankVolume
            println("Бак полон. Заправка не требуется")
        }
    }
    override fun getTankTankMouthType():Int {
      return mouthType.ordinal
    }
    override fun  getTankCapacity():Int{
        return tankVolume
    }
}
