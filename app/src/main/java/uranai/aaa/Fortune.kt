package uranai.aaa

import java.util.*

class Fortune {
    val fortuneList = arrayOf("大吉", "中吉", "吉", "小吉", "末吉", "凶", "大凶")
    val descList = arrayOf(
        "やったね！いいことしか起きないんじゃないかな？",
        "おお！まあいいことのほうか多いんじゃないかな？",
        "うーん、なんか普通な日かもね〜、悪いことはないと思うよ!",
        "帰り道とか足元気をつけたほうがいいかもね",
        "割とがちで夜は出歩かないほうがいいんじゃないかな？",
        "うん、人生いいことばかりじゃないって、元気出せって",
        "あのね、今日は家出ないほうがいいどころか、起きないほうがいいかもね。")

    var name: String = ""
    var description: String = ""

    fun getFortune(): Fortune {
        val index = Random().nextInt(fortuneList.size)
        this.name = fortuneList[index]
        this.description = descList[index]
        return this
    }
}