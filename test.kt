     fun main(args:Array<String>){
         val cards = listOf("ace", "king", "queen", "jack", "10", "9")
         val colors = listOf(" heart", " diamond", " spade", " club")
         var car: String // variable for preparing deck
         var deck = mutableListOf<String>() // whole deck
         var player1 = mutableListOf<String>() // player 1 cards
         //choose number of card in playing deck, give every player 5 to have maximum 20 cards, give everyone 1 card to get minimum 4 cards
         var numberOfCards1 = 5 // quantity of player 1 cards
         var player2 = mutableListOf<String>() // player 2 cards
         var numberOfCards2 = 5 // quantity of player 2 cards
         var player3 = mutableListOf<String>() // player 3 cards
         var numberOfCards3 = 5 // quantity of player 3 cards
         var player4 = mutableListOf<String>() // player 4 cards
         var numberOfCards4 = 5// quantity of player 4 cards
         var playingDeck = mutableListOf<String>() // deck using on single game
         //answer1 - type of set,
         // secondAnswer1 which 1 card, pair, first of two pairs, three of kind, straight, three from full, four of kind, colour in flush, small or big in royal flush.
         //thirdAnswer1 second pair in two pairs, pair in full house, colour in royal flush
         var answer1: String = "royal flush" // player1 decision(choosing set of cards or decision of checking)
         var secondAnswer1: String = "small" // player1 decision what type of set is it( Example: answer1 == pair second answer queen)
         var thirdAnswer1: String ="spade" // additional answer fo second pair in two pairs or pair in full house
         // answer2 only for checking
         var answer2: String = "check"// player2 decision(choosing set of cards or decision of checking)
         var secondAnswer2: String = ""
         var thirdAnswer2: String = ""
         var exist:Boolean

         for (card in cards) {
             for (color in colors) {
                 car = card
                 car += color
                 deck.add(car)
             }
         } // making deck

         deck.shuffle()
         player1=addingCardsPlayer1(numberOfCards1, deck)// player1 deck
         player2=addingCardsPlayer2(numberOfCards2, deck)// player2 deck
         player3=addingCardsPlayer3(numberOfCards3, deck)// player3 deck
         player4=addingCardsPlayer4(numberOfCards4, deck)// player4 deck
         playingDeck=playingDeck(player1, playingDeck)// adding player1 cards to playing deck
         playingDeck=playingDeck(player2, playingDeck)// adding player1 cards to playing deck
         playingDeck=playingDeck(player3, playingDeck)// adding player1 cards to playing deck
         playingDeck=playingDeck(player4, playingDeck)// adding player1 cards to playing deck

         if(answer1=="1 card"){
             exist=oneCard(secondAnswer1, playingDeck)
             if(exist){
                 numberOfCards2 +=1
             }else{
                 numberOfCards1 +=1
             }
         } else if(answer1=="pair"){
             exist=pair(secondAnswer1, playingDeck)
             if(exist){
                 numberOfCards2 +=1
             }else{
                 numberOfCards1 +=1
             }
         } else if(answer1=="two pairs"){
             exist=twoPairs(secondAnswer1, thirdAnswer1, playingDeck)
             if(exist){
                 numberOfCards2 +=1
             }else{
                 numberOfCards1 +=1
             }
         }else if(answer1=="three") {
             exist = threeOfKind(secondAnswer1, playingDeck)
             if (exist) {
                 numberOfCards2 += 1
             } else {
                 numberOfCards1 += 1
             }
         }else if(answer1=="straight") {
             exist = straight(secondAnswer1, playingDeck)
             if (exist) {
                 numberOfCards2 += 1
             } else {
                 numberOfCards1 += 1
             }
         }else if(answer1=="full"){
             exist=fullHouse(secondAnswer1, thirdAnswer1, playingDeck)
             if(exist){
                 numberOfCards2 +=1
             }else{
                 numberOfCards1 +=1
             }
         }else if(answer1=="four") {
             exist = fourOfKind(secondAnswer1, playingDeck)
             if (exist) {
                 numberOfCards2 += 1
             } else {
                 numberOfCards1 += 1
             }
         }else if(answer1=="flush") {
             exist = flush(secondAnswer1, playingDeck)
             if (exist) {
                 numberOfCards2 += 1
             } else {
                 numberOfCards1 += 1
             }
         }else if(answer1=="royal flush"){
             exist=royalFlush(secondAnswer1, thirdAnswer1, playingDeck)
             if(exist){
                 numberOfCards2 +=1
             }else{
                 numberOfCards1 +=1
             }
         }
     }