import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlin.random.Random
import kotlin.random.nextInt

object SharedGenerator {
    private val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val flow = MutableSharedFlow<Int>()
    val sharedFlow = flow.asSharedFlow()
    private val db = mutableListOf<Int>()
    private var i: Int = 0

    init {
        for (i in 1..90) {
            db.add(i)
        }
        scope.launch {
            delay(10)
            for (j in 1..90) {
                if (db.size != 0) {
                    i = Random.nextInt(0 until db.size)
                    flow.emit(db[i])
                    db.remove(db[i])
                } else break
            }
        }
    }
}