import kotlinx.coroutines.*

fun main() {
    println("Поиграем в лото?")
    print("Сколько игроков будут играть в лото?")
    val playerCount = checking()
    print("Сколько карточек будет у игроков?")
    val cardsCount = checking()
    val playersTeam = mutableListOf<Player>()
    val jobTeam = mutableListOf<Job>()
    for (i in 1..playerCount) {
        playersTeam.add(Player("Игрок $i", cardsCount))
        jobTeam.add(Job())
    }
    // Печатаем карточки игроков:
    playersTeam.forEach { player ->
        println("Карточки ${player.name}")
        player.cards.forEach { card ->
            Cards().printCard(card)
        }
    }
    //проверка игроков
    runBlocking {
        playersTeam.forEachIndexed { index, player ->
            jobTeam[index] = async (Dispatchers.Default) {
                SharedGenerator.sharedFlow.collect { number ->
                    println("Достали боченок с номером: ($number)")
                    player.getNumber(number)
                    println("Выигрышных номеров у ${player.name} = ${player.winNumbsCounter}")
                    if (player.winNumbsCounter == (15*cardsCount)) {
                        println("----------------------")
                        println("ПОБЕДИЛ ${player.name}")
                        println("----------------------")
                        cancel()
                        jobTeam.forEach {
                            it.cancel()
                        }
                    }
                }
            }
        }
    }
}

fun checking(): Int {
    val n: Int? = readLine()?.toIntOrNull()
    return if (n != null && n == 0) {
        println("Повторите ввод данных:")
        checking()
    } else n!!
}