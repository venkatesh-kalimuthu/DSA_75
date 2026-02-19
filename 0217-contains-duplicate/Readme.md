Streams involve creating multiple objects behind the scenes (the pipeline, the Spliterator, context objects). A simple for loop translates almost directly to basic bytecode instructions with zero setup cost.
 
Java creates a new object for every step:

Head Object: An object representing Arrays.stream(nums).

Intermediate Operation Object: An object representing .distinct(). This object has to internally create its own HashSet to track duplicates.

Terminal Operation Object: An object representing .count().
