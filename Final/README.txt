The Magical Zoo of Oz has three exhibits.

Each exhibit has different events going on throughout the day. New 
types of events are constantly being added so we need a way to add new events without
breaking existing code.
Each client can subscribe to an exhibit. Exhibits may have events added or 
removed and the schedule will be updated. Each time this happens the 
Exhibit either has a decorator added or removed.

Need functionality so each client can choose to subscribe to whatever 
exhibit they care about. So we'll make multiple instances of 
a client. One that subscribes to BEAR, one that subscribes to all three
If zoo admin adds or removes an event. The client will be notified and 
and the schedule will be updated and reprinted.

If we have time, we should pass time into the constructor of each
Exhibit event. If we're sadists we could implement a sort of the linked list
based on time.