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
Whatever object it is, StadiumDisplay is a social media bot.StadiumDisplay, or a SocialMediaBot.

## Phase 4 

I'm using the Pull method here rather than Push. My Observer interface's 
update() method takes no parameters, which means GameTicker cannot hand 
data directly to the observers when it notifies them — it can only tell 
them that something happened. To actually get the data, each observer 
class (MobilePushNotification, StadiumDisplay, and SocialMediaBot) holds 
its own reference to the GameTicker it's watching, passed in through its 
constructor.

## Phase 5 
I'm using Pull, where the Subject just signals a change and each 
observer reaches back to get the data it needs, rather than Push, where 
the Subject sends the data directly. Switching to Push would mean 
changing update() to take a parameter, having notifyObservers() pass 
the latest update into that parameter, and removing the GameTicker 
reference from each observer since they wouldn't need to look anything 
up anymore.

