import io.ktor.client.HttpClient
import io.ktor.client.engine.js.Js


fun main() {
    val client = HttpClient(Js) {
        //install(JsonFeature)
    }
}