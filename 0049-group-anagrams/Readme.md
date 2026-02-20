Frequency Array (char[26]):   Stores the count of each letter 'a'-'z'.   We use char instead of int to save memory.

String.valueOf(count):   Converts the raw counts into a unique String ID.   This acts as the Key for our Map.

computeIfAbsent:       

Checks if a group (list) already exists for a fingerprint.
If not, it creates a new ArrayList on the fly.
Returns the list so we can add the current word in one line.
   
