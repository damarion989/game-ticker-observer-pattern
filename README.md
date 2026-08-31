## Phase 1 

A game event tracking system to illustrate the Observer design pattern. 
pattern in Java. The class `GameTicker` is a subject which tracks 
Automatically updates games and notifies all registered observers of updates. 
A mobile push notification, stadium display, and a social media bot. 
whenever a new update occurs.

## Phase 2

The Subject and Observer interfaces are separated from the notification system. 
Since they allow GameTicker to communicate with observers only via the 
Observe types, without having to know about specific 
Use the names of classes such as SocialMediaBot or StadiumDisplay.


## Phase 3 

The notifyObservers method iterates through the list of the observers with a for loop. 
On every iteration, it calls the method .update() on the current element of the for-each loop. 
Look for a person in the list. The variable in the loop is declared as an Observer, 
GameTicker doesn't need to know as a specific class, 
whether it be a MobilePushNotification.update(), a 
Whatever object it is, StadiumDisplay is a social media bot.StadiumDisplay, or a SocialMediaBot — it only knows that it is a bot for social media. 
