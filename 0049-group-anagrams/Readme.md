Frequency Array (char[26]):   Stores the count of each letter 'a'-'z'.   We use char instead of int to save memory.

String.valueOf(count):   Converts the raw counts into a unique String ID.   This acts as the Key for our Map.

computeIfAbsent:       

Checks if a group (list) already exists for a key.
If not, it creates a new ArrayList on the fly.
Returns the list so we can add the current word in one line.

 
### 🔍 Java Map Cheat Sheet
 
| Method | What it returns | Returns... |

| :--- | :--- | :--- |

| `map.values()` | All the values | `Collection<V>` |

| `map.keySet()` | All the keys | `Set<K>` |

| `map.entrySet()` | All Key-Value pairs | `Set<Map.Entry<K, V>>` |

| `entry.getKey()` | The key of that specific pair | `K` |

| `entry.getValue()` | The value of that specific pair | `V` |
 
#### 💡 Iterating with Lambda (Java 8+)

```java

map.forEach((key, value) -> { 

    System.out.println("Key: " + key + " Value: " + value); 

});

 
