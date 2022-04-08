import kotlin.random.Random
import kotlin.random.nextInt

class Cards {
    fun createNewCard(): List<MutableList<Int>> { // Заполнение карточки нулями
        val line1 = mutableListOf<Int>()
        val line2 = mutableListOf<Int>()
        val line3 = mutableListOf<Int>()
        for (i in 0..8) {
            line1.add(0)
            line2.add(0)
            line3.add(0)
        }
        val arrForCard = mutableListOf<Int>()
        for (i in 1..90) {
            arrForCard.add(i) // Создаем список и заполняем от 1 до 90. Далее буду использовать его для заполнения карточек
        }
        var i: Int
        var count = 0
        var c0 = 0 // Счетчики по столбцам. В каждом столбце карточки не должно быть более двух значений
        var c1 = 0
        var c2 = 0
        var c3 = 0
        var c4 = 0
        var c5 = 0
        var c6 = 0
        var c7 = 0
        var c8 = 0
        var countLine1 = 0 // Счетчики строк. В каждой строке не должно быть больше 5 значений
        var countLine2 = 0
        var countLine3 = 0
        val lineX = mutableListOf<Int>()
        while (count < 15) { // В каждой карточке должно быть 15 значений
            i = Random.nextInt(0 until arrForCard.size) // выбираем случайное число от 1 до 90 из вышесозданного списка
            when (arrForCard[i]) {
                in 1..9 -> {
                    when (Random.nextInt(1..3)) { // Случайным образом выбираем в какую строку поместить это число
                        1 -> {
                            if (line1[0] == 0 && c0 < 2 && countLine1 < 5) {
                                line1[0] = arrForCard[i]
                                c0++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[0] == 0 && c0 < 2 && countLine2 < 5) {
                                line2[0] = arrForCard[i]
                                c0++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[0] == 0 && c0 < 2 && countLine3 < 5) {
                                line3[0] = arrForCard[i]
                                c0++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 10..19 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[1] == 0 && c1 < 2 && countLine1 < 5) {
                                line1[1] = arrForCard[i]
                                c1++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[1] == 0 && c1 < 2 && countLine2 < 5) {
                                line2[1] = arrForCard[i]
                                c1++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[1] == 0 && c1 < 2 && countLine3 < 5) {
                                line3[1] = arrForCard[i]
                                c1++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 20..29 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[2] == 0 && c2 < 2 && countLine1 < 5) {
                                line1[2] = arrForCard[i]
                                c2++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[2] == 0 && c2 < 2 && countLine2 < 5) {
                                line2[2] = arrForCard[i]
                                c2++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[2] == 0 && c2 < 2 && countLine3 < 5) {
                                line3[2] = arrForCard[i]
                                c2++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 30..39 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[3] == 0 && c3 < 2 && countLine1 < 5) {
                                line1[3] = arrForCard[i]
                                c3++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[3] == 0 && c3 < 2 && countLine2 < 5) {
                                line2[3] = arrForCard[i]
                                c3++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[3] == 0 && c3 < 2 && countLine3 < 5) {
                                line3[3] = arrForCard[i]
                                c3++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 40..49 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[4] == 0 && c4 < 2 && countLine1 < 5) {
                                line1[4] = arrForCard[i]
                                c4++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[4] == 0 && c4 < 2 && countLine2 < 5) {
                                line2[4] = arrForCard[i]
                                c4++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[4] == 0 && c4 < 2 && countLine3 < 5) {
                                line3[4] = arrForCard[i]
                                c4++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 50..59 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[5] == 0 && c5 < 2 && countLine1 < 5) {
                                line1[5] = arrForCard[i]
                                c5++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[5] == 0 && c5 < 2 && countLine2 < 5) {
                                line2[5] = arrForCard[i]
                                c5++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[5] == 0 && c5 < 2 && countLine3 < 5) {
                                line3[5] = arrForCard[i]
                                c5++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 60..69 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[6] == 0 && c6 < 2 && countLine1 < 5) {
                                line1[6] = arrForCard[i]
                                c6++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[6] == 0 && c6 < 2 && countLine2 < 5) {
                                line2[6] = arrForCard[i]
                                c6++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[6] == 0 && c6 < 2 && countLine3 < 5) {
                                line3[6] = arrForCard[i]
                                c6++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 70..79 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[7] == 0 && c7 < 2 && countLine1 < 5) {
                                line1[7] = arrForCard[i]
                                c7++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[7] == 0 && c7 < 2 && countLine2 < 5) {
                                line2[7] = arrForCard[i]
                                c7++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[7] == 0 && c7 < 2 && countLine3 < 5) {
                                line3[7] = arrForCard[i]
                                c7++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
                in 80..90 -> {
                    when (Random.nextInt(1..3)) {
                        1 -> {
                            if (line1[8] == 0 && c8 < 2 && countLine1 < 5) {
                                line1[8] = arrForCard[i]
                                c8++
                                count++
                                countLine1++
                            } else lineX.add(arrForCard[i])
                        }
                        2 -> {
                            if (line2[8] == 0 && c8 < 2 && countLine2 < 5) {
                                line2[8] = arrForCard[i]
                                c8++
                                count++
                                countLine2++
                            } else lineX.add(arrForCard[i])
                        }
                        3 -> {
                            if (line3[8] == 0 && c8 < 2 && countLine3 < 5) {
                                line3[8] = arrForCard[i]
                                c8++
                                count++
                                countLine3++
                            } else lineX.add(arrForCard[i])
                        }
                    }
                }
            }
            arrForCard.remove(arrForCard[i]) // Когда записали число в одну из строк - удаляем его из списка, чтобы не повторилось
        }
        return listOf(line1, line2, line3)
    }

    fun printCard(enterCard: List<MutableList<Int>>) { // Метод печати карточек
        val line1 = enterCard[0]
        val line2 = enterCard[1]
        val line3 = enterCard[2]
        println("------------------------------------------")
        line1.forEach()
        {
            if (it==0) print ("|   ") else
            print("| $it ")
        }
        print("|")
        println()
        println("------------------------------------------")
        line2.forEach()
        {
            if (it==0) print ("|   ") else
                print("| $it ")
        }
        print("|")
        println()
        println("------------------------------------------")
        line3.forEach()
        {
            if (it==0) print ("|   ") else
                print("| $it ")
        }
        print("|")
        println()
        println("------------------------------------------")
    }

}