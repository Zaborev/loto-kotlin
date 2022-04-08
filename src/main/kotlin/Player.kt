class Player(val name: String, private val cardsCount: Int) {
    var winNumbsCounter = 0-12*cardsCount
    val cards = createCardsForPlayer()

    private fun createCardsForPlayer(): MutableList<MutableList<MutableList<Int>>> { // Метод создания карточек для игроков
        val cards = mutableListOf<MutableList<MutableList<Int>>>()
        for (i in 1..cardsCount) {
            cards.add(Cards().createNewCard() as MutableList<MutableList<Int>>) // Вызываем метод создания карточки
        }
        return cards
    }
   fun getNumber(number: Int) { // Метод проверки выпавшего бочонка
        val arrForRemove = mutableListOf<Int>()
        cards.forEach { card ->
            card.forEach { line ->
                line.forEach { item ->
                    if (item == 0 || item == number) { //Если в списке 0 или число совпало с бочонком - удаляем число из карточки
                        arrForRemove.add(item)
                        winNumbsCounter++
                    }
                }
                line.removeAll(arrForRemove)
            }
        }
    }
}