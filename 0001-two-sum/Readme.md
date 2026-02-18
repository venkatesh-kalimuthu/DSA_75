Brute force: 

approach: 2 loops (nested)
Time complexity: O(n^2)
Space Complexity: O(1)

effective approach: single loop + hashmap
Time complexity: O(n)
Space Complexity: O(n)

Notes:
Single map vs double map operation
Use Integer as we can't store null in primitive int. Because we can get null in below line

Integer complementIndex = map.get(comp);
