package com.pablo.mvvm.model

class Provider {
    companion object {
        fun random(): ModelClass {
            // el metodo indices equivale a 0..frases.size-1
            val position = (frases.indices).random()
            return frases[position]
        }
        private val frases = listOf(
            ModelClass(
                frase = "It’s not a bug. It’s an undocumented feature!"
            ),
            ModelClass(
                frase = "“Software Developer” – An organism that turns caffeine into software"
            ),
            ModelClass(
                frase = "If debugging is the process of removing software bugs, then programming must be the process of putting them in"
            ),
            ModelClass(
                frase = "A user interface is like a joke. If you have to explain it, it’s not that good."
            ),
            ModelClass(
                frase = "I don’t care if it works on your machine! We are not shipping your machine!"
            ),
            ModelClass(
                frase = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight."
            ),
            ModelClass(
                frase = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why."
            ),
            ModelClass(frase = "Things aren’t always #000000 and #FFFFFF")
        )
    }
}