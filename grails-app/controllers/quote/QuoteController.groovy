package quote

class QuoteController {
    def quoteService

    static scaffold = true

    def index() {
        render view: "index"
    }
    def home = {
        render "<h1>Real programmer do not eat Quiche</h1>"
    }
    def ajaxRandom = {
        def randomQuote = quoteService.getRandomQuote()
        render "<q>${randomQuote.content}</q>" +
                "<p>${randomQuote.author}</p>"
    }
    def random={
        def randomQuote = quoteService.getRandomQuote()
        [ quote : randomQuote ]
    }
    def testRandom={
        render "hi"
    }
}



