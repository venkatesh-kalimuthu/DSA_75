Total Space for Priority Queue Approach: $$O(N+K)$$. Since $$K$$ is usually much smaller than $$N$$ (e.g., $$K$$ is often a constant or a small fraction of $$N$$), this typically simplifies to $$O(N)$$.
 
Total Space for Bucket Sort Approach: $$O(N)$$ (for the frequency map) + $$O(N)$$ (for the buckets array references) + $$O(N)$$ (for all the numbers stored within the ArrayLists). This sums to $$O(N)$$.
 
Even though Bucket Sort creates $$N$$ individual ArrayList objects, the total memory footprint for storing the elements and the structure is still proportional to $$N$$. Each ArrayList object has a small, constant overhead, but the overall memory scales linearly with the number of elements it needs to manage.
 
In an asymptotic (Big O) sense, both approaches have a space complexity of $$O(N)$$.
 
The primary reason Bucket Sort is often preferred for this problem is its superior time complexity ($$O(N)$$ vs. $$O(N \log K)$$), not a significant advantage in space complexity.

to summarize:
You declare an array to hold references to List objects: List<Integer>[] buckets = new List[size];.
For each position in that array where you intend to store elements, you must create an actual, concrete List object: buckets[i] = new ArrayList<>();.
You cannot create a new List<>() because List is an interface.

**Also, we can't store null in int[] so we are using result ArrayList while iterating the buckets
 
