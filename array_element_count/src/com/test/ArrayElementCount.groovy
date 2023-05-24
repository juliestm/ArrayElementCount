package com.test

def array = [1, 4, 3, 2, 5, 2, 5, 6]

Map<Integer, Integer> counter = new HashMap<>()

for (int x : array) {
    int newValue = counter.getOrDefault(x, 0) + 1
    counter.put(x, newValue)
}

println(counter)