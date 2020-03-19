fun Task7 (state: Boolean) {
    if(state) {
        //Номер задачі
        val tool = Tools()
        tool.printing(7, "Нова пошта")

        val weigh: Float // Об'ємна вага
        val length: Float = 30f// Довжина
        val width: Float = 10f// Ширина
        val height: Float = 1f // Висота
        val volumeOfCargo: Float = 4000f // Об'єм вантажу метри кубічні

        weigh = ((length * width * height) /4000) * 250


        println("Результат: $weigh кг")


    }
}