# #hot16challenge
There's an initiative in Poland to raise money for polish healthcare during the pandemic. Originated by the rap community, the challenge is to create a 16 verse long song to support the noble cause. If you wish to donate, please go ahead!

https://www.siepomaga.pl/hot16challenge

## #hot16codechallenge
Idea is the same, but tool is different. Let's show some 16 line code!

## Survive the quarantine
Survive till the end of quarantine.
Everyday you'll face the decision whether to stay at home or go out to get vital supplies. Can you survive?! Play now! https://timphoenix.github.io/hot16codechallenge/

###
This short game was coded in 16 lines of effectively obfuscated code.

### index.html (4 lines)
```html
<!DOCTYPE html><html lang="en">
<head><meta charset="UTF-8"><title>Survive the quarantine</title></head>
<body><button id="stay">Stay at home</button><button id="go">Go out for supplies</button><div id="log"/>
<script src="hot16codechallenge.js"></script></body></html>
```
### main.kt (12 lines)
```kotlin
import kotlinx.html.dom.*; import kotlinx.html.*; import org.w3c.dom.*; import kotlin.random.*
fun main(): Unit = with(kotlin.browser.document) {
    val log = getElementById("log") as HTMLElement
    val go = getElementById("go") as HTMLElement; val stay = getElementById("stay") as HTMLElement;
    var food = 7; var tp = 7; var days = 0; var sick = false; fun roll() = Random.nextInt(3,7);
    fun end() = when { food == 0 -> "You've run out of food!"; tp == 0 -> "You've run out of a toilet paper!";
        sick -> "You've been caught by a sharp shadow of a fog!" else -> null};
    fun day() = log.prepend.div { h1 { +(end()?.apply { with(kotlin.browser.window)
        { setTimeout({ location.href = "https://www.youtube.com/watch?v=2c4hnA8jXwo" },2500)}; go.remove(); stay.remove()}
        ?: "You've survived day $days".apply { if(log.childElementCount > 12) log.lastChild?.let { log.removeChild(it) } })}}
    go.addEventListener("click", { days++; food += roll(); tp += roll(); sick = Random.nextDouble(.0,100.0) < 2.7; day() })
    stay.addEventListener("click", { days++; food--; tp--; day() })}
```
