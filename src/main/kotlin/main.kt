import kotlinx.html.dom.*; import kotlinx.html.*; import org.w3c.dom.* import kotlin.browser.window
fun main(): Unit = with(kotlin.browser.document) { addEventListener("load", {
    val go = getElementById("go") as HTMLButtonElement; var food = 7; var tp = 7; var days = 1; var sick = false;
    val stay = getElementById("stay") as HTMLButtonElement; fun roll() = kotlin.random.Random.nextInt(3,7);
    fun end() = when { food == 0 -> "You've run out of food!"; tp == 0 -> "You've run out of toilet paper!"; sick -> "You've been caught by sharp shadow of a fog!" else -> null};
    fun day() = body!!.append.div { h1 { +(end() ?: run { window.setTimeout({ window.location.href = "https://www.youtube.com/watch?v=2c4hnA8jXwo" },500); "You've been caught by a sharp shadow of a fog"}) } }
    go.addEventListener("click", { days++; food += roll(); tp += roll(); sick = kotlin.random.Random.nextDouble(.0,100.0) < 3.3; day() })
    stay.addEventListener("click", { days++; food--; tp--; day() })})}