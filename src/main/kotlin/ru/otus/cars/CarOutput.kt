package ru.otus.cars

/**
 * Следит за машиной
 */
interface CarOutput {
    /**
     * Скажи текущую скорость
     */
    fun getCurrentSpeed(): Int
    /**
     * Текущее количество топлива
     */
    fun getFuelAmount(): Int
}