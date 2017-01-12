package quote

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def serviceMethod() {

    }
    boolean trasactional = false
    def getStaticQuote(){
        return new Quote(author: "Anonymous", content: "Real programmers do not eat quiche.")
    }
    def getRandomQuote(){
        def allQuotes = Quote.list()
        def randomQuote = null
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
