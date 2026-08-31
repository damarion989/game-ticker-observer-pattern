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
