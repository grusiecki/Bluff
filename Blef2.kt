import sun.security.ec.point.ProjectivePoint

fun setLevel(set1:String):Int{
    var set= set1
    var level:Int = 0
    when (set) {
        "1 card" -> {
            level = 1
        }
        "pair" -> {
            level = 2
        }
        "two pairs" -> {
            level = 3
        }
        "three" -> {
            level = 4
        }
        "straight" -> {
            level = 5
        }
        "full" -> {
            level = 6
        }
        "four" -> {
            level = 7
        }
        "flush" -> {
            level =8
        }
        "royal flush" -> {
            level=9
        }
        else -> {
            level = 10
        }
    }
    return level
} // sets level to decide which is bigger
fun cardLevel(card1:String):Int{
    var card1 = card1
    var level = 0
    when (card1) {
        "9" -> {
            level = 1
        }
        "10" -> {
            level = 2
        }
        "jack" -> {
            level = 3
        }
        "queen" -> {
            level = 4
        }
        "king" -> {
            level = 5
        }
        "ace" -> {
            level = 6
        }
        "small" -> {
            level = 1
        }
        "big"->{
            level = 2
        }
        "club"->{
            level = 1
        }
        "spade"->{
            level = 2
        }
        "diamond"->{
            level=3
        }
        "heart"->{
            level = 4
        }
    }
    return level
} // cards level to decide which is bigger
fun correctCard(card1:String):Boolean{
    var card1 = card1
    var correct = false
    if(card1=="9" || card1=="10" || card1=="jack" || card1 == "queen" || card1 == "king" || card1=="ace"){
        correct = true
    }
    return correct
} // check what user wrote (name cards)
fun correctColor(card1:String):Boolean{
    var card1=card1
    var correct=false
    if(card1=="heart" || card1=="diamond" || card1=="club" || card1=="spade"){
        correct=true
    }
    return correct
} // check what user wrote (name colors)
fun correctBigOrSmall(card1:String):Boolean{
    var card1=card1
    var correct=false
    if(card1=="small" || card1=="big"){
        correct=true
    }
    return correct
}// check what user wrote (big or small)
fun smallerSet(set1: String, set2: String):Boolean{
    var set1 = setLevel(set1)
    var set2 = setLevel(set2)
    var correct= true
    correct = set1 >= set2
    return correct
} // which set is bigger
fun firstOrSecondPairIsBigger(level1: Int, level2:Int):Int{
    var level1 = level1
    var level2 =level2
    return if(level1>level2){
        level1
    } else{
        level2
    }
}//which pair is bigger in two pairs
fun firstOrSecondPairIsSmaller(level1: Int, level2:Int):Int{
    var level1 = level1
    var level2 = level2
    return if(level1<level2){
        level1
    } else{
        level2
    }
}//which pair is smaller in two pairs
fun addingCardsPlayer1(quantity:Int, deck:MutableList<String>):MutableList<String>{
    var player1= mutableListOf<String>()
    when(quantity){
        1 ->{
            player1.add(deck[1])
    }
        2 ->{
        player1.add(deck[1])
        player1.add(deck[2])
    }
        3 ->{
        player1.add(deck[1])
        player1.add(deck[2])
        player1.add(deck[3])
    }
        4 -> {
        player1.add(deck[1])
        player1.add(deck[2])
        player1.add(deck[3])
        player1.add(deck[4])
    }
        5 -> {
        player1.add(deck[1])
        player1.add(deck[2])
        player1.add(deck[3])
        player1.add(deck[4])
        player1.add(deck[5])
    }
    }
    return player1
} // adding cards for player1 deck
fun addingCardsPlayer2(quantity:Int, deck:MutableList<String>):MutableList<String>{
    var player2 = mutableListOf<String>()
    when(quantity){
        1 ->{
            player2.add(deck[6])
        }
        2 ->{
            player2.add(deck[6])
            player2.add(deck[7])
        }
        3 ->{
            player2.add(deck[6])
            player2.add(deck[7])
            player2.add(deck[8])
        }
        4 -> {
            player2.add(deck[6])
            player2.add(deck[7])
            player2.add(deck[8])
            player2.add(deck[9])
        }
        5 -> {
            player2.add(deck[6])
            player2.add(deck[7])
            player2.add(deck[8])
            player2.add(deck[9])
            player2.add(deck[10])
        }
    }
    return player2
} // adding cards for player2 deck
fun addingCardsPlayer3(quantity: Int, deck:MutableList<String>):MutableList<String>{
    var player3= mutableListOf<String>()
    when(quantity){
        1 ->{
            player3.add(deck[11])
        }
        2 ->{
            player3.add(deck[11])
            player3.add(deck[12])
        }
        3 ->{
            player3.add(deck[11])
            player3.add(deck[12])
            player3.add(deck[13])
        }
        4 -> {
            player3.add(deck[11])
            player3.add(deck[12])
            player3.add(deck[13])
            player3.add(deck[14])
        }
        5 -> {
            player3.add(deck[11])
            player3.add(deck[12])
            player3.add(deck[13])
            player3.add(deck[14])
            player3.add(deck[15])
        }
    }
    return player3
} // adding cards for player3 deck
fun addingCardsPlayer4(quantity: Int, deck: MutableList<String>):MutableList<String>{
    var player4 = mutableListOf<String>()
    when(quantity){
        1 ->{
            player4.add(deck[16])
        }
        2 ->{
            player4.add(deck[16])
            player4.add(deck[17])
        }
        3 ->{
            player4.add(deck[16])
            player4.add(deck[17])
            player4.add(deck[18])
        }
        4 -> {
            player4.add(deck[16])
            player4.add(deck[17])
            player4.add(deck[18])
            player4.add(deck[19])
        }
        5 -> {
            player4.add(deck[16])
            player4.add(deck[17])
            player4.add(deck[18])
            player4.add(deck[19])
            player4.add(deck[20])
        }
    }
    return player4
} // adding cards for player4 deck
fun playingDeck(playerDeck: MutableList<String>, deckPlay: MutableList<String>):MutableList<String>{
    var playingDeck = deckPlay
    for(card in playerDeck){
        playingDeck.add(card)
    }
    return playingDeck
} // addding cards to playing deck
fun oneCard(card1:String, playingDeck: MutableList<String>): Boolean{
    var card1 = card1
    var car:String
    var correct = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            correct = true
            break
        }
    }
    return correct
}//do choosen 1 card exist in playing deck
fun pair(card1: String,playingDeck: MutableList<String>):Boolean{

    var car:String
    var count = 0
    var correct = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            count+=1
            if(count==2){
                correct = true
                break
            }
        }
    }
    return correct
} // do choosen pair exist in playing deck
fun twoPairs(card1: String, card2: String, playingDeck: MutableList<String>):Boolean{
    var car:String
    var count = 0
    var count2 = 0
    var correct = false
    var correct1= false
    var correct2 = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            count+=1
            if(count>=2){
                correct1 = true
                 break
            }
        }
    }
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card2){
            count2+=1
            if(count2>=2){
                correct2 = true
                break
            }
        }
    }
    if(correct1 && correct2){
        correct=true
    }
    return correct
}// do choosen pairs exist in playing deck
fun threeOfKind(card1: String, playingDeck: MutableList<String>):Boolean{
    var car:String
    var count = 0
    var correct = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            count+=1
            if(count==3){
                correct = true
                break
            }
        }
    }
    return correct
} // do choosen three of kind exist in playing deck
fun straight(card1: String, playingDeck: MutableList<String>):Boolean{
    var card1 = card1
    var car:String
    var correct = false
    var c1 = false
    var c2 = false
    var c3 = false
    var c4 = false
    var c5 = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        when (car) {
            "10" -> {
                c2=true
            }
            "jack" -> {
                c3=true
            }
            "queen" -> {
                c4 = true
            }
            "king" -> {
                c5 = true
            }
        }
        if(card1 == "small"){
            if(car== "9"){
                c1=true
            }
        }else if(card1 =="big"){
            if(car=="ace"){
                c1=true
            }
        }

    }
    correct = c1==true&&c2==true&&c3==true&&c4==true&&c5==true
    return correct
} // do choosen straight exist in playing deck
fun fullHouse(card1: String, card2: String, playingDeck: MutableList<String>):Boolean{
    var car:String
    var count = 0
    var count2 = 0
    var correct = false
    var correct1= false
    var correct2 = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            count+=1
            if(count>=3){
                correct1 = true
                break
            }
        }
    }
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card2){
            count2+=1
            if(count2>=2){
                correct2 = true
                break
            }
        }
    }
    if(correct1 && correct2){
        correct=true
    }
    return correct
} // do choosen full house exist in playing deck
fun fourOfKind(card1: String, playingDeck: MutableList<String>):Boolean{
    var car:String
    var count = 0
    var correct = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[0]
        if (car== card1){
            count+=1
            if(count==4){
                correct = true
                break
            }
        }
    }
    return correct
} // do choosen four of kind exist in playing deck
fun flush(card1:String, playingDeck: MutableList<String>):Boolean{
    var card1 = card1
    var car:String
    var count = 0
    var correct = false
    for(card in playingDeck){
        car=card.split("\\s".toRegex())[1]
        if(car==card1){
          count +=1
        }
    }
    if (count>=5){
        correct = true
    }
    return correct
} // do choosen flush exist in playing deck
fun royalFlush(card1: String, card2: String,playingDeck: MutableList<String>):Boolean{
    var card1 = card1
    var car:String
    var c1 = false
    var c2 = false
    var c3 = false
    var c4 = false
    var c5 = false
    var correct = false
    for(card in playingDeck){
        if(card== "10 $card2"){
            c2 = true
        }else if(card=="jack $card2"){
            c3=true
        } else if(card=="queen $card2"){
            c4 = true
        }else if(card=="king $card2"){
            c5=true
        }
        if(card1=="small"){
            if(card== "9 $card2"){
                c1=true
            }
        }else if(card1=="big"){
            if(card== "ace $card2"){
                c1= true
            }
        }
    }
    correct = c1==true&&c2==true&&c3==true&&c4==true&&c5==true
    return correct
} // do choosen royalFlush exist in playing deck
fun main(args: Array<String>) {
    val cards = listOf("ace", "king", "queen", "jack", "10", "9")
    val colors = listOf(" heart", " diamond", " spade", " club")
    var car: String // variable for preparing deck
    var deck = mutableListOf<String>() // whole deck
    var player1 = mutableListOf<String>() // player 1 cards
    var numberOfCards1 = 1 // quantity of player 1 cards
    var player2 = mutableListOf<String>() // player 2 cards
    var numberOfCards2 = 1 // quantity of player 2 cards
    var player3 = mutableListOf<String>() // player 3 cards
    var numberOfCards3 = 1 // quantity of player 3 cards
    var player4 = mutableListOf<String>() // player 4 cards
    var numberOfCards4 = 1 // quantity of player 4 cards
    var playingDeck = mutableListOf<String>() // deck using on single game
    var numberOfPlayers: Int = 0 // numbers of players
    var cardLevel1 = 0 // levels of cards
    var cardLevel2 = 0
    var secondCardLevel1 = 0
    var secondCardLevel2 = 0
    var correct:Boolean = false // checking if decision is correct
    var player2Correct = false
    var player3Correct = false
    var player4Correct = false
    var correct2 =false // checking player write correct
    var correct3=false // checking player write correct
    var check = false // checking if set is not lower from before player set
    var exist = false // if that cards really exist in playing deck
    var name1: String = "1" // player1 name
    var name2: String = "2"// player2 name
    var name3: String = "3"// player3 name
    var name4: String = "4" // player4 name
    var answer1: String = "1 card" // player1 decision(choosing set of cards or decision of checking)
    var secondAnswer1: String = "" // player1 decision what type of set is it( Example: answer1 == pair second answer queen)
    var thirdAnswer1: String ="" // additional answer fo second pair in two pairs or pair in full house
    var answer2: String = "1 card"// player2 decision(choosing set of cards or decision of checking)
    var secondAnswer2: String = ""
    var thirdAnswer2: String = ""
    var answer3: String ="1 card"// player3 decision(choosing set of cards or decision of checking)
    var secondAnswer3: String =""
    var thirdAnswer3:String =""
    var answer4: String ="1 card"// player4 decision(choosing set of cards or decision of checking)
    var secondAnswer4: String = ""
    var thirdAnswer4: String = ""
    for (card in cards) {
        for (color in colors) {
            car = card
            car += color
            deck.add(car)
        }
    } // making deck
    do{
    println("Enter number of players (2-4)")
    numberOfPlayers = readLine()!!.toInt()
        if (numberOfPlayers != 2 && numberOfPlayers != 3 && numberOfPlayers != 4){
            println("Wrong quantity - select number from 2 to 4")
        }
    } while(numberOfPlayers != 2 && numberOfPlayers != 3 && numberOfPlayers != 4  ) //choosing quantity of players
    when (numberOfPlayers) {
        4 -> {
            println("Enter name of Player 1")
            name1 = readLine()!!.toString()
            println("Enter name of Player 2")
            name2 = readLine()!!.toString()
            println("Enter name of Player 3")
            name3 = readLine()!!.toString()
            println("Enter name of Player 4")
            name4= readLine()!!.toString()
        }
        3 -> {
            println("Enter name of Player 1")
            name1 = readLine()!!.toString()
            println("Enter name of Player 2")
            name2 = readLine()!!.toString()
            println("Enter name of Player 3")
            name3 = readLine()!!.toString()
        }
        2 -> {
            println("Enter name of Player 1")
            name1 = readLine()!!.toString()
            println("Enter name of Player 2")
            name2 = readLine()!!.toString()
        }
    } // adding names of players
    while (numberOfPlayers == 4){
        deck.shuffle()
        player1=addingCardsPlayer1(numberOfCards1, deck)// player1 deck
        player2=addingCardsPlayer2(numberOfCards2, deck)// player2 deck
        player3=addingCardsPlayer3(numberOfCards3, deck)// player3 deck
        player4=addingCardsPlayer4(numberOfCards4, deck)// player4 deck
        while(answer1 != "check" && answer2 != "check" && answer3 != "check" && answer4 != "check") {
            while (!correct) //player1 decision
                 {
                while (!check) {
                    println("Your deck: $player1")
                    println("$name1: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer1 = readLine()!!.toString()
                    check = smallerSet(answer1, answer4)
                    if (!check) {
                        println("your set cannot be smaller then $answer4")
                    }
                }
                     if (answer1 == "check") {
                     break
                 } else if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "four") {
                    while (!correct2) {
                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "full") // decision player1
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer1)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                        correct = true
                    }
                } else if (answer1 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                        correct = true
                    }
                } else if (answer1 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer1 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer1)
                        if (!correct3) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    correct = true
                         if(secondAnswer1=="big" && thirdAnswer1=="heart"){
                             break
                         }
                }  else {
                    println("write correct name of set")
                    correct = false
                    check = false
                }
                if (answer1 == answer4) {
                    cardLevel1 = cardLevel(secondAnswer1)
                    cardLevel2 = cardLevel(secondAnswer4)
                    secondCardLevel1 = cardLevel(thirdAnswer1)
                    secondCardLevel2 = cardLevel(thirdAnswer4)

                    if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "straight" || answer1 == "four" || answer1 == "flush") {

                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer4 $secondAnswer4")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer4 $secondAnswer4")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                correct = true
                            }
                        }

                    } else if (answer1 == "full" || answer1 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer1 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                                correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }
                player2Correct = false

            }
            if (answer1 == "check"||(secondAnswer1=="big" && thirdAnswer1=="heart")) {
                break
            }else{
            correct2 = false
            correct3 = false
            check = false}

            while (!player2Correct) //player2 decison
            {
                while (!check) {
                    println("Your deck: $player2")
                    println("$name2: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer2 = readLine()!!.toString()
                    check = smallerSet(answer2, answer1)
                    if (!check) {
                        println("your set cannot be smaller then $answer1")
                    }
                }
                if (answer2 == "check") {
                break
                }
                else if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "four") {
                    while (!correct2) {

                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "full") //decision player2
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer2)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    correct = true
                } else if (answer2 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer2 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer2)
                        if (!correct3) {
                            println("write correct word(small or big")
                        }
                    }
                    if(secondAnswer2=="big" && thirdAnswer2=="heart"){
                        break
                    }
                    player2Correct = true
                } else {
                    println("write correct name of set")
                    player2Correct = false
                    check = false
                }
                if (answer2 == answer1) {
                    cardLevel1 = cardLevel(secondAnswer2)
                    cardLevel2 = cardLevel(secondAnswer1)
                    secondCardLevel1 = cardLevel(thirdAnswer2)
                    secondCardLevel2 = cardLevel(thirdAnswer1)

                    if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "straight" || answer2 == "four" || answer2 == "flush") {
                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                player2Correct = true
                            }
                        }
                    } else if (answer2 == "full" || answer2 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer2 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                                player2Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }

            player3Correct=false
            }
            if (answer2 == "check" || (secondAnswer2=="big" && thirdAnswer2=="heart")) {
                break
            }else{
            correct2 = false
            correct3 = false
            check = false}
              while(!player3Correct) {
                  while (!check) {
                      println("Your deck $player3")
                      println("$name3: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                      answer3 = readLine()!!.toString()
                      check = smallerSet(answer3, answer2)
                      if (!check) {
                          println("your set cannot be smaller then $answer2")
                      }
                  }
                  if (answer3 == "check") {
                      break
                  } else if (answer3 == "1 card" || answer3 == "pair" || answer3 == "three" || answer3 == "four") {
                          while (!correct2) {
                              println("of: (9, 10, jack, queen, king, ace)")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctCard(secondAnswer3)
                              if (!correct2) {
                                  println("write correct card(9, 10, jack, queen, king, ace")
                              }
                              player3Correct = true
                          }

                  } else if (answer3 == "two pairs") {
                          while (!correct2) {
                              println("write first pair:")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctCard(secondAnswer3)
                              if (!correct2) {
                                  println("write correct card(9, 10, jack, queen, king, ace")
                              }
                          }
                          while (!correct3) {
                              println("write second pair:")
                              while (secondAnswer3 == thirdAnswer3) {
                                  println("your second pair cannot be identical to first")
                                  println("write second pair")
                                  secondAnswer3 = readLine()!!.toString()
                              }
                              thirdAnswer3 = readLine()!!.toString()
                              correct3 = correctCard(thirdAnswer3)
                              if (!correct3) {
                                  println("write correct card(9, 10, jack, queen, king, ace")
                              }
                          }
                          player3Correct = true
                  } else if (answer3 == "full") // decision player3
                      {
                          while (!correct2) {
                              println("write three of kind:")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctCard(secondAnswer3)
                              if (!correct2) {
                                  println("write correct card(9, 10, jack, queen, king, ace")
                              }
                          }
                          while (!correct3) {
                              println("write a pair:")
                              thirdAnswer3 = readLine()!!.toString()
                              while (secondAnswer3 == thirdAnswer3) {
                                  println("your pair cannot be identical to your three of kind")
                                  println("write second pair")
                                  secondAnswer1 = readLine()!!.toString()
                              }
                              correct3 = correctCard(thirdAnswer3)
                              if (!correct3) {
                                  println("write correct card(9, 10, jack, queen, king, ace")
                              }
                          }
                          player3Correct = true
                  } else if (answer3 == "flush") {
                          while (!correct2) {
                              println(" write color")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctColor(secondAnswer3)
                              if (!correct2) {
                                  println("write correct color(heart, diamond, spade, club")
                              }
                          }
                          player3Correct = true
                  } else if (answer3 == "straight") {
                          while (!correct2) {
                              println("small or big? ( small from 9 to king, big from 10 to ace")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctBigOrSmall(secondAnswer3)
                              if (!correct2) {
                                  println("write correct word: big or small")
                              }
                          }
                          player3Correct = true
                  } else if (answer3 == "royal flush") {
                          while (!correct2) {
                              println("small or big? ( small from 9 to king, big from 10 to ace")
                              secondAnswer3 = readLine()!!.toString()
                              correct2 = correctBigOrSmall(secondAnswer3)
                              if (!correct2) {
                                  println("write correct word: big or small")
                              }
                          }
                          while (!correct3) {
                              println("which color?")
                              thirdAnswer3 = readLine()!!.toString()
                              correct3 = correctColor(thirdAnswer3)
                              if (!correct3) {
                                  println("write correct color(heart, diamond, spade, club")
                              }
                          }
                          player3Correct = true
                      if(secondAnswer3=="big" && thirdAnswer3=="heart"){
                          break
                      }
                  } else {
                          println("write correct name of set")
                          player3Correct = false
                          check = false
                      }
                      if (answer3 == answer2) {
                          cardLevel1 = cardLevel(secondAnswer3)
                          cardLevel2 = cardLevel(secondAnswer2)
                          secondCardLevel1 = cardLevel(thirdAnswer3)
                          secondCardLevel2 = cardLevel(thirdAnswer2)

                          if (answer3 == "1 card" || answer3 == "pair" || answer3 == "three" || answer3 == "straight" || answer3 == "four" || answer3 == "flush") {
                              when {
                                  cardLevel1 == cardLevel2 -> {
                                      println("you must choose bigger set then $answer2 $secondAnswer2")
                                      player3Correct = false
                                      correct2 = false
                                      check = false
                                  }
                                  cardLevel1 < cardLevel2 -> {
                                      println("you must choose bigger set then $answer2 $secondAnswer2")
                                      player3Correct = false
                                      correct2 = false
                                      check = false
                                  }
                                  else -> {
                                      player3Correct = true
                                  }
                              }
                          } else if (answer3 == "full" || answer3 == "royal flush") {
                              if (cardLevel1 < cardLevel2) {
                                  println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                  player3Correct = false
                                  correct2 = false
                                  correct3 = false
                                  check = false
                              } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                                  println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                  player3Correct = false
                                  correct2 = false
                                  correct3 = false
                                  check = false
                              }
                          } else if (answer3 == "two pairs") {
                              if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                      cardLevel2,
                                      secondCardLevel2)
                              ) {
                                  println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                  player3Correct = false
                                  correct2 = false
                                  correct3 = false
                                  check = false
                              } else if (firstOrSecondPairIsBigger(cardLevel1,
                                      secondCardLevel1) == firstOrSecondPairIsBigger(cardLevel2, secondCardLevel2)
                              ) {
                                  if (firstOrSecondPairIsSmaller(cardLevel1,
                                          secondCardLevel1) <= firstOrSecondPairIsSmaller(cardLevel2, secondCardLevel2)
                                  ) {
                                      println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                      player3Correct = false
                                      correct2 = false
                                      correct3 = false
                                      check = false
                                  }
                              }
                          }

                      }

                player4Correct=false
              }
            if (answer3 == "check"|| (secondAnswer3=="big" && thirdAnswer3=="heart")) {
                break
            }else{
            correct2 = false
            correct3 = false
            check = false}
                while(!player4Correct) {
                    while (!check) {
                        println("Your deck: $player4")
                        println("$name4: write what kind of set is in plaiyng deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                        answer4 = readLine()!!.toString()
                        check = smallerSet(answer4, answer3)
                        if (!check) {
                            println("your set cannot be smaller then $answer3")
                        }
                    }
                    if (answer4 == "check") {
                        break
                    }
                    else if (answer4 == "1 card" || answer4 == "pair" || answer4 == "three" || answer4 == "four") // decision player4
                    {
                        while (!correct2) {
                            println("of: (9, 10, jack, queen, king, ace)")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctCard(secondAnswer4)
                            if (!correct2) {
                                println("write correct card(9, 10, jack, queen, king, ace")
                            }
                        }
                        player4Correct = true
                    } else if (answer4 == "two pairs") {
                        while (!correct2) {
                            println("write first pair:")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctCard(secondAnswer4)
                            if (!correct2) {
                                println("write correct card(9, 10, jack, queen, king, ace")
                            }
                        }
                        while (!correct3) {
                            println("write second pair:")
                            thirdAnswer4 = readLine()!!.toString()
                            while (secondAnswer4 == thirdAnswer4) {
                                println("your second pair cannot be identical to first")
                                println("write second pair")
                                secondAnswer4 = readLine()!!.toString()
                            }
                            correct3 = correctCard(thirdAnswer4)
                        }
                        player4Correct = true
                    } else if (answer4 == "full") {
                        while (!correct2) {
                            println("write three of kind:")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctCard(secondAnswer4)
                            if (!correct2) {
                                println("write correct card(9, 10, jack, queen, king, ace")
                            }
                        }
                        while (!correct3) {
                            println("write a pair:")
                            thirdAnswer4 = readLine()!!.toString()
                            correct3 = correctCard(thirdAnswer4)
                            while (secondAnswer4 == thirdAnswer4) {
                                println("your pair cannot be identical to your three of kind")
                                println("write second pair")
                                secondAnswer4 = readLine()!!.toString()
                            }
                            if (!correct3) {
                                println("write correct card(9, 10, jack, queen, king, ace")
                            }
                        }
                        player4Correct = true
                    } else if (answer4 == "flush") {
                        while (!correct2) {
                            println(" write color")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctColor(secondAnswer4)
                            if (!correct2) {
                                println("write correct color(heart, diamond, spade, club")
                            }
                        }
                        player4Correct = true
                    } else if (answer4 == "straight") {
                        while (!correct2) {
                            println("small or big? ( small from 9 to king, big from 10 to ace")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctBigOrSmall(secondAnswer4)
                            if (!correct2) {
                                println("write correct word: small or big")
                            }
                        }
                        player4Correct = true
                    } else if (answer4 == "royal flush") {
                        while (!correct2) {
                            println("small or big? ( small from 9 to king, big from 10 to ace")
                            secondAnswer4 = readLine()!!.toString()
                            correct2 = correctCard(secondAnswer4)
                            if (!correct2) {
                                println("write correct word: small or big")
                            }
                        }
                        while (!correct3) {
                            println("which color?")
                            thirdAnswer4 = readLine()!!.toString()
                            correct3 = correctColor(thirdAnswer4)
                            if (!correct3) {
                                println("write correct color(heart, diamond, spade, club")
                            }
                        }
                        if(secondAnswer4=="big" && thirdAnswer4=="heart"){
                            break
                        }
                        player4Correct = true
                    }  else {
                        println("write correct name of set")
                        player4Correct = false
                        check = false
                    }
                    if (answer4 == answer3) {
                        cardLevel1 = cardLevel(secondAnswer4)
                        cardLevel2 = cardLevel(secondAnswer3)
                        secondCardLevel1 = cardLevel(thirdAnswer4)
                        secondCardLevel2 = cardLevel(thirdAnswer3)

                        if (answer4 == "1 card" || answer4 == "pair" || answer4 == "three" || answer4 == "straight" || answer4 == "four" || answer4 == "flush") {
                            when {
                                cardLevel1 == cardLevel2 -> {
                                    println("you must choose bigger set then $answer3 $secondAnswer3")
                                    player4Correct = false
                                    correct2 = false
                                    check = false
                                }
                                cardLevel1 < cardLevel2 -> {
                                    println("you must choose bigger set then $answer3 $secondAnswer3")
                                    player4Correct = false
                                    correct2 = false
                                    check = false
                                }
                                else -> {
                                    player4Correct = true
                                }
                            }
                        } else if (answer4 == "full" || answer4 == "royal flush") {
                            if (cardLevel1 < cardLevel2) {
                                println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                                player4Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                                println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                                player4Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        } else if (answer4 == "two pairs") {
                            if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                                player4Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            } else if (firstOrSecondPairIsBigger(cardLevel1,
                                    secondCardLevel1) == firstOrSecondPairIsBigger(cardLevel2, secondCardLevel2)
                            ) {
                                if (firstOrSecondPairIsSmaller(cardLevel1,
                                        secondCardLevel1) <= firstOrSecondPairIsSmaller(cardLevel2, secondCardLevel2)
                                ) {
                                    println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                                    player4Correct = false
                                    correct2 = false
                                    correct3 = false
                                    check = false
                                }
                            }
                        }

                    }

                correct=false
                }
            if (answer4 == "check"||(secondAnswer4=="big" && thirdAnswer4=="heart")) {
                break
            }else{
            correct2 = false
            correct3 = false
            check = false}
        }


        playingDeck=playingDeck(player1, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player2, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player3, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player4, playingDeck)// adding player1 cards to playing deck


        if(answer1 == "check"||(secondAnswer4=="big" && thirdAnswer4=="heart")){
            if(answer4=="1 card"){
                exist=oneCard(secondAnswer4, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                }else{
                    numberOfCards4 +=1
                    println("$answer4 $secondAnswer4  did not exists!")
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            } else if(answer1=="pair"){
                exist=pair(secondAnswer4, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                }else{
                    numberOfCards4 +=1
                    println("$answer4 $secondAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            } else if(answer4=="two pairs"){
                exist=twoPairs(secondAnswer4, thirdAnswer4, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4 exists!" )
                    correct=false
                }else{
                    numberOfCards4 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="three") {
                exist = threeOfKind(secondAnswer4, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                } else {
                    numberOfCards4 += 1
                    println("$answer4 $secondAnswer4  did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="straight") {
                exist = straight(secondAnswer4, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                } else {
                    numberOfCards4 += 1
                    println("$answer4 $secondAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="full"){
                exist=fullHouse(secondAnswer4, thirdAnswer4, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4  exists!" )
                    correct=false
                }else{
                    numberOfCards4 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="four") {
                exist = fourOfKind(secondAnswer4, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                } else {
                    numberOfCards4 += 1
                    println("$answer4 $secondAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="flush") {
                exist = flush(secondAnswer4, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer4 $secondAnswer4  exists!" )
                    correct=false
                } else {
                    numberOfCards4 += 1
                    println("$answer4 $secondAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }else if(answer4=="royal flush"){
                exist=royalFlush(secondAnswer4, thirdAnswer4, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4 exists!" )
                    correct=false
                }else{
                    numberOfCards4 +=1
                    println("$answer4 $secondAnswer4 $thirdAnswer4 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }
            }
        }else if(answer2=="check"||(secondAnswer1=="big" && thirdAnswer1=="heart")){
            if(answer1=="1 card"){
                exist=oneCard(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="pair"){
                exist=pair(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="two pairs"){
                exist=twoPairs(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="three") {
                exist = threeOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="straight") {
                exist = straight(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="full"){
                exist=fullHouse(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="four") {
                exist = fourOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="flush") {
                exist = flush(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="royal flush"){
                exist=royalFlush(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }
        }else if(answer3=="check"||(secondAnswer2=="big" && thirdAnswer2=="heart")){
            if(answer2=="1 card"){
                exist=oneCard(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="pair"){
                exist=pair(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="two pairs"){
                exist=twoPairs(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="three") {
                exist = threeOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="straight") {
                exist = straight(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="full"){
                exist=fullHouse(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="four") {
                exist = fourOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="flush") {
                exist = flush(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="royal flush"){
                exist=royalFlush(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }
        }else if(answer4=="check"||(secondAnswer3=="big" && thirdAnswer3=="heart")){
            if(answer3=="1 card"){
                exist=oneCard(secondAnswer3, playingDeck)
                if(exist){
                    numberOfCards4 +=1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            } else if(answer3=="pair"){
                exist=pair(secondAnswer3, playingDeck)
                if(exist){
                    numberOfCards4 +=1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            } else if(answer3=="two pairs"){
                exist=twoPairs(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards4 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="three") {
                exist = threeOfKind(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards4 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="straight") {
                exist = straight(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards4 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="full"){
                exist=fullHouse(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards4 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="four") {
                exist = fourOfKind(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards4 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="flush") {
                exist = flush(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards4 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="royal flush"){
                exist=royalFlush(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards4 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=true
                    player4Correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }
        }
        when {
            numberOfCards1>5 -> {
                println("$name1 has lost!")
                numberOfPlayers=3
                name1=name2
                numberOfCards1=numberOfCards2
                name2=name3
                numberOfCards2=numberOfCards3
                name3=name4
                numberOfCards3=numberOfCards4
            }
            numberOfCards2>5 -> {
                println("$name2 has lost!")
                numberOfPlayers=3
                name2=name3
                numberOfCards2=numberOfCards3
                name3=name4
                numberOfCards3=numberOfCards4
            }
            numberOfCards3>5 -> {
                println("$name3 has lost")
                numberOfPlayers=3
                name3=name4
                numberOfCards3=numberOfCards4
            }
            numberOfCards4>5 -> {
                println("$name4 has lost")
                numberOfPlayers=3
            }
        }

        correct2 = false
        correct3 = false
        check = false
        answer1="1 card"
        secondAnswer1= ""
        thirdAnswer1 =""
        answer2 = "1 card"
        secondAnswer2 = ""
        thirdAnswer2 = ""
        answer3 ="1 card"
        secondAnswer3 =""
        thirdAnswer3 =""
        answer4 ="1 card"
        secondAnswer4 = ""
        thirdAnswer4 = ""
        playingDeck.clear()
        player1.clear()
        player2.clear()
        player3.clear()
        player4.clear()
    }

    while (numberOfPlayers == 3){
        deck.shuffle()
        player1=addingCardsPlayer1(numberOfCards1, deck)// player1 deck
        player2=addingCardsPlayer2(numberOfCards2, deck)// player2 deck
        player3=addingCardsPlayer3(numberOfCards3, deck)// player3 deck
        while(answer1 != "check" && answer2 != "check" && answer3 != "check" ) {
            while (!correct) //player1 decision
            {
                while (!check) {
                    println("Your deck: $player1")
                    println("$name1: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer1 = readLine()!!.toString()
                    check = smallerSet(answer1, answer3)
                    if (!check) {
                        println("your set cannot be smaller then $answer3")
                    }
                }
                if (answer1 == "check") {
                    break
                } else if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "four") {
                    while (!correct2) {
                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "full") // decision player1
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer1)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                        correct = true
                    }
                } else if (answer1 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                        correct = true
                    }
                } else if (answer1 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer1 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer1)
                        if (!correct3) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    correct = true
                    if(secondAnswer1=="big" && thirdAnswer1=="heart"){
                        break
                    }
                }  else {
                    println("write correct name of set")
                    correct = false
                    check = false
                }
                if (answer1 == answer3) {
                    cardLevel1 = cardLevel(secondAnswer1)
                    cardLevel2 = cardLevel(secondAnswer3)
                    secondCardLevel1 = cardLevel(thirdAnswer1)
                    secondCardLevel2 = cardLevel(thirdAnswer3)

                    if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "straight" || answer1 == "four" || answer1 == "flush") {

                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer3 $secondAnswer3")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer3 $secondAnswer3")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                correct = true
                            }
                        }

                    } else if (answer1 == "full" || answer1 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer1 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                                correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }
                player2Correct = false

            }
            if (answer1 == "check"||(secondAnswer1=="big" && thirdAnswer1=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}

            while (!player2Correct) //player2 decison
            {
                while (!check) {
                    println("Your deck: $player2")
                    println("$name2: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer2 = readLine()!!.toString()
                    check = smallerSet(answer2, answer1)
                    if (!check) {
                        println("your set cannot be smaller then $answer1")
                    }
                }
                if (answer2 == "check") {
                    break
                }
                else if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "four") {
                    while (!correct2) {

                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "full") //decision player2
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer2)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    correct = true
                } else if (answer2 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer2 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer2)
                        if (!correct3) {
                            println("write correct word(small or big")
                        }
                    }
                    if(secondAnswer2=="big" && thirdAnswer2=="heart"){
                        break
                    }
                    player2Correct = true
                } else {
                    println("write correct name of set")
                    player2Correct = false
                    check = false
                }
                if (answer2 == answer1) {
                    cardLevel1 = cardLevel(secondAnswer2)
                    cardLevel2 = cardLevel(secondAnswer1)
                    secondCardLevel1 = cardLevel(thirdAnswer2)
                    secondCardLevel2 = cardLevel(thirdAnswer1)

                    if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "straight" || answer2 == "four" || answer2 == "flush") {
                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                player2Correct = true
                            }
                        }
                    } else if (answer2 == "full" || answer2 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer2 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                                player2Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }

                player3Correct=false
            }
            if (answer2 == "check" || (secondAnswer2=="big" && thirdAnswer2=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}
            while(!player3Correct) {
                while (!check) {
                    println("Your deck $player3")
                    println("$name3: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer3 = readLine()!!.toString()
                    check = smallerSet(answer3, answer2)
                    if (!check) {
                        println("your set cannot be smaller then $answer2")
                    }
                }
                if (answer3 == "check") {
                    break
                } else if (answer3 == "1 card" || answer3 == "pair" || answer3 == "three" || answer3 == "four") {
                    while (!correct2) {
                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer3)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                        player3Correct = true
                    }

                } else if (answer3 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer3)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair:")
                        while (secondAnswer3 == thirdAnswer3) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer3 = readLine()!!.toString()
                        }
                        thirdAnswer3 = readLine()!!.toString()
                        correct3 = correctCard(thirdAnswer3)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player3Correct = true
                } else if (answer3 == "full") // decision player3
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer3)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer3 = readLine()!!.toString()
                        while (secondAnswer3 == thirdAnswer3) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer3)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player3Correct = true
                } else if (answer3 == "flush") {
                    while (!correct2) {
                        println(" write color")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer3)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    player3Correct = true
                } else if (answer3 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer3)
                        if (!correct2) {
                            println("write correct word: big or small")
                        }
                    }
                    player3Correct = true
                } else if (answer3 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer3 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer3)
                        if (!correct2) {
                            println("write correct word: big or small")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer3 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer3)
                        if (!correct3) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    player3Correct = true
                    if(secondAnswer3=="big" && thirdAnswer3=="heart"){
                        break
                    }
                } else {
                    println("write correct name of set")
                    player3Correct = false
                    check = false
                }
                if (answer3 == answer2) {
                    cardLevel1 = cardLevel(secondAnswer3)
                    cardLevel2 = cardLevel(secondAnswer2)
                    secondCardLevel1 = cardLevel(thirdAnswer3)
                    secondCardLevel2 = cardLevel(thirdAnswer2)

                    if (answer3 == "1 card" || answer3 == "pair" || answer3 == "three" || answer3 == "straight" || answer3 == "four" || answer3 == "flush") {
                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer2 $secondAnswer2")
                                player3Correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer2 $secondAnswer2")
                                player3Correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                player3Correct = true
                            }
                        }
                    } else if (answer3 == "full" || answer3 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            player3Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            player3Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer3 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            player3Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1,
                                secondCardLevel1) == firstOrSecondPairIsBigger(cardLevel2, secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1,
                                    secondCardLevel1) <= firstOrSecondPairIsSmaller(cardLevel2, secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                player3Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }

                correct=false
            }
            if (answer3 == "check"|| (secondAnswer3=="big" && thirdAnswer3=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}


        }


        playingDeck=playingDeck(player1, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player2, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player3, playingDeck)// adding player1 cards to playing deck



        if(answer1 == "check"||(secondAnswer3=="big" && thirdAnswer3=="heart")){
            if(answer3=="1 card"){
                exist=oneCard(secondAnswer3, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3  did not exists!")
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            } else if(answer1=="pair"){
                exist=pair(secondAnswer3, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            } else if(answer3=="two pairs"){
                exist=twoPairs(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 exists!" )
                    correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false

                }
            }else if(answer3=="three") {
                exist = threeOfKind(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3  did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false

                }
            }else if(answer3=="straight") {
                exist = straight(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="full"){
                exist=fullHouse(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3  exists!" )
                    correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="four") {
                exist = fourOfKind(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="flush") {
                exist = flush(secondAnswer3, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer3 $secondAnswer3  exists!" )
                    correct=false
                } else {
                    numberOfCards3 += 1
                    println("$answer3 $secondAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }else if(answer3=="royal flush"){
                exist=royalFlush(secondAnswer3, thirdAnswer3, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 exists!" )
                    correct=false
                }else{
                    numberOfCards3 +=1
                    println("$answer3 $secondAnswer3 $thirdAnswer3 did not exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }
            }
        }else if(answer2=="check"||(secondAnswer1=="big" && thirdAnswer1=="heart")){
            if(answer1=="1 card"){
                exist=oneCard(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="pair"){
                exist=pair(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="two pairs"){
                exist=twoPairs(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="three") {
                exist = threeOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="straight") {
                exist = straight(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="full"){
                exist=fullHouse(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="four") {
                exist = fourOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="flush") {
                exist = flush(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="royal flush"){
                exist=royalFlush(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }
        }else if(answer3=="check"||(secondAnswer2=="big" && thirdAnswer2=="heart")){
            if(answer2=="1 card"){
                exist=oneCard(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="pair"){
                exist=pair(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="two pairs"){
                exist=twoPairs(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="three") {
                exist = threeOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="straight") {
                exist = straight(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="full"){
                exist=fullHouse(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="four") {
                exist = fourOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="flush") {
                exist = flush(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards3 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="royal flush"){
                exist=royalFlush(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards3 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=true
                    player2Correct=true
                    player3Correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }
        }
        when {
            numberOfCards1>5 -> {
                println("$name1 has lost!")
                numberOfPlayers=2
                name1=name2
                numberOfCards1=numberOfCards2
                name2=name3
                numberOfCards2=numberOfCards3
            }
            numberOfCards2>5 -> {
                println("$name2 has lost!")
                numberOfPlayers=2
                name2=name3
                numberOfCards2=numberOfCards3
            }
            numberOfCards3>5 -> {
                println("$name3 has lost!")
                numberOfPlayers=2
            }

        }

        correct2 = false
        correct3 = false
        check = false
        answer1="1 card"
        secondAnswer1= ""
        thirdAnswer1 =""
        answer2 = "1 card"
        secondAnswer2 = ""
        thirdAnswer2 = ""
        answer3 ="1 card"
        secondAnswer3 =""
        thirdAnswer3 =""
        playingDeck.clear()
        player1.clear()
        player2.clear()
        player3.clear()
    }
    while (numberOfPlayers == 2){
        deck.shuffle()
        player1=addingCardsPlayer1(numberOfCards1, deck)// player1 deck
        player2=addingCardsPlayer2(numberOfCards2, deck)// player2 deck
        while(answer1 != "check" && answer2 != "check"  ) {
            while (!correct) //player1 decision
            {
                while (!check) {
                    println("Your deck: $player1")
                    println("$name1: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer1 = readLine()!!.toString()
                    check = smallerSet(answer1, answer2)
                    if (!check) {
                        println("your set cannot be smaller then $answer2")
                    }
                }
                if (answer1 == "check") {
                    break
                } else if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "four") {
                    while (!correct2) {
                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "full") // decision player1
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer1)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer1 = readLine()!!.toString()
                        while (secondAnswer1 == thirdAnswer1) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer1 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer1)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    correct = true
                } else if (answer1 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer1)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                        correct = true
                    }
                } else if (answer1 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                        correct = true
                    }
                } else if (answer1 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer1 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer1)
                        if (!correct2) {
                            println("write correct word big or small")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer1 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer1)
                        if (!correct3) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    correct = true
                    if(secondAnswer1=="big" && thirdAnswer1=="heart"){
                        break
                    }
                }  else {
                    println("write correct name of set")
                    correct = false
                    check = false
                }
                if (answer1 == answer2) {
                    cardLevel1 = cardLevel(secondAnswer1)
                    cardLevel2 = cardLevel(secondAnswer2)
                    secondCardLevel1 = cardLevel(thirdAnswer1)
                    secondCardLevel2 = cardLevel(thirdAnswer2)

                    if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "straight" || answer1 == "four" || answer1 == "flush") {

                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer2 $secondAnswer2")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer2 $secondAnswer2")
                                correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                correct = true
                            }
                        }

                    } else if (answer1 == "full" || answer1 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer1 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                                correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }
                player2Correct = false

            }
            if (answer1 == "check"||(secondAnswer1=="big" && thirdAnswer1=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}

            while (!player2Correct) //player2 decison
            {
                while (!check) {
                    println("Your deck: $player2")
                    println("$name2: write what kind of set is in playing deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")
                    answer2 = readLine()!!.toString()
                    check = smallerSet(answer2, answer1)
                    if (!check) {
                        println("your set cannot be smaller then $answer1")
                    }
                }
                if (answer2 == "check") {
                    break
                }
                else if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "four") {
                    while (!correct2) {

                        println("of: (9, 10, jack, queen, king, ace)")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "two pairs") {
                    while (!correct2) {
                        println("write first pair:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write second pair")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your second pair cannot be identical to first")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "full") //decision player2
                {
                    while (!correct2) {
                        println("write three of kind:")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctCard(secondAnswer2)
                        if (!correct2) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    while (!correct3) {
                        println("write a pair:")
                        thirdAnswer2 = readLine()!!.toString()
                        while (secondAnswer2 == thirdAnswer2) {
                            println("your pair cannot be identical to your three of kind")
                            println("write second pair")
                            secondAnswer2 = readLine()!!.toString()
                        }
                        correct3 = correctCard(thirdAnswer2)
                        if (!correct3) {
                            println("write correct card(9, 10, jack, queen, king, ace")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "flush") {
                    while (!correct2) {
                        println("write color")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctColor(secondAnswer2)
                        if (!correct2) {
                            println("write correct color(heart, diamond, spade, club")
                        }
                    }
                    player2Correct = true
                } else if (answer2 == "straight") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    correct = true
                } else if (answer2 == "royal flush") {
                    while (!correct2) {
                        println("small or big? ( small from 9 to king, big from 10 to ace")
                        secondAnswer2 = readLine()!!.toString()
                        correct2 = correctBigOrSmall(secondAnswer2)
                        if (!correct2) {
                            println("write correct word(small or big")
                        }
                    }
                    while (!correct3) {
                        println("which color?")
                        thirdAnswer2 = readLine()!!.toString()
                        correct3 = correctColor(thirdAnswer2)
                        if (!correct3) {
                            println("write correct word(small or big")
                        }
                    }
                    if(secondAnswer2=="big" && thirdAnswer2=="heart"){
                        break
                    }
                    player2Correct = true
                } else {
                    println("write correct name of set")
                    player2Correct = false
                    check = false
                }
                if (answer2 == answer1) {
                    cardLevel1 = cardLevel(secondAnswer2)
                    cardLevel2 = cardLevel(secondAnswer1)
                    secondCardLevel1 = cardLevel(thirdAnswer2)
                    secondCardLevel2 = cardLevel(thirdAnswer1)

                    if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "straight" || answer2 == "four" || answer2 == "flush") {
                        when {
                            cardLevel1 == cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            cardLevel1 < cardLevel2 -> {
                                println("you must choose bigger set then $answer1 $secondAnswer1")
                                player2Correct = false
                                correct2 = false
                                check = false
                            }
                            else -> {
                                player2Correct = true
                            }
                        }
                    } else if (answer2 == "full" || answer2 == "royal flush") {
                        if (cardLevel1 < cardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        }
                    } else if (answer2 == "two pairs") {
                        if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) < firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                            player2Correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                        } else if (firstOrSecondPairIsBigger(cardLevel1, secondCardLevel1) == firstOrSecondPairIsBigger(
                                cardLevel2,
                                secondCardLevel2)
                        ) {
                            if (firstOrSecondPairIsSmaller(cardLevel1, secondCardLevel1) <= firstOrSecondPairIsSmaller(
                                    cardLevel2,
                                    secondCardLevel2)
                            ) {
                                println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                                player2Correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                            }
                        }
                    }

                }

                correct=false
            }
            if (answer2 == "check" || (secondAnswer2=="big" && thirdAnswer2=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}

            if (answer3 == "check"|| (secondAnswer3=="big" && thirdAnswer3=="heart")) {
                break
            }else{
                correct2 = false
                correct3 = false
                check = false}


        }


        playingDeck=playingDeck(player1, playingDeck)// adding player1 cards to playing deck
        playingDeck=playingDeck(player2, playingDeck)// adding player1 cards to playing deck



        if(answer1 == "check"||(secondAnswer3=="big" && thirdAnswer3=="heart")){
            if(answer2=="1 card"){
                exist=oneCard(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2  did not exists!")
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="pair"){
                exist=pair(secondAnswer2, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            } else if(answer2=="two pairs"){
                exist=twoPairs(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false

                }
            }else if(answer2=="three") {
                exist = threeOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2  did not exists!" )
                    correct=true
                    player2Correct=false

                }
            }else if(answer2=="straight") {
                exist = straight(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="full"){
                exist=fullHouse(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2  exists!" )
                    correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="four") {
                exist = fourOfKind(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="flush") {
                exist = flush(secondAnswer2, playingDeck)
                if (exist) {
                    numberOfCards1 += 1
                    println("$answer2 $secondAnswer2  exists!" )
                    correct=false
                } else {
                    numberOfCards2 += 1
                    println("$answer2 $secondAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }else if(answer2=="royal flush"){
                exist=royalFlush(secondAnswer2, thirdAnswer2, playingDeck)
                if(exist){
                    numberOfCards1 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 exists!" )
                    correct=false
                }else{
                    numberOfCards2 +=1
                    println("$answer2 $secondAnswer2 $thirdAnswer2 did not exists!" )
                    correct=true
                    player2Correct=false
                }
            }
        }else if(answer2=="check"||(secondAnswer1=="big" && thirdAnswer1=="heart")){
            if(answer1=="1 card"){
                exist=oneCard(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="pair"){
                exist=pair(secondAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            } else if(answer1=="two pairs"){
                exist=twoPairs(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="three") {
                exist = threeOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="straight") {
                exist = straight(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="full"){
                exist=fullHouse(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="four") {
                exist = fourOfKind(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="flush") {
                exist = flush(secondAnswer1, playingDeck)
                if (exist) {
                    numberOfCards2 += 1
                    println("$answer1 $secondAnswer1  exists!" )
                    correct=true
                    player2Correct=false
                } else {
                    numberOfCards1 += 1
                    println("$answer1 $secondAnswer1 did not exists!" )
                    correct=false
                }
            }else if(answer1=="royal flush"){
                exist=royalFlush(secondAnswer1, thirdAnswer1, playingDeck)
                if(exist){
                    numberOfCards2 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 exists!" )
                    correct=true
                    player2Correct=false
                }else{
                    numberOfCards1 +=1
                    println("$answer1 $secondAnswer1 $thirdAnswer1 did not exists!" )
                    correct=false
                }
            }
        }

        correct2 = false
        correct3 = false
        check = false
        answer1="1 card"
        secondAnswer1= ""
        thirdAnswer1 =""
        answer2 = "1 card"
        secondAnswer2 = ""
        thirdAnswer2 = ""
        playingDeck.clear()
        player1.clear()
        player2.clear()

        when {
            numberOfCards1>5 -> {
                numberOfPlayers=1
                println("$name2 win! $name2 is the best Bluffer!")
            }
            numberOfCards2>5 -> {
                numberOfPlayers=1
                println("$name1 win! $name1 is the best Bluffer!")
            }
        }
    }

}