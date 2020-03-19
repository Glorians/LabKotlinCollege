
fun task2 (state: Boolean) {
    if (state) {
        //Номер задачі
        val tool = Tools()
        tool.printing(2, "Вивести усі типи")

        // Data
        val story: Boolean = true
        val b: Byte = 8
        val c: Char = '#'
        val s: Short = 3276
        val i: Int = 200000000
        val l: Long = 1000000000000000000
        val f: Float = 3.14444444444444444444444444444444444f
        val d: Double = 3.144444444444444444444444444444444444

        // Вывод
        println("story = $story\n" +
                "b = $b\n" +
                "c = $c\n" +
                "s = $s\n" +
                "i = $i\n" +
                "l = $l\n" +
                "f = $f\n" +
                "d = $d\n")
    }
}