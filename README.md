# Bluff
A script that simulates a card game called Bluff
Instructions:
Bluff - a card game related to poker. The game is intended for 2 to 4 people.
The game uses one deck of 24 cards. In the first round of the game, each player is dealt one card, and the selected player starts the betting. During the auction, successive players try to predict the possible poker hand that will occur in the deck of all the cards dealt, based on the cards in their hand and reports from other players. If the next player believes that the latest report is not in fact, they may request a review. If the last application is correct, the checker loses the round, if not, the last bidder loses the round. After losing a round, the losing player collects cards, shuffles, deals, and the next player starts a new round - the player who last lost in all subsequent rounds will receive one more card. For this reason, the number of cards dealt increases in the following rounds, so the chance of rarer combinations is higher and higher.
The game is lost by the player who reaches the set card limit - in a game that holds 6, i.e. if you lost the round with 5 cards, you are out of the game. The player who remains alone in the game wins.

Priority of submissions
When reporting a sequence, its name and parameter should be provided. Parameters are either the value of the card or the colours.

A declaration is considered higher if it is older type, or equal to type and higher than more important parameter, or equal to type, more important parameter and older, less important parameter.
The seniority and required parameters of the request types

     big royal flush (color)
     small royal flush (color)
     flush (color)
     four of kind (color)
     full (value, value)
     big straight
     small straight
     three of kind (value)
     two pairs (value, value)
     pair (value)
     high card (value)

In the case of a full house, the most important parameter is the value representing three out of five cards. In the case of two pairs, the higher value is considered the more important parameter.

The priority of values and colors:

heart
diamond
spade
club

Values:

ace
king
queen
jack
ten
nine
