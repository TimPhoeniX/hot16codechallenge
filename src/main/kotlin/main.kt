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