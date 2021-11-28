package sexample.study.mysexapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.properties.Delegates

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    // lateinit var istring: String
    var i: Int = 0
    var stikh: List<String> = listOf(
        "Дождём веки размыло,",
        "Меняй шило на мыло,",
        "Смотри, всё полетело,",
        "Меняй душу на тело,",
        "Меняй гада на тварь,",
        "Меняй свет на фонарь.",
        "Когда выпил микстуру,",
        "Меняй пулю на дуру.",
        "Когда плен поговорок,",
        "Меняй масло на творог.",
        "Когда пыль из дворов,",
        "Меняй власть на воров.",
        "Давай иди, куда скажут,",
        "И делай то, что позволят,",
        "Тащи то, что загрузят,",
        "Тебе всё по плечу!",
        "Меняй свободу на платье,",
        "А я так жить не хочу.",
        "А ты делай, что хочешь,",
        "Меняй подпись на прочерк,",
        "Но я точно не буду",
        "Менять Кришну на Будду",
        "И, хоть глубокий арест,",
        "Менять веру на крест.",
        "Когда люди не верят,",
        "Меняй море на берег.",
        "Когда траблы и требы,",
        "Меняй землю на небо.",
        "Когда ты лучше меня,",
        "То ничего не меняй.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onRestart() {
        super.onRestart()
        // здесь я пытался обойти сброс счетчика,
        // но, увы - не осилил пока что
        // if (istring != "")
        // i = istring.toInt()
        Log.d(TAG, stikh.get(i))
        i += 1
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, stikh.get(i))
        i += 1
        // istring = i.toString()
    }

}





