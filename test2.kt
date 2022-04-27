
fun main(args: Array<String>){

var cardLevel1 = 0 // levels of cards
var cardLevel2 = 0
var secondCardLevel1 = 0
var secondCardLevel2 = 0
var correct:Boolean = false // checking if decision is correct
var correct2 =false // checking player write correct
var correct3=false // checking player write correct
var check = false // checking if set is not lower from before player set
var name1: String = "1" // player1 name
var name2: String = "2"// player2 name
var name3: String = "3"// player3 name
var name4: String = "4" // player4 name
    // below variable which you can change for testing players decision
var answer1: String = "royal flush" // player1 decision(choosing set of cards or decision of checking)
var secondAnswer1: String = "big" // (choosing which card is in 1 card, what pair, first pair from two pair, three of kind, small or big straight, three of kind from full, four of kind, color of flush, small or big royal flush)
var thirdAnswer1: String ="heart" //(second pair from two pairs, pair from full, flush(color) in royal flush)
var answer2: String = "full"// player2 decision(choosing set of cards or decision of checking)
var secondAnswer2: String = "ace" //(choosing which card is in 1 card, what pair, first pair from two pair, three of kind, small or big straight, three of kind from full, four of kind, color of flush, small or big royal flush)
var thirdAnswer2: String = "king" //(second pair from two pairs, pair from full, flush(color) in royal flush)
var answer3: String ="four"// player3 decision(choosing set of cards or decision of checking)
var secondAnswer3: String ="ace" // (choosing which card is in 1 card, what pair, first pair from two pair, three of kind, small or big straight, three of kind from full, four of kind, color of flush, small or big royal flush)
var thirdAnswer3:String ="" //(second pair from two pairs, pair from full, flush(color) in royal flush)
var answer4: String ="straight"// player4 decision(choosing set of cards or decision of checking)
var secondAnswer4: String = "small" //(choosing which card is in 1 card, what pair, first pair from two pair, three of kind, small or big straight, three of kind from full, four of kind, color of flush, small or big royal flush)
var thirdAnswer4: String = "" //(second pair from two pairs, pair from full, flush(color) in royal flush)
    while(answer1 != "check" && answer2 != "check" && answer3 != "check" && answer4 != "check") {
        while (!correct) //player1 decision
        {
            while(!check){
                println("$name1: write what kind of set is in plaiyng deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")

                check=smallerSet(answer1,answer4)
                if(!check){
                    println("your set cannot be smaller then $answer4")
                    break
                }
            }

            if (answer1 == "1 card" || answer1 == "pair" || answer1 == "three" || answer1 == "four") {
                while(!correct2){
                    println("of: (9, 10, jack, queen, king, ace)")

                    correct2 = correctCard(secondAnswer1)
                    if (!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                correct = true
            } else if (answer1 == "two pairs") {
                while(!correct2){
                    println("write first pair:")

                    correct2=correctCard(secondAnswer1)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                while(!correct3){
                    println("write second pair")
                    while(secondAnswer1 == thirdAnswer1){
                        println("your second pair cannot be identical to first")
                        println("write second pair")
                        secondAnswer1 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer1)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                    break}
                }
                correct = true
            } else if (answer1 == "full") // decision player1
            {
                while(!correct2)
                {
                    println("write three of kind:")
                    correct2=correctCard(secondAnswer1)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                    break}
                }
                while(!correct3){
                    println("write a pair:")
                    while(secondAnswer1 == thirdAnswer1){
                        println("your pair cannot be identical to ypur three of kind")
                        println("write second pair")
                        secondAnswer1 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer1)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break}
                }
                correct = true
            } else if (answer1 == "flush") {
                while(!correct2){
                    println("write color")
                    correct2=correctColor(secondAnswer1)
                    if(!correct2){
                        println("write correct color(heart, diamond, spade, club")
                        break}
                    correct = true}
            } else if (answer1 == "straight") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace")
                    correct2=correctBigOrSmall(secondAnswer1)
                    if(!correct2){
                        println("write correct word big or small")
                        break
                    }
                    correct = true
                }
            } else if (answer1 == "royal flush") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace")
                    correct2=correctBigOrSmall(secondAnswer1)
                    if(!correct2){
                        println("write correct word big or small")
                        break
                    }
                }
                while(!correct3){
                    println("which color?")
                    correct3=correctColor(thirdAnswer1)
                    if(!correct3){
                        println("write correct color(heart, diamond, spade, club")
                        break}
                }
                correct = true
            } else {
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
                            correct=false
                            correct2=false
                            check = false
                            break
                        }
                        cardLevel1 < cardLevel2 -> {
                            println("you must choose bigger set then $answer4 $secondAnswer4")
                            correct = false
                            correct2=false
                            check = false
                            break
                        }
                        else -> {
                            correct =true
                        }
                    }

                } else if ( answer1 == "full" || answer1 == "royal flush") {
                    if (cardLevel1 < cardLevel2) {
                        println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                        correct = false
                        correct2= false
                        correct3=false
                        check = false
                        break
                    } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                        println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }
                }else if( answer1 == "two pairs" ){
                    if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)<firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }else if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)==firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        if(firstOrSecondPairIsSmaller(cardLevel1,secondCardLevel1)<=firstOrSecondPairIsSmaller(cardLevel2,secondCardLevel2)){
                            println("you must choose bigger set then $answer4 $secondAnswer4 $thirdAnswer4")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                            break
                        }
                    }
                }

            }
        }
        correct=false
        correct2=false
        correct3=false
        check=false
        while (!correct) //player2 decison
        {
            while(!check){
                println("$name2: write what kind of set is in plaiyng deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")

                check=smallerSet(answer2,answer1)
                if(!check){
                    println("your set cannot be smaller then $answer1")
                    break
                }
            }
            if (answer2 == "1 card" || answer2 == "pair" || answer2 == "three" || answer2 == "four") {
                while(!correct2){

                    println("of: (9, 10, jack, queen, king, ace)")

                    correct2 = correctCard(secondAnswer2)

                    if (!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                correct=true
            } else if (answer2 == "two pairs") {
                while(!correct2){
                    println("write first pair:")

                    correct2=correctCard(secondAnswer2)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                while(!correct3){
                    println("write second pair")
                    while(secondAnswer2 == thirdAnswer2){
                        println("your second pair cannot be identical to first")
                        println("write second pair")
                        secondAnswer2 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer2)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break}
                }
                correct=true
            } else if (answer2 == "full") //decision player2
            {
                while(!correct2){
                    println("write three of kind:")

                    correct2 = correctCard(secondAnswer2)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace)")
                        break}
                }
                while(!correct3){
                    println("write a pair:")
                    while(secondAnswer2 == thirdAnswer2){
                        println("your pair cannot be identical to your three of kind")
                        println("write second pair")
                        secondAnswer2 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer2)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break}
                }
                correct=true
            } else if (answer2 == "flush") {
                while(!correct2){
                    println("write color")

                    correct2 = correctColor(secondAnswer2)
                    if(!correct2){
                        println("write correct color(heart, diamond, spade, club")
                        break}}
                correct=true
            } else if (answer2 == "straight") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace)")

                    correct2=correctBigOrSmall(secondAnswer2)
                    if(!correct2){
                        println("write correct word(small or big)")
                        break}
                }
                correct=true
            } else if (answer2 == "royal flush") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace)")

                    correct2=correctBigOrSmall(secondAnswer2)
                    if(!correct2){
                        println("write correct word(small or big)")
                        break}
                }
                while(!correct3){
                    println("which color?")

                    correct3=correctColor(thirdAnswer2)
                    if(!correct3){
                        println("write correct word(small or big")
                        break}
                }
                correct=true
            } else {
                println("write correct name of set")
                correct=false
                check=false
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
                            correct =false
                            correct2 = false
                            check = false
                            break
                        }
                        cardLevel1 < cardLevel2 -> {
                            println("you must choose bigger set then $answer1 $secondAnswer1")
                            correct =false
                            correct2 = false
                            check = false
                            break
                        }
                        else -> {
                            correct = true
                        }
                    }
                } else if ( answer2 == "full" || answer2 == "royal flush") {
                    if (cardLevel1 < cardLevel2) {
                        println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                        println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }
                } else if( answer2 == "two pairs" ){
                    if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)<firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                        }else if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)==firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                            if(firstOrSecondPairIsSmaller(cardLevel1,secondCardLevel1)<=firstOrSecondPairIsSmaller(cardLevel2,secondCardLevel2)){
                                println("you must choose bigger set then $answer1 $secondAnswer1 $thirdAnswer1")
                                correct = false
                                correct2 = false
                                correct3 = false
                                check = false
                                break
                            }
                        }
                }

            }
        }
        correct=false
        correct2=false
        correct3=false
        check = false
        while(!correct){
            while(!check){
                println("$name3: write what kind of set is in plaiyng deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")

                check=smallerSet(answer3,answer2)
                if(!check){
                    println("your set cannot be smaller then $answer2")
                    break
                }
            }
            if (answer3 == "1 card" || answer3 == "pair" || answer3 == "three" || answer3 == "four") {
                while(!correct2){
                    println("of: (9, 10, jack, queen, king, ace)")

                    correct2 = correctCard(secondAnswer3)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                    correct=true
                }

            } else if (answer3 == "two pairs") {
                while(!correct2){
                    println("write first pair:")

                    correct2=correctCard(secondAnswer3)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                while(!correct3){
                    println("write second pair:")
                    while(secondAnswer3 == thirdAnswer3){
                        println("your second pair cannot be identical to first")
                        println("write second pair")
                        secondAnswer3 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer3)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                correct = true
            } else if (answer3 == "full") // decision player3
            {while(!correct2){
                println("write three of kind:")

                correct2=correctCard(secondAnswer3)
                if(!correct2){
                    println("write correct card(9, 10, jack, queen, king, ace")
                    break
                }}
                while(!correct3){
                    println("write a pair:")
                    while(secondAnswer3 == thirdAnswer3){
                        println("your pair cannot be identical to your three of kind")
                        println("write second pair")
                        secondAnswer3 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer3)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }
                }
                correct = true
            } else if (answer3 == "flush") {
                while(!correct2){
                    println(" write color")

                    correct2=correctColor(secondAnswer3)
                    if(!correct2){
                        println("write correct color(heart, diamond, spade, club")
                        break
                    }
                }
                correct = true
            } else if (answer3 == "straight") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace")

                    correct2=correctBigOrSmall(secondAnswer3)
                    if(!correct2){
                        println("write correct word: big or small")
                        break
                    }
                }
                correct = true
            } else if (answer3 == "royal flush") {
                while(!correct2)
                { println("small or big? ( small from 9 to king, big from 10 to ace")

                    correct2=correctBigOrSmall(secondAnswer3)
                    if(!correct2){
                        println("write correct word: big or small")
                        break
                    }
                }
                while(!correct3){
                    println("which color?")

                    correct3=correctColor(thirdAnswer3)
                    if(!correct3){
                        println("write correct color(heart, diamond, spade, club")
                        break
                    }
                }
                correct = true
            }else {
                println("write correct name of set")
                correct=false
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
                            correct = false
                            correct2 = false
                            check=false
                            break
                        }
                        cardLevel1 < cardLevel2 -> {
                            println("you must choose bigger set then $answer2 $secondAnswer2")
                            correct= false
                            correct2 = false
                            check=false
                            break
                        }
                        else -> {
                            correct = true
                        }
                    }
                } else if ( answer3 == "full" || answer3 == "royal flush") {
                    if (cardLevel1 < cardLevel2) {
                        println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check=false
                        break
                    } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                        println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }
                } else if( answer3 == "two pairs" ){
                    if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)<firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }else if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)==firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        if(firstOrSecondPairIsSmaller(cardLevel1,secondCardLevel1)<=firstOrSecondPairIsSmaller(cardLevel2,secondCardLevel2)){
                            println("you must choose bigger set then $answer2 $secondAnswer2 $thirdAnswer2")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                            break
                        }
                    }
                }

            }
        }
        correct=false
        correct2=false
        correct3=false
        check=false
        while(!correct) {
            while(!check){
                println("$name4: write what kind of set is in plaiyng deck or check (1 card, pair, two pairs, three, straight, full, four, flush, royal flush")

                check=smallerSet(answer4,answer3)
                if(!check){
                    println("your set cannot be smaller then $answer3")
                    break
                }
            }
            if (answer4 == "1 card" || answer4 == "pair" || answer4 == "three" || answer4 == "four") // decision player4
            {
                while(!correct2){
                    println("of: (9, 10, jack, queen, king, ace)")

                    correct2=correctCard(secondAnswer4)
                    if(!correct2) {
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }}
                correct=true
            } else if (answer4 == "two pairs") {
                while(!correct2){
                    println("write first pair:")

                    correct2=correctCard(secondAnswer4)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }}
                while(!correct3){
                    println("write second pair:")
                    while(secondAnswer4 == thirdAnswer4){
                        println("your second pair cannot be identical to first")
                        println("write second pair")
                        secondAnswer4 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer4)
                    break}
                correct=true
            } else if (answer4 == "full") {
                while(!correct2){
                    println("write three of kind:")

                    correct2=correctCard(secondAnswer4)
                    if(!correct2){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }}
                while(!correct3){
                    println("write a pair:")
                    while(secondAnswer4 == thirdAnswer4){
                        println("your pair cannot be identical to your three of kind")
                        println("write second pair")
                        secondAnswer4 = readLine()!!.toString()
                    }
                    correct3=correctCard(thirdAnswer4)
                    if(!correct3){
                        println("write correct card(9, 10, jack, queen, king, ace")
                        break
                    }}
                correct = true
            } else if (answer4 == "flush") {
                while(!correct2){
                    println(" write color")

                    correct2=correctColor(secondAnswer4)
                    if(!correct2){
                        println("write correct color(heart, diamond, spade, club")
                        break
                    }}
                correct=true
            } else if (answer4 == "straight") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace")

                    correct2 = correctBigOrSmall(secondAnswer4)
                    if(!correct2){
                        println("write correct word: small or big")
                        break
                    }}
                correct = true
            } else if (answer4 == "royal flush") {
                while(!correct2){
                    println("small or big? ( small from 9 to king, big from 10 to ace")

                    correct2=correctCard(secondAnswer4)
                    if(!correct2){
                        println("write correct word: small or big")
                        break
                    }}
                while(!correct3){
                    println("which color?")
                    correct3=correctColor(thirdAnswer4)
                    if(!correct3){
                        println("write correct color(heart, diamond, spade, club")
                        break
                    } }
                correct = true
            } else {
                println("write correct name of set")
                correct=false
                check=false
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
                            correct = false
                            correct2 = false
                            check=false
                            break
                        }
                        cardLevel1 < cardLevel2 -> {
                            println("you must choose bigger set then $answer3 $secondAnswer3")
                            correct = false
                            correct2 = false
                            check=false
                            break
                        }
                        else -> {
                            correct= true
                        }
                    }
                } else if (answer4 == "full" || answer4 == "royal flush") {
                    if (cardLevel1 < cardLevel2) {
                        println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check= false
                        break
                    } else if (secondCardLevel1 < secondCardLevel2 && secondCardLevel1 == secondCardLevel2) {
                        println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                        correct = false
                        correct2=false
                        correct3=false
                        check=false
                        break
                    }
                }else if( answer4 == "two pairs" ){
                    if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)<firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                        correct = false
                        correct2 = false
                        correct3 = false
                        check = false
                        break
                    }else if(firstOrSecondPairIsBigger(cardLevel1,secondCardLevel1)==firstOrSecondPairIsBigger(cardLevel2,secondCardLevel2)){
                        if(firstOrSecondPairIsSmaller(cardLevel1,secondCardLevel1)<=firstOrSecondPairIsSmaller(cardLevel2,secondCardLevel2)){
                            println("you must choose bigger set then $answer3 $secondAnswer3 $thirdAnswer3")
                            correct = false
                            correct2 = false
                            correct3 = false
                            check = false
                            break
                        }
                    }
                }

            }
        }
        correct=false
        correct2=false
        correct3=false
        check = false
        break
    }
}