package ru.otus.cars

import kotlin.random.Random

class GazStation( private val carsQueue:List<Car>) {

    fun ReFuelCars(  )
    {
        var fuelAmount = 0
        var realFuelAmnt = 0

        for( car in carsQueue ) {
            showTankFuelAmount(car)
            fuelAmount = getFuelAmount()
            if ( car.tank.tankMouthType == TankMouthType.FOR_PETROL_FUEl) {
                    petrolRefuel( fuelAmount, car )
            } else if ((car.tank.tankMouthType == TankMouthType.FOR_GAZ_FUEL)) {
                  gazRefuel( fuelAmount, car )
            } else {
                    println("Бак взорвался")
            }
            realFuelAmnt = car.tank.getFuelCurrAmount()
            println("В баке ${realFuelAmnt} литров топлива")
        }
    }
    private fun getFuelAmount():Int{
        println("Сколько требуется топлива?")
        Thread.sleep(300)
        return Random.nextInt(1, 100)
    }
    private fun petrolRefuel( fuelAmount:Int, car:Car ){
        println("Будет Заправлен бензин. Количество $fuelAmount")
        car.tank.fuelFillUp(fuelAmount)
    }

    private fun gazRefuel( fuelAmount:Int, car:Car ){
        println("Будет Заправлен газ. Количествто $fuelAmount")
        car.tank.fuelFillUp(fuelAmount)
    }

}